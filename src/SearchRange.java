/**
 * Created by Lance on 10/31/2019.
 */

/**
 * 34. Find First and Last Position of Element in Sorted Array
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 *
 * time complexity: o(logn)
 * space complexity: o(1)
 */
public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[]{-1,-1};
        if(nums.length == 0)return arr;

        int left = 0, right = nums.length-1;
        while (left < right){
            int mid = (right-left)/2 + left;

            if (nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        if(nums[left] == target) {
            arr[0] = left;
        }
        right = nums.length-1;
        left = 0;
        while(left < right){
            int mid = (right - left)/2 + 1 + left;
            if (nums[mid]<=target){
                left = mid;
            }else{
                right = mid - 1;
            }

        }
        if(nums[right] == target){
            arr[1] = right;
        }


        return arr;
    }

//    public static int[] searchRange(int[] nums, int target) {
//        int [] result = new int [2];
//        result[0] = result[1] = -1;
//        if(nums.length == 0)
//            return result;
//
//        int st = 0, ed = nums.length-1,mid;
//        while(st < ed) {
//            // 寻找左边界
//            mid = (st + ed) / 2;
//            if (nums[mid] < target)  //保证st不会越过任何等于target的数
//            {
//                st = mid+1;  //如果当前的数小于我们需要查的数，继续逼近
//            } else {       //如果大于等于
//                ed = mid;
//            }
//        }
//        if(nums[st] != target)
//            return result;
//        result[0] = st;
//        // 寻找右边界
//        ed = nums.length-1;
//        while(st < ed)
//        {
//            mid = (st + ed)/2 + 1; //这里用+1是为了让mid偏向右边
//            if(nums[mid] > target)
//            {
//                ed = mid-1;
//            }
//            else{   //因为st已经确定了，所以这里实际上不会出现比target小的数了，这里实际就是A[mid] == target
//                st = mid;
//            }
//        }
//        result[1] = ed;
//        return result;
//    }
}
