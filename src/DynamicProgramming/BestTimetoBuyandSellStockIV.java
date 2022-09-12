package DynamicProgramming;

public class BestTimetoBuyandSellStockIV {
//    public int maxProfit(int k, int[] prices) {
//        int[][][] dp = new int[prices.length + 1][k + 1][2];
//        for (int i = 0; i < k + 1; i++) {
//            dp[0][i][1] = Integer.MIN_VALUE;
//        }
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = 1; j < k + 1; j++) {
//                dp[i + 1][j][0] = Math.max(dp[i][j][1] + prices[i], dp[i][j][0]);
//                dp[i + 1][j][1] = Math.max(dp[i][j - 1][0] - prices[i], dp[i][j][1]);
//            }
//        }
//        return dp[prices.length][k][0];
//    }

    //tc:o(nk), sc:o(k)
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0) return 0;
        int[][] dp = new int[k + 1][2];
        k = Math.min(k, prices.length / 2);  //k cannot be larger than the half of total days.
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
