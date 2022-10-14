import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lance on 10/17/2019.
 */
public class ThreeSumCloset {
    /**
     * 16. 3SumCloset
     * Given an array nums of n integers and an integer target,
     * find three integers in nums such that the sum is closest to target.
     * Return the sum of the three integers.
     * You may assume that each input would have exactly one solution.
     * <p>
     * Example:
     * Given array nums = [-1, 2, 1, -4], and target = 1.
     * <p>
     * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
     * <p>
     * time O(n^2)
     * space O(n)
     *
     * @param
     * @return
     */

    // write by myself
//        public static int threeSumClosest(int[] nums, int target) {
//
//
//            int res = 0;
//            int min = Integer.MAX_VALUE;
//            int actMin ;
//
//            Arrays.sort(nums);
//            //-4,-1,1,2
//            for (int i = 0; i < nums.length - 2; i++) {
//                int c = target - nums[i];
//                int left = i +1;
//                int right = nums.length-1;
//                while(left < right) {
//                    if(c == nums[left] + nums[right]) {
//                        // if diff is 0, return target.
//                        return target;
//                    }
//                    if (Math.abs(c - nums[left] - nums[right]) < min) {
//                        min = Math.abs(c - nums[left] - nums[right]);
//                        actMin = c - nums[left] - nums[right];
//                        res = target - actMin;
//
//                    }
//                    if(c > nums[left] + nums[right]){
//                        left++;
//                    }else{
//                        right--;
//                    }
//                }
//
//            }
//
//            return res;
//        }

//    public static int threeSumClosest(int[] nums, int target) {
//        int res = nums[0] + nums[1] + nums[nums.length - 1];
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-2; i++) {
//            //reset left pointer for each loop
//            int left = i + 1, right = nums.length - 1;
//            while (left < right){
//                int sum = nums[i] + nums[left] + nums[right];
//                if (sum > target){
//                    right--;
//                }else left++;
//                // find the minimum difference between target and current cum
//                if (Math.abs(sum - target) < Math.abs(res - target)){
//                    res = sum;
//                }
//            }
//        }
//        return res;
//    }

    //tc:o(n^2);sc:o(1)
    public int threeSumClosest(int[] nums, int t) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int tmp = t - nums[i];
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[r] < tmp) {
                    if (diff > Math.abs(tmp - nums[l] - nums[r])) {
                        res = nums[l] + nums[r] + nums[i];
                        diff = Math.abs(tmp - nums[l] - nums[r]);
                    }
                    l++;
                } else if (nums[l] + nums[r] > tmp) {
                    if (diff > Math.abs(tmp - nums[l] - nums[r])) {
                        res = nums[l] + nums[r] + nums[i];
                        diff = Math.abs(tmp - nums[l] - nums[r]);
                    }
                    r--;
                } else {
                    return nums[l] + nums[r] + nums[i];
                }
            }
        }
        return res;
    }


}
