class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1len = s1.length();
        int s2len = s2.length();
        if (s1len > s2len) {
            return false;
        }
        int[] s1Freq = new int[26];
        int[] winFreq = new int[26];

        for (char ch : s1.toCharArray()) {
            s1Freq[ch - 'a']++;
        }

        for (int i = 0; i < s1len; i++) {
            char s2ch = s2.charAt(i);
            winFreq[s2ch - 'a']++;
        }

        int left = 0;
        int right = s1len - 1;

        while (right < s2len) {
            if (Arrays.equals(s1Freq, winFreq)) {
                return true;
            }
            char chl = s2.charAt(left);
            winFreq[chl - 'a']--;
            left++;
            right++;
            if(right < s2len){
            char chr = s2.charAt(right);
            winFreq[chr - 'a']++;}
        }
        return false;
    }
}
