class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int[] freq = new int[26];
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;

            int maxFreq = 0;
            for (int i = 0; i < 26; i++) {
                maxFreq = Math.max(maxFreq, freq[i]);
            }

            int window = right - left + 1;

            if (window - maxFreq > k) {
                char leftChar = s.charAt(left);
                freq[leftChar-'A']--;
                left++;
            } else {
                ans = Math.max(ans, window);
            }
        }
        return ans;
    }
}
