/**
 * 1695. Maximum Erasure Value
 * You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.
 *
 * Return the maximum score you can get by erasing exactly one subarray.
 *
 * An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,2,4,5,6]
 * Output: 17
 * Explanation: The optimal subarray here is [2,4,5,6].
 * Example 2:
 *
 * Input: nums = [5,2,1,2,5,2,1,2,5]
 * Output: 8
 * Explanation: The optimal subarray here is [5,2,1] or [1,2,5].
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 104
 */


import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue {

    public int maximumUniqueSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int temp = 0;
        int ans = -1;
        Set<Integer> set = new HashSet<>();
        while (i < n && j < n) {
            if (!set.contains(nums[j])) {
                set.add(nums[j]);
                temp = temp + nums[j];
                ans = Math.max(ans, temp);
                j++;

            } else {
                set.remove(nums[i]);
                temp = temp - nums[i];
                i++;
            }


        }
        return ans;
    }
}

