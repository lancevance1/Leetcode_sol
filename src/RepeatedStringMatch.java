/**]
 * 686. Repeated String Match
 * Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.
 *
 * Notice: string "abc" repeated 0 times is "",  repeated 1 time is "abc" and repeated 2 times is "abcabc".
 *
 *
 *
 * Example 1:
 *
 * Input: a = "abcd", b = "cdabcdab"
 * Output: 3
 * Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.
 * Example 2:
 *
 * Input: a = "a", b = "aa"
 * Output: 2
 * Example 3:
 *
 * Input: a = "a", b = "a"
 * Output: 1
 * Example 4:
 *
 * Input: a = "abc", b = "wxyz"
 * Output: -1
 *
 *
 * Constraints:
 *
 * 1 <= a.length <= 104
 * 1 <= b.length <= 104
 * a and b consist of lower-case English letters.
 */


public class RepeatedStringMatch {
    //soln1: naive solution with rotation. tc: o(n*m), sc: o(1)
//    public int repeatedStringMatch(String a, String b) {
//        int ans = 1,count=0;
//        int n = a.length(), m = b.length();
//
//        int i = 0, j = 0, k=0;
//        while(i<n&&j<m){
//            if (a.charAt(i+j-count*n)==b.charAt(j)){
//                j++;
//                if ((i+j)%n==0&&j!=m){
//                    ans++;
//                    count++;
//                }
//            }else{
//                j=0;
//                i++;
//                count=0;
//                ans=1;
//            }
//            if(i==n)return -1;
//            if(j==m){
//                break;
//            }
//        }
//        return ans;
//    }

    //soln2 kmp
    public int repeatedStringMatch(String a, String b) {
        int ans = -1,count=1;
        int n = a.length(), m = b.length();
        int[] arr = computePai(b);

        int j =0;
        for (int i = 0; ; i++) {
            //---------------------
            if(i==n){
                i%=n;
                count++;
            }
            //---------------------

            while(a.charAt(i)!=b.charAt(j)){
                if(j==0){

                    break;
                }
                j=arr[j-1];


            }
            //---------------------
            if((count-1)*n+i-j>=n){
                break;
            }
            //---------------------
            if(a.charAt(i)==b.charAt(j)){
                j++;
            }
            if(j==m){
                return count;
            }
        }
        return ans;
    }

    public int[] computePai(String pattern) {
        int n = pattern.length();
        int[] arr = new int[n];
        arr[0] = 0;
        int j = 0;
        for (int i = 1; i < n; i++) {
            while (pattern.charAt(i) != pattern.charAt(j)) {
                if(j==0)break;
                j = arr[j-1 ];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            arr[i]=j;
        }
            return arr;

    }
}
