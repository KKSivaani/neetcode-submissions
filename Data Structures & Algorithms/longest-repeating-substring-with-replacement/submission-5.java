
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // Expand window
            freq[ch - 'A']++;

            // Track highest frequency seen
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            // Shrink once if necessary
            if (right - left + 1 - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update longest length
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
