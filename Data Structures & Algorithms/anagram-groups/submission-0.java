class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charArr = s.toCharArray();
            int[] count = new int[26];
            for (char c : charArr) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int n : count) {
                sb.append(n).append('#');
            }
            String key = sb.toString();
            if (map.containsKey(key))
                map.get(key).add(s);
            else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }
        }
        return new ArrayList(map.values());
    }
}
