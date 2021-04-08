public class EditDistance {
    //soln1: Levenshtein distance TC:O(mn), SC: O(mn)
    //https://en.wikipedia.org/wiki/Levenshtein_distance
    public int minDistance(String word1, String word2) {
        int ans=Integer.MAX_VALUE;
        int diff=Math.abs(word1.length()-word2.length());
        int len = Math.min(word1.length(),word2.length());
        int  j=0, tmp=0;
        if(word1.length()==0)return diff;
        if(word2.length()==0)return diff;
        int dp[][] = new int[word1.length()+1][word2.length()+1];
        dp[0][0]=0;
        int cost=1;
        for (int i = 0; i < word1.length()+1; i++) {
            dp[i][0]=i;
        }
        for (int i = 0; i < word2.length()+1; i++) {
            dp[0][i]=i;
        }
        for (int i = 1; i < word1.length()+1; i++) {
            for (int k = 1; k < word2.length()+1; k++) {
                if(word1.charAt(i-1)==word2.charAt(k-1)){
                    cost = 0;
                }else {
                    cost=1;
                }
                dp[i][k]=Math.min(Math.min(dp[i-1][k-1]+cost,dp[i-1][k]+1),dp[i][k-1]+1);
            }
        }


        return dp[word1.length()][word2.length()];
    }
}
