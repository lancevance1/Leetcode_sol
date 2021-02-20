/**
 * 992. Subarrays with K Different Integers
 * Given an array A of positive integers, call a (contiguous, not necessarily distinct) subarray of A good if the number of different integers in that subarray is exactly K.
 *
 * (For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.)
 *
 * Return the number of good subarrays of A.
 *
 *
 *
 * Example 1:
 *
 * Input: A = [1,2,1,2,3], K = 2
 * Output: 7
 * Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2].
 * Example 2:
 *
 * Input: A = [1,2,1,3,4], K = 3
 * Output: 3
 * Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].
 *
 *
 * Note:
 *
 * 1 <= A.length <= 20000
 * 1 <= A[i] <= A.length
 * 1 <= K <= A.length
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubarrayswithKDifferentIntegers {
    //two sliding windows
        public int subarraysWithKDistinct(int[] A, int K) {
            int ans = 0;
            ans = atMostKDistinct(A, K) - atMostKDistinct(A, K - 1);
            return ans;
        }

        // calculate at most K distinct integers
        public int atMostKDistinct(int[] A, int K) {
            int ans = 0, sum = 0, i = 0, j = 0, n = A.length, counter = 0;
            Map<Integer, Integer> map = new HashMap<>();
            while ( j < n) {
                    if (!map.containsKey(A[j])) {
                        map.put(A[j], 1);
                        counter++;
                    } else {
                        map.put(A[j], map.get(A[j]) + 1);
                    }
                while (counter>K){
                    int temp = map.get(A[i]);
                    temp -= 1;
                    map.put(A[i], temp);
                    if (temp == 0) {
                        map.remove(A[i]);
                        counter--;
                    }
                    i++;
                }
                ans += j - i + 1;
                j++;
            }
            return ans;
        }
}
