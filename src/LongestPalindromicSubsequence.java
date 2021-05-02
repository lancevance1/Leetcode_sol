public class LongestPalindromicSubsequence {
    // dp longest common subsequence, TC:O(n^2), SC:O(n^2)
    public int longestPalindromeSubseq(String s) {
        int [][]dp = new int[s.length()+1][s.length()+1];
        for (int i = 1; i < s.length()+1; i++) {
            for (int j = 1;j < s.length()+1; j++) {
                if (s.charAt(i-1)==s.charAt(s.length()-j)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s.length()][s.length()];
    }
}
