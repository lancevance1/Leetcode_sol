package DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubsequence {
    //tc:o(mn);sc:o(mn)
//    public int longestCommonSubsequence(String text1, String text2) {
//        int[][] mem = new int[text1.length() + 1][text2.length() + 1];
//        for (var c : mem) {
//            Arrays.fill(c, -1);
//        }
//        return dp(text1, text2, 0, 0, mem);
//    }
//
//    public int dp(String text1, String text2, int i, int j, int[][] mem) {
//        if (i == text1.length() || j == text2.length()) {
//            mem[i][j] = 0;
//        }
//        if (mem[i][j] != -1) return mem[i][j];
//        if (text1.charAt(i) == text2.charAt(j)) {
//            mem[i][j] = 1 + dp(text1, text2, i + 1, j + 1, mem);
//        } else {
//            var tmp = 0;
//            tmp = Math.max(tmp, dp(text1, text2, i, j + 1, mem));
//            tmp = Math.max(tmp, dp(text1, text2, i + 1, j, mem));
//            // tmp = Math.max(tmp,dp(text1,text2,i+1,j+1,mem));
//            mem[i][j] = tmp;
//        }
//        return mem[i][j];
//    }

    public int longestCommonSubsequence(String text1, String text2) {
        char[] c1 = text1.toCharArray();
        char[] c2 = text2.toCharArray();
        int len1 = c1.length;
        int len2 = c2.length;
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = c1.length - 1; i > -1; i--) {
            for (int j = c2.length - 1; j > -1; j--) {
                if (c1[i] == c2[j]) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        return dp[0][0];
    }
}
