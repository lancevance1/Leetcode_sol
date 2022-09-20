package DynamicProgramming;

public class MaximumLengthofRepeatedSubarray {
    //tc:o(mn);sc:o(mn)
    public int findLength(int[] c1, int[] c2) {
        int res = 0;
        int[][] dp = new int[c1.length + 1][c2.length + 1];
        for (int i = c1.length - 1; i > -1; i--) {
            for (int j = c2.length - 1; j > -1; j--) {
                if (c1[i] == c2[j]) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                }
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;
    }
}
