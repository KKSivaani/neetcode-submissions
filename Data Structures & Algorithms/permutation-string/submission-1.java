class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        int[] s1Freq = new int[26];
        int[] winFreq = new int[26];

        // Build frequencies for s1 and first window
        for (int i = 0; i < n; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            winFreq[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(s1Freq, winFreq)) {
            return true;
        }

        // Slide the window
        for (int right = n; right < m; right++) {
            winFreq[s2.charAt(right) - 'a']++;
            winFreq[s2.charAt(right - n) - 'a']--;

            if (Arrays.equals(s1Freq, winFreq)) {
                return true;
            }
        }

        return false;
    }
}
