import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Lance on 2019/8/21.
 */
public class ThreeSum {
    /**
     * 15. 3Sum
     * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
     * Find all unique triplets in the array which gives the sum of zero.
     * Note:
     * The solution set must not contain duplicate triplets.
     * <p>
     * Example:
     * Given array nums = [-1, 0, 1, 2, -1, -4],
     * A solution set is:
     * [
     * [-1, 0, 1],
     * [-1, -1, 2]
     * ]
     * <p>
     * time O(n^2)
     * space O(logn)
     *
     * @param nums
     * @return
     */
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> res = new LinkedList<>();
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length-2; i++) {
//            int left = i + 1;
//            int right = nums.length-1;
//            int target = 0 - nums[i];
//            // eliminate duplicate answer
//            // e.g. in this case, sorted array is [-4,-1,-1,0,1,2]
//            // on the 2nd iteration, target = -1, range of pointed values is -1 to 2,
//            // and answer is [-1, 0, 1]. Then next iteration, target is still -1, and range of pointed
//            // values is 0 to 2, and answer is still [-1,0,1].
//            if (i > 0 && nums[i] == nums[i-1])continue;
//
//            while (left < right){
//                if (target == nums[left] + nums[right]){
//                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
//                    // this is another case to eliminate duplicate answer
//                    // e.g. sorted array is [-2,0,0,2,2]
//                    // target = -2, nums[left] = 0, nums[right] = 2
//                    // after pointers move next numbers, the answer remain same.
//                    while (left < right && nums[left] == nums[left + 1]) left++;
//                    while (left < right && nums[right] == nums[right - 1]) right--;
//                    left++;
//                    right--;
//                }else if (target < nums[left] + nums[right]){
//                    right --;
//                }else{
//                    left ++;
//                }
//
//
//            }
//        }
//        return res;
//    }

//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        if (nums.length<3)return ans;
//        Arrays.sort(nums);
//
//        for (int i = nums.length-1; i >1 ; i--) {
//            int left=0,right=i-1;
//            if (i<nums.length-1&&nums[i]==nums[i+1]){
//                continue;
//            }
//            while(left<right){
//                if (left>0&&nums[left]==nums[left-1]){
//                    left++;
//                    continue;
//                }
//                while(left<right&&nums[left]>-nums[i]-nums[right]){
//                    right--;
//                }
//                if(left<right&&nums[left]==-nums[i]-nums[right]){
//                    List<Integer> tmp = new ArrayList<>();
//                    tmp.add(nums[i]);
//                    tmp.add(nums[left]);
//                    tmp.add(nums[right]);
//                    ans.add(tmp);
//                }
//                left++;
//            }
//        }
//        return ans;
//    }
    //tc:o(n^2);sc:o(1)
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int t = 0;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            //skip duplicate nums[i] after checking if it is a possible solution.
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int tmp = t - nums[i];
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[r] < tmp) {
                    l++;
                } else if (nums[l] + nums[r] > tmp) {
                    r--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    //skip duplicate nums[r] after checking if it is a possible solution.
                    while (l < r && nums[r] == nums[r + 1]) r--;
                    //skip duplicate nums[l] after checking if it is a possible solution.
                    while (l < r && nums[l] == nums[l - 1]) l++;
                }
            }
        }
        return res;
    }

}
