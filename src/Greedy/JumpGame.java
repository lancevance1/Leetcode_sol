package Greedy;

/**
 * 55. Jump Game
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 * <p>
 * Input: nums = [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * 0 <= nums[i] <= 105
 */
public class JumpGame {
    //    public boolean canJump(int[] nums) {
//        int len = nums.length;
//        if (len == 1) return true;
//        int count = 0;
//        for (int i = len - 2; i > -1; i--) {
//            if (nums[i] == 0) {
//                count++;
//            } else {
//                if (nums[i] < 1 + count) {
//                    count++;
//                } else {
//                    count = 0;
//                }
//            }
//        }
//        return count == 0;
//    }
    //tc:o(n),sc:o(1)
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if (len == 1) return true;
        int count = 0; // the number of cannot jump to the end
        for (int i = len - 2; i > -1; i--) {
            // if nums[i]==0 or nums[i] < 1+count
            // case 1: [2,0,y] i=1
            // case 2: [2,0,0,0,y] i=0 nums[i]=[0,3] cannot jump until >= 4
            if (nums[i] < 1 + count) {
                count++;
            } else {
                count = 0;
            }
        }
        return count == 0;
    }
    //     public boolean canJump(int[] nums) {
    //     int n = nums.length;
    //     int farthest = 0;
    //     for (int i = 0; i < n - 1; i++) {
    //         // 不断计算能跳到的最远距离
    //         farthest = Math.max(farthest, i + nums[i]);
    //         // 可能碰到了 0，卡住跳不动了
    //         if (farthest <= i) {
    //             return false;
    //         }
    //     }
    //     return farthest >= n - 1;
    // }
}
