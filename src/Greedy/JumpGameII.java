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

//    //tc:o(n);sc:o(1)
//    public int jump(int[] nums) {
//        int n = nums.length;
//        int end = 0, farthest = 0;
//        int jumps = 0;
//        for (int i = 0; i < n - 1; i++) {
//            farthest = Math.max(nums[i] + i, farthest);
//            if (end == i) {
//                jumps++;
//                end = farthest;
//            }
//        }
//        return jumps;
//    }

    public int jump(int[] nums) {
        /*
        贪心思想
        同样每次记录你能够跳到的最远距离 k

        0  1  2  3  4  5  6
        i
                 j
        假设从 0 起跳，最远能够跳到 3 位置，那么我们落脚到 1 2 3 位置，步数都是 1
        我们第 2 步可以从 1 2 3 之中任意一个点开始起跳，那么我们可以选择 1 2 3 中能跳得最远的点作为第二步的起跳点

        因为题目说了必定能够到达最后一个位置，这就是说
        0  1  2  3  4  5  6
        i
                 j
        不会存在 0 能够跳到的最远距离是 3，而 1 2 3 中能够跳到的最远距离也是 3，即无论怎么跳到跳不出 3 这个位置，这种情况是不存在的
        即 1 2 3 中必定存在一个位置能够跳出 3 这个位置，这样才能到达终点
        换成数组来看的话，即是不存在 nums = [3, 2, 1, 0, 1, 2, 3]，这种情况怎么跳都跳不出 3 位置

        我们使用 end 记录 0 位置的最远距离， 即 3
        使用 k 记录 1 2 3 位置能够跳的最远距离
        当 i 遍历到 end 的时候，我们需要将步数 step + 1，即开始一次新的起跳，然后将 end 更新为 k
        */

        int len = nums.length;
        if (len == 1) {
            return 0;
        }
        //记录能够到达的最远距离
        int k = 0;
        //步数
        int step = 0;
        //记录上一步 step 跳的最远距离
        int end = 0;
        for (int i = 0; i < len; i++) {
            //更新最大距离
            k = Math.max(k, i + nums[i]);
            /*
            0  1  2  3  4  5  6
            i
                     j
            比如第一步从 0 最远能够跳到 3, step = 1
            那么我们在遍历过程中发现在 1 2 3 中如果是 2 它的最远距离 k 能够跳到终点或终点后面，那么我们只需要 再加 1 步从 2 起跳就能到达终点
            因为我们是按照到 end 才进行步数 + 1，但是对于 2 位置来说，它的终点的 len - 1 之后的
            因此如果要提前返回的话，那么我们需要将 2 起跳的这一步加上，因此是 step + 1
            */
            if (k >= len - 1) {
                return step + 1;
            }
            /*
            我们什么时候需要步数 + 1？
            当到达上一步的最远距离的时候，那么意味着我们需要进行一次新的起跳，那么步数 + 1
            并且更新最远距离
            */
            if (end == i) {
                step++;
                end = k;
            }
        }
        return step;
    }

}
