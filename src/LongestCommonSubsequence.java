import java.util.Arrays;

public class LongestCommonSubsequence {
    //soln1 dp TC:O(mn), SC:O(mn)
//    public int longestCommonSubsequence(String text1, String text2) {
//        int [][]dp = new int[text1.length()+1][text2.length()+1];
//        for (int i = 1; i < text1.length()+1; i++) {
//            for (int j = 1; j < text2.length()+1; j++) {
//                if (text1.charAt(i-1)==text2.charAt(j-1)){
//                    dp[i][j] = 1 + dp[i - 1][j - 1];
//                }else {
//                    dp[i][j]=Math.max(Math.max(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]);
//                }
//            }
//        }
//        return dp[text1.length()][text2.length()];
//    }

    //soln2, dp with 2 arrays, TC:O(mn), SC:O(2min(m,n))
    public int longestCommonSubsequence(String text1, String text2) {

        //choose the shortest string as a row array.
        if (text1.length() > text2.length()) {
            String tmp = text1;
            text1 = text2;
            text2 = tmp;
        }

        int cur[] = new int[text1.length() + 1];
        int pre[] = new int[text1.length() + 1];

        for (int j = 1; j < text2.length() + 1; j++) {
            for (int i = 1; i < text1.length() + 1; i++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    cur[i] = 1 + pre[i - 1];
                } else {
                    cur[i] = Math.max(cur[i - 1], pre[i]);
                }
            }
            pre = Arrays.copyOf(cur, cur.length); //pass by value
        }
        return pre[text1.length()];
    }

}
