class Solution {
    public int findDuplicate(int[] nums) {
       for(int i=0;i<nums.length;i++){
        int ele = Math.abs(nums[i]);
        if(nums[ele-1]<0){
            return ele;
        }
        nums[ele-1]= -nums[ele-1];
       }
       return -1;
    }
}
