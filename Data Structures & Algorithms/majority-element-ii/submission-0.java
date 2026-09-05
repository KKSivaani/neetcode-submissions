class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> set = new HashSet<>(2);
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>nums.length/3) set.add(num);
        }

        List<Integer> ans = new ArrayList<>();
        for(int num:set){
            ans.add(num);
        }
        return ans;
    }
}