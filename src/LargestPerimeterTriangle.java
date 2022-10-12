import java.util.Arrays;

public class LargestPerimeterTriangle {
    // tc: o(nlogn), sc: o(1)
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; i--) {
            int tmp = isValid(nums[i], nums[i - 1], nums[i - 2]);
            if (tmp > 0) return tmp;
        }
        return 0;
    }

    private int isValid(int x, int y, int z) {
        if (x + y > z && x + z > y && y + z > x) {
            return x + y + z;
        }
        return 0;
    }
}
