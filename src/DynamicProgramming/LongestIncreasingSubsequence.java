package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    // tc:O(n^2);sc:O(n)
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
        }
        int res = 0;
        for (var c : dp) {
            res = Math.max(res, c);
        }
        return res;
    }
}
