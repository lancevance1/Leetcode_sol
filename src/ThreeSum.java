import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Lance on 2019/8/21.
 */
public class ThreeSum {
    /** 15. 3Sum
     * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
     * Find all unique triplets in the array which gives the sum of zero.
     * Note:
     * The solution set must not contain duplicate triplets.
     *
     * Example:
     * Given array nums = [-1, 0, 1, 2, -1, -4],
     * A solution set is:
     * [
     *   [-1, 0, 1],
     *   [-1, -1, 2]
     * ]
     *
     * time O(n^2)
     * space O(n^2)
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            int left = i + 1;
            int right = nums.length-1;
            int target = 0 - nums[i];
            // eliminate duplicate answer
            // e.g. in this case, sorted array is [-4,-1,-1,0,1,2]
            // on the 2nd iteration, target = -1, range of pointed values is -1 to 2,
            // and answer is [-1, 0, 1]. Then next iteration, target is still -1, and range of pointed
            // values is 0 to 2, and answer is still [-1,0,1].
            if (i > 0 && nums[i] == nums[i-1])continue;

            while (left < right){
                if (target == nums[left] + nums[right]){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    // this is another case to eliminate duplicate answer
                    // e.g. sorted array is [-2,0,0,2,2]
                    // target = -2, nums[left] = 0, nums[right] = 2
                    // after pointers move next numbers, the answer remain same.
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }else if (target < nums[left] + nums[right]){
                    right --;
                }else{
                    left ++;
                }


            }
        }
        return res;
    }
}
