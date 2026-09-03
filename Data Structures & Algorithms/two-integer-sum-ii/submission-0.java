class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length -1;
        int currSum;
        while(i<=j){
            currSum = numbers[i]+numbers[j];
            if(currSum>target){
                j--;
            }else if(currSum<target){
                i++;
            }else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }
}
