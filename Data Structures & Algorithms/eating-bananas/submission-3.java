class Solution {
    public static int works(int[] piles, int k, int h) {
        for (int n : piles) {
            int nk = (int) Math.ceil((double) n / k);
            h = h - nk;
            if(h<0) return -1;
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for (int n : piles) {
            maxPile = Math.max(n, maxPile);
        }
        int start = 1;
        int end = maxPile;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int nh = works(piles, mid, h);
            if (nh >= 0) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
