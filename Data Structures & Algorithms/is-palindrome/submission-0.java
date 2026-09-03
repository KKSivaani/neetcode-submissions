class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char ich = s.charAt(i);
            char jch = s.charAt(j);
            if (Character.isLetterOrDigit(ich)) {
                if (Character.isLetterOrDigit(jch)) {
                    if (Character.toLowerCase(ich) == Character.toLowerCase(jch)) {
                        i++;
                        j--;
                    } else {
                        return false;
                    }
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return true;
    }
}
