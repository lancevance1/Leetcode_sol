package DynamicProgramming;

import java.util.Arrays;

public class CoinChangeII {
    //    // tc: o(amount*coins.length);sc:o(amount*coins.length)
//    public int change(int amount, int[] coins) {
//        int[][] dp = new int[amount + 1][coins.length + 1];
//        Arrays.fill(dp[0], 1);
//        for (int j = 1; j < amount + 1; j++) {
//            int x;
//            for (int i = 0; i < coins.length; i++) {
//                x = 0;
//                if (j - coins[i] >= 0) x = dp[j - coins[i]][i + 1];
//                dp[j][i + 1] = x + dp[j][i];
//            }
//        }
//        return dp[amount][coins.length];
//    }
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j < amount + 1; j++) {
                int x;
                x = 0;
                if (j - coins[i] >= 0) x = dp[j - coins[i]];
                dp[j] = x + dp[j];
            }
        }
        return dp[amount];
    }
}
