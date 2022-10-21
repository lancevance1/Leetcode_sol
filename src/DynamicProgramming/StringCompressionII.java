package DynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;

public class StringCompressionII {
    //tc:o(n^3);sc:o(n^2)
    class Solution {
        public int getLengthOfOptimalCompression(String s, int k) {
            int n = s.length();
            int[][] dp = new int[n + 1][k + 1];
            for (int[] x : dp) {
                Arrays.fill(x, n + 1);
            }
            dp[0][0] = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= i && j <= k; j++) {
                    if (j < k) dp[i][j + 1] = Math.min(dp[i - 1][j], dp[i][j + 1]);
                    int del = 0;
                    for (int l = i; l > 0; l--) {
                        if (s.charAt(l - 1) != s.charAt(i - 1)) {
                            if (++del > j) {
                                break;
                            }
                        } else {
                            dp[i][j] = Math.min(dp[l - 1][j - del] + len(i - l + 1 - del) + 1, dp[i][j]);
                        }
                    }
                }
            }
            HashMap<Integer,Integer>t=new HashMap();
            return dp[n][k];
        }

        public int len(int k) {
            if (k <= 1) return 0;
            else if (k > 1 && k < 10) return 1;
            else if (k >= 10 && k < 100) return 2;
            else return 3;
        }
    }
}
