package DynamicProgramming;

public class BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {
        int k=2;
        int[][] dp = new int[k + 1][2];
        for (int i = 0; i < k + 1; i++) {
            dp[i][1] = -prices[0];
        }
        for (var price : prices) {
            for (int j = 1; j < k + 1; j++) {
                dp[j][0] = Math.max(dp[j][1] + price, dp[j][0]);
                dp[j][1] = Math.max(dp[j - 1][0] - price, dp[j][1]);
            }
        }
        return dp[k][0];
    }
}
