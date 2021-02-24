/**
 * 35. Search Insert Position
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * Example 4:
 * <p>
 * Input: nums = [1,3,5,6], target = 0
 * Output: 0
 * Example 5:
 * <p>
 * Input: nums = [1], target = 0
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 */


public class SearchInsertPosition {
    //    //soln1: binary search 1, [left, right]
//    public int searchInsert(int[] nums, int target) {
//        int r = nums.length-1, l = 0, ans =0, m;
//       while(l<=r){
//            m = l + (r-l)/2;
//           if(nums[m] == target){
//                return m;
//           }else if (nums[m] < target){
//                l = m + 1;
//           }else{
//               r = m - 1;
//           }
//
//       }
//
//        return r+1;
//    }
//soln2: binary search 1, [left, right)
//    public int searchInsert(int[] nums, int target) {
//        int r = nums.length, l = 0, ans = 0, m;
//        while (l < r) {
//            m = l + (r - l) / 2;
//            if (nums[m] == target) {
//                return m;
//            } else if (nums[m] < target) {
//                l = m + 1;
//            } else {
//                r = m ;
//            }
//
//        }
//        return l;
//    }

    //soln3
    public int searchInsert(int[] nums, int target) {
        int k = 0, n = nums.length;
        if(nums[0]>target)return 0;
        for (int b = n/2; b >= 1; b /= 2) {
            while (k+b < n && nums[k+b] <= target) k += b;
        }
        if (nums[k] == target) {
// x found at index k
            return k;
        }
        return k+1;
    }

}
