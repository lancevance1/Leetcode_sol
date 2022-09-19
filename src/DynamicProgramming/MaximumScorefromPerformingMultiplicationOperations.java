package DynamicProgramming;

public class MaximumScorefromPerformingMultiplicationOperations {
    //tc:o(n^2);sc:o(n^2)
    public int maximumScore(int[] nums, int[] mul) {
        if (nums.length == 1) return mul[0] * nums[0];
        int sum = Integer.MIN_VALUE;
        int left = 0, right = nums.length - 1;
        int[][] dp = new int[mul.length + 1][mul.length + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] += dp[i - 1][0] + mul[i - 1] * nums[nums.length - i];
        }
        for (int i = 1; i < dp.length; i++) {
            dp[0][i] += dp[0][i - 1] + mul[i - 1] * nums[i - 1];
        }
        for (int i = 1; i <= mul.length; i++) {
            for (int j = 1; j <= mul.length; j++) {
                if (i + j - 1 >= mul.length) break;
                dp[i][j] = Math.max(dp[i][j - 1] + nums[j - 1] * mul[i + j - 1], dp[i - 1][j] + nums[nums.length - i] * mul[i + j - 1]);
                if (i + j == mul.length) {
                    sum = Math.max(sum, dp[i][j]);
                }
            }
        }
        sum = Math.max(sum, dp[mul.length][0]);
        sum = Math.max(sum, dp[0][mul.length]);
        return sum;
    }
}
