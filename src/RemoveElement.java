/**
 * 27. Remove Element
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Clarification:
 * <p>
 * Confused why the returned value is an integer but your answer is an array?
 * <p>
 * Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.
 * <p>
 * Internally you can think of this:
 * <p>
 * // nums is passed in by reference. (i.e., without making a copy)
 * int len = removeElement(nums, val);
 * <p>
 * // any modification to nums in your function would be known by the caller.
 * // using the length returned by your function, it prints the first len elements.
 * for (int i = 0; i < len; i++) {
 * print(nums[i]);
 * }
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2]
 * Explanation: Your function should return length = 2, with the first two elements of nums being 2.
 * It doesn't matter what you leave beyond the returned length. For example if you return 2 with nums = [2,2,3,3] or nums = [2,2,0,0], your answer will be accepted.
 * Example 2:
 * <p>
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3]
 * Explanation: Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4. Note that the order of those five elements can be arbitrary. It doesn't matter what values are set beyond the returned length.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 */
public class RemoveElement {
    //    public int removeElement(int[] nums, int val) {
//        //soln 1: using a counter to counter how many dupe elements and then minus them one by one.
//        // tc: o(n), sc: o(1)
//        int counter =0;
//
//        int n = nums.length;
//
//        if(n==0)return 0;
//        for (int i = 0; i < n-1; i++) {
//            if (nums[i] == val) {
//                counter++;
//            }
//            nums[i-counter+1]=nums[i+1];
//        }
//        if(nums[n-1] == val) {
//            counter++;
//        }else {
//            nums[n - 1 - counter] = nums[n - 1];
//        }
//
//        return nums.length-counter;
//    }
    public int removeElement(int[] nums, int val) {
        //soln 2: two pointers.
        // tc: o(n), sc: o(1)
        int i = 0;
        int n = nums.length;
        for (int j = 0; j < n; j++) {
            if (nums[j] == val) {
                continue;
            }
            nums[i] = nums[j];
            i++;
        }
        return i;
    }
}
