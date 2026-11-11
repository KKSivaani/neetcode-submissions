class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> window = new HashSet<>();

        for(int i=0;i<n;i++){
            if(i-k>0){
                window.remove(nums[i-k-1]);
            }
            if(window.contains(nums[i])){
                return true;
            }
            window.add(nums[i]);
        }
        return false;
    }
}