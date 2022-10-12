package BinarySearch;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        // return linearSearch(nums);
        return binarySearch(nums);
    }

    //tc:o(n),sc:o(1)
    private int linearSearch(int[] nums) {
        if (nums.length == 1 || nums[0] > nums[1]) return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) return i;
        }
        return -1;
    }

    //tc:o(logn),sc:o(1)
    private int binarySearch(int[] nums) {
        if (nums.length == 1 || nums[0] > nums[1]) return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;

        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            //cannot write like this; nums[mid]<=nums[mid-1], since mid can be 0
            if (nums[mid + 1] <= nums[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
