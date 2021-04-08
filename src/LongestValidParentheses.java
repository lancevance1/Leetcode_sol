import java.util.ArrayList;
import java.util.List;

public class LongestValidParentheses {
    //soln1 dp TC:O(n),SC:O(n)
//    public int longestValidParentheses(String s) {
////        int dp[]=new int[s.length()];
////        int ans=0,cost=0;
////        for (int i = 1; i <s.length() ; i++) {
////            if (s.charAt(i)==')'&&s.charAt(i-1)=='('){
////                if(i>1){
////                    dp[i]=dp[i-2]+2;
////                }else{
////                    dp[i]=2;
////                }
////
////            }else if (s.charAt(i)==')'&& i-1-dp[i-1]>=0&&s.charAt(i-1-dp[i-1])=='('){
////                if (i>1){
////                    if (i-2-dp[i-1]>=0){
////                        dp[i]=dp[i-2-dp[i-1]]+2+dp[i-1];
////                    }else{
////                        dp[i]=2+dp[i-1];
////                    }
////                }
////            }
////            else {
////                dp[i]=0;
////            }
////            ans=Math.max(ans,dp[i]);
////        }
////        return ans;
////    }


    //stack method TC: O(n), SC:O(n)
    //
    //
    public int longestValidParentheses(String s) {
        List<Integer> arr = new ArrayList<>();
        int ans=0,cost=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='('){
                arr.add(i+1);
            }else{
                if(arr.size()>0 && arr.get(arr.size() - 1)>0){
                    arr.remove(arr.size() - 1);
                }else{
                    arr.add(-i-1); //add index of ')'
                }
            }
            if (arr.size() - 1>=0){
                cost=i+1-Math.abs(arr.get(arr.size() - 1));
            }else{
                cost+=i+1;
            }
            ans=Math.max(ans,cost);

        }


        return ans;
    }
}
