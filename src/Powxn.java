/**
 * 50. Pow(x, n)
 * Implement pow(x, n), which calculates x raised to the power n (i.e. xn).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 * Example 2:
 *
 * Input: x = 2.10000, n = 3
 * Output: 9.26100
 * Example 3:
 *
 * Input: x = 2.00000, n = -2
 * Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 *
 *
 * Constraints:
 *
 * -100.0 < x < 100.0
 * -231 <= n <= 231-1
 * -104 <= xn <= 104
 */
public class Powxn {
    //incorrect soln tc: o(n), sc: o(1) tle
//    public double myPow(double x, int n) {
//        double ans = 1.0;
//
//
//        for (int i = 0; i < Math.abs(n); i++) {
//            ans*=x*1.0;
//        }
//        if (n<0){
//            ans=1/ans;
//        }
//
//        return ans;
//    }

        // soln 2: similar with binary tree, tc: o(logn), sc:o(1)
        // since Interger range: -2^31-2^31-1(-2,147,483,648 to 2,147,483,647),
        // we can't use Math.abs(n) directly. Instead, we should use n/2.
//        public double myPow(double x, int n) {
//            double ans = 1.0;
//            if (n % 2 == 1) {
//                ans *= x;
//            }
//            ans = pow(x, Math.abs(n / 2));
//            ans *= ans;
//            if (Math.abs(n % 2) != 0) {
//                ans *= x;
//            }
//            if (n < 0) {
//                return 1 / ans;
//            }
//            return ans;
//        }
//
//        public double pow(double x, int n) {
//            double ans = 1.0;
//            if (n == 0) return 1;
//            if (n % 2 == 1) {
//                ans *= x;
//            }
//            n = n / 2;
//            x = pow(x, n);
//            ans *= x * x;
//            return ans;
//        }
//

    //soln 3, iterative tc: o(logn), sc: o(1)
        public double myPow(double x, int n) {
            double ans = 1.0;
            if (n==0)return 1;
            for (int i = n; i !=0; i/=2) {
                if (i % 2 != 0) {
                    ans *= x;
                }
                x*=x;

            }
            return n<0?1/ans:ans;
        }




}
