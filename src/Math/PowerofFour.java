package Math;

/**
 * 342. Power of Four
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 *
 * An integer n is a power of four, if there exists an integer x such that n == 4x.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 16
 * Output: true
 * Example 2:
 *
 * Input: n = 5
 * Output: false
 * Example 3:
 *
 * Input: n = 1
 * Output: true
 *
 *
 * Constraints:
 *
 * -231 <= n <= 231 - 1
 */



//2^n = 00010000 n-th bit should be 1, others are zeros
//2^n & 2^n - 1 ==0
public class PowerofFour {
//soln1: log(n)/log(4), tc: o(1), sc:o(1)
//    public boolean isPowerOfFour(int n) {
//        boolean ans = false;
//        double res = Math.log(n*1.0)/Math.log(4.0);
//        if (res%1 == 0)
//            ans = true;
//        return ans;
//    }

    //soln2: check if number is power of 2 then check if last digit is 6 or 4
//    public boolean isPowerOfFour(int n) {
//        boolean ans = false;
//        if(n==1)return true;
//        if((n%10 == 4 ||n%10 == 6)&& ((n & (n-1))==0))return true;
//        return ans;
//    }
    //soln3: check if number is power of 2 then check if number should be modular
    public boolean isPowerOfFour(int n) {
        boolean ans = false;
        if(n==1)return true;
        if((n % 3 == 1)&& ((n & (n-1))==0))return true;
        return ans;
    }
    //soln4: check if number is power of 2 then check if number bit and 0xaaaaaaaa should be zero
//    public boolean isPowerOfFour(int n) {
//        boolean ans = false;
//        if(n==1)return true;
//        if(((n&0xaaaaaaaa)==0)&& ((n & (n-1))==0)&&n>0)return true;
//        return ans;
//    }
}
