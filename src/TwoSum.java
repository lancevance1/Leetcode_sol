import java.util.HashMap;

/**
 * Created by Lance on 2019/8/21.
 */
public class TwoSum {
    /**
     *  1. Two Sum
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     *
     * time: O(n)
     * space: O(n)
     *
     * @param nums
     * @param target
     * @return
     */
    //solution1 bruteforce time = O(n^2)
//    public static int[] twoSum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j< nums.length; j++){
//                if (target == nums[i]+nums[j]) {
//                    if(i != j ){
//                        return new int[]{i,j};
//                    }
//                }
//            }
//        }
//        return new int[]{};
//    }

    // solution2 hashmap
//    public static int[] twoSum(int[] nums, int target){
//        if (nums.length< 2 || nums == null){
//            return new int[]{-1,-1};
//        }
//
//        int[] res = new int[]{-1,-1};
//        HashMap<Integer,Integer> hmap = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            hmap.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//
//            if (hmap.containsKey(target-nums[i]) && hmap.get(target-nums[i]) != i){
//                res[0] = i;
//                res[1] = hmap.get(target-nums[i]);
//                break;
//
//            }
//        }
//        return res;
//    }


    //sol3 One-pass Hash Table 加入新元素前检查有没有解，所以不会有重复idex
    public static int[] twoSum(int[] nums, int target){
        if (nums.length< 2 || nums == null){
            return new int[]{-1,-1};
        }

        int[] res = new int[]{-1,-1};
        HashMap<Integer,Integer> hmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (hmap.containsKey(target-nums[i]) ){
                res[0] = i;
                res[1] = hmap.get(target-nums[i]);
                break;

            }

            hmap.put(nums[i], i);

        }
        return res;
    }
}
