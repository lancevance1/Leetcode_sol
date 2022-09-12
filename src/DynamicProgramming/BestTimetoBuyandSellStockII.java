package DynamicProgramming;

public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int[] dp = new int[2];
        dp[1] = -prices[0];
        for (var price : prices) {
            dp[0] = Math.max(dp[1] + price, dp[0]);
            dp[1] = Math.max(dp[0] - price, dp[1]);
        }
        return dp[0];
    }
}
