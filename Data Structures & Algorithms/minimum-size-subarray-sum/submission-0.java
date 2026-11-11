class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = n+1;
        for(int i=0;i<n;i++){
            int sum = nums[i];
            if(sum>=target){
                return 1;
            }
            for(int j=i+1;j<n;j++){
                sum +=nums[j];
                if(sum>=target){
                    ans = Math.min(ans, j-i+1);
                }
            }
        }
        if(ans>n){
            return 0;
        }else{
            return ans;
        }
    }
}