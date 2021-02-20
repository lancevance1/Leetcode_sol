/**
 * 643. Maximum Average Subarray I
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.
 *
 * Example 1:
 *
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 *
 *
 * Note:
 *
 * 1 <= k <= n <= 30,000.
 * Elements of the given array will be in the range [-10,000, 10,000].
 */


public class MaximumAverageSubarrayI {
    // soln1: sliding window, caution: return double rather than int, negative elements may cause an incorrect answer.
        public double findMaxAverage(int[] nums, int k) {

            double ans = -Double.MAX_VALUE;
            double sum = 0;
            int i = 0, j = k;
            for(int l=0; l <k; l++){
                sum += nums[l];
            }
            ans = sum;
            while(j<nums.length){
                if(j - i < k) {
                    sum += nums[j];
                    j++;
                    ans = Math.max(ans,sum);
                }else{
                    sum-=nums[i];
                    i++;

                }


            }
            ans = ans/k;

            return ans;
        }
}
