class Solution {
    public int lengthOfLongestSubstring(String s) {

        int len = s.length();
        int left = 0;
        int ans = 0;
        Set<Character> set = new HashSet<>();

        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(set.add(ch)){
                ans = Math.max(ans,set.size());
            }else{
                while(s.charAt(left)!=ch){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(ch);
            }
        }

        return ans;
        
    }
}
