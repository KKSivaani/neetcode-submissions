class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            int result = 0;
            while (n > 0) {
                int digit = n % 10;
                result += digit * digit;
                n = n / 10;
            }
            n = result;
            if (!set.add(result))
                return false;
        }
        return true;
    }
}
