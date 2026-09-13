class Solution {
    public int maxProfit(int[] prices) {
        int mini = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            mini = Math.min(mini, prices[i]);
            int currentProfit = prices[i] - mini;
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }
}
