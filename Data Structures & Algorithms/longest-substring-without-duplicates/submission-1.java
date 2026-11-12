class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (window.contains(ch)) {
                window.remove(s.charAt(left));
                left++;
            }

            window.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
