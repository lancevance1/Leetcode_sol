package Math;

/**
 * 172. Factorial Trailing Zeroes
 *
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * Example 2:
 *
 * Input: n = 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * Example 3:
 *
 * Input: n = 0
 * Output: 0
 *
 *
 * Constraints:
 *
 * 0 <= n <= 104
 */
public class FactorialTrailingZeroes {
//    public int trailingZeroes(int n) {
//        int res = 0;
//        long divisor = 5;
//        while (divisor <= n) {
//            res += n / divisor;
//            divisor *= 5;
//        }
//        return res;
//    }

    //tc:o(logn);sc:o(1)
    public int trailingZeroes(int n) {
        int zeroCount = 0;
        while (n > 0) {
            n /= 5;
            zeroCount += n;
        }
        return zeroCount;
    }
}
