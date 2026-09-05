class Solution {
    public int majorityElement(int[] nums) {
        int frequency = 0;
        int majority = nums[0];
        for (int num : nums) {
            if (frequency == 0) {
                majority = num;
            }
            if (majority == num) {
                frequency++;
            } else {
                frequency--;
            }
        }
        return majority;
    }
}