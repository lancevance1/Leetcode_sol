import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 209. Minimum Size Subarray Sum
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 *
 *
 *
 * Example 1:
 *
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * Example 2:
 *
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * Example 3:
 *
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 *
 *
 * Constraints:
 *
 * 1 <= target <= 10^9
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^5
 */

public class MinimumSizeSubarraySum {
    //soln 1: sliding windows, tc: o(n), sc: o(1)
        public int minSubArrayLen(int target, int[] nums) {
            int ans = 10000;
            int i = 0, j=0, sum =0;
            int n = nums.length;
            while(j < n ){
                    sum+=nums[j];
                    while(target <= sum){
                        sum-=nums[i];
                        ans = Math.min(ans, j-i+1);
                        i++;
                }
                j++;
            }
            if(i==0)return 0;
            return ans;
        }
        //soln 2 binary search
    //方法二：前缀和 + 二分查找
    //方法一的时间复杂度是 O(n^2)O(n
    //2
    // )，因为在确定每个子数组的开始下标后，找到长度最小的子数组需要 O(n)O(n) 的时间。如果使用二分查找，则可以将时间优化到 O(\log n)O(logn)。
    //
    //为了使用二分查找，需要额外创建一个数组 \text{sums}sums 用于存储数组 \text{nums}nums 的前缀和，其中 \text{sums}[i]sums[i] 表示从 \text{nums}[0]nums[0] 到 \text{nums}[i-1]nums[i−1] 的元素和。得到前缀和之后，对于每个开始下标 ii，可通过二分查找得到大于或等于 ii 的最小下标 \textit{bound}bound，使得 \text{sums}[\textit{bound}]-\text{sums}[i-1] \ge ssums[bound]−sums[i−1]≥s，并更新子数组的最小长度（此时子数组的长度是 \textit{bound}-(i-1)bound−(i−1)）。
    //
    //因为这道题保证了数组中每个元素都为正，所以前缀和一定是递增的，这一点保证了二分的正确性。如果题目没有说明数组中每个元素都为正，这里就不能使用二分来查找这个位置了。
    //
    //作者：LeetCode-Solution
    //链接：https://leetcode-cn.com/problems/minimum-size-subarray-sum/solution/chang-du-zui-xiao-de-zi-shu-zu-by-leetcode-solutio/
    //来源：力扣（LeetCode）
    //著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//    public int minSubArrayLen(int s, int[] nums) {
//        int n = nums.length;
//        if (n == 0) {
//            return 0;
//        }
//        int ans = Integer.MAX_VALUE;
//        int[] sums = new int[n + 1];
//        // 为了方便计算，令 size = n + 1
//        // sums[0] = 0 意味着前 0 个元素的前缀和为 0
//        // sums[1] = A[0] 前 1 个元素的前缀和为 A[0]
//        // 以此类推
//        for (int i = 1; i <= n; i++) {
//            sums[i] = sums[i - 1] + nums[i - 1];
//        }
//        for (int i = 1; i <= n; i++) {
//            int target = s + sums[i - 1];
//            int bound = Arrays.binarySearch(sums, target);
//            if (bound < 0) {
//                bound = -bound - 1;
//            }
//            if (bound <= n) {
//                ans = Math.min(ans, bound - (i - 1));
//            }
//        }
//        return ans == Integer.MAX_VALUE ? 0 : ans;
//    }

}
