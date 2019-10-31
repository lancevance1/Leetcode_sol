/**
 * Created by Lance on 10/31/2019.
 */

/**
 * 35. Search Insert Position
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Example 1:
 *
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 *
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 *
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 *
 * Input: [1,3,5,6], 0
 * Output: 0
 *
 * time complexity: o(logn)
 * space complexity: o(1)
 */
public class SearchInsert {
    //soln 1
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1,mid;
        while (left < right){
            mid = (right - left)/2 + left + 1;
            if (nums[mid] < target){
                left = mid;
            }else {
                right = mid - 1;
            }
        }
        return right;



    }


//soln 2
//    public int searchInsert(int[] nums, int target) {
//        int left = 0, right = nums.length-1,mid;
//        if(target > nums[right])return right + 1;
//        while (left < right){
//            mid = (right - left)/2 + left ;
//            if (nums[mid] < target){
//                left = mid + 1;
//            }else {
//                right = mid ;
//            }
//        }
//        return right;
//
//
//
//    }


   // soln 3
//    public int searchInsert(int[] nums, int target) {
//        int left = 0, right = nums.length-1,mid;
//
//        while (left < right){
//            mid = (right - left)/2 + left ;
//            if(nums[mid] == target){
//                return mid;
//            }
//            else if (nums[mid] < target){
//                left = mid + 1 ;
//            }else {
//                right = mid;
//            }
//        }
//        //_target___left_target__left+1___target__
//        //
//        if(target <= nums[left])return left;
//        if(target <= nums[right])return right ;
//        else return right+1;
//
//
//
//
//    }
}
