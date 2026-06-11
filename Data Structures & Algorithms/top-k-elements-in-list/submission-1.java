class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }
        // Queue<Integer> heap = new PriorityQueue<>((a, b) -> countMap.get(a) - countMap.get(b));
        // for (int key : countMap.keySet()) {
        //     heap.offer(key);
        //     if (heap.size() > k)
        //         heap.poll();
        // }
        // int[] ans = new int[k];
        // for (int i = 0; i < k; i++) {
        //     ans[i] = heap.poll();
        // }
        // return ans;

        // bucket sort approach
        int numsLength = nums.length;
        List<Integer>[] buckets = new List[numsLength + 1];
        for (int i = 0; i < numsLength + 1; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }
        int[] ans = new int[k];
        int index = 0;
        for (int i = numsLength; i > 0; i--) {
            for (int bucket : buckets[i]) {
                ans[index] = bucket;
                index++;
                if (index == k)
                    return ans;
            }
        }
        return ans;
    }
}
