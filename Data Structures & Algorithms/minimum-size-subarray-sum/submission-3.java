class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int ans = n + 1;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            while (sum >= target) {
                ans = Math.min(ans, i - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }
        return ans > n ? 0 : ans;
    }
}