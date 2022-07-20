public class BinarySearch {
    // tc: o(logn), sc:o(1)
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int res = -1;
        if (nums[left] == target) return left;
        if (nums[right] == target) return right;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            if (nums[mid] > target) right = mid - 1;
        }
        return res;
    }

}
