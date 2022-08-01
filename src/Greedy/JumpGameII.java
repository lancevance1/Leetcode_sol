package Greedy;

/**
 * 45. Jump Game II
 * Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Your goal is to reach the last index in the minimum number of jumps.
 *
 * You can assume that you can always reach the last index.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 *
 * Input: nums = [2,3,0,1,4]
 * Output: 2
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * 0 <= nums[i] <= 1000
 */
public class JumpGameII {
    //dp solution: tc:o(n^2);sc:o(n)
//    public int jump(int[] nums) {
//        int count = 0;
//        int len = nums.length;
//        int[] dp = new int[len];
//        if (len == 1) return count;
//        for (int i = len - 2; i > -1; i--) {
//            if (nums[i] + i >= len - 1) {
//                dp[i] = 1;
//            } else {
//                if (nums[i] == 0) {
//                    dp[i] = 0;
//                } else {
//                    //find the minimum dp from [i+1,i+nums[i]]
//                    int min = (int) 1e5;
//                    for (int j = 1 + i; j <= nums[i] + i; j++) {
//                        if (dp[j] == 0) continue;
//                        min = Math.min(min, dp[j]);
//                    }
//                    dp[i] = 1 + min;
//                }
//            }
//        }
//        return dp[0];
//    }

    //tc:o(n);sc:o(1)
    public int jump(int[] nums) {
        int n = nums.length;
        int end = 0, farthest = 0;
        int jumps = 0;
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(nums[i] + i, farthest);
            if (end == i) {
                jumps++;
                end = farthest;
            }
        }
        return jumps;
    }
}
