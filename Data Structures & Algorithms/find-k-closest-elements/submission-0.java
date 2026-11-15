class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int n = arr.length;
        int end = n - 1;

        int pos = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= x) {
                pos = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        int left = pos - 1;
        int right = pos;

        while (right - left - 1 < k) {
            if (left < 0) {
                right++;
            } else if (right >= n) {
                left--;
            } else if (x - arr[left] <= arr[right] - x) {
                left--;
            } else {
                right++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = left+1; i < right; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }
}