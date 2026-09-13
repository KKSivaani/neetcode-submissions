class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int n = prices.length;
        int maxProfit = 0;

        while (sell < n) {
            if (prices[buy] < prices[sell]) {
                maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            } else {
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}
