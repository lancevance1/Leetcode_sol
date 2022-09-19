package ArraryHashTable;

public class TrappingRainWater {
    //tc:o(n);sc:o(n)
//    public int trap(int[] height) {
//        int[] rightMax = new int[height.length];
//        int[] leftMax = new int[height.length];
//        int max = 0;
//        for (int i = 1; i < height.length; i++) {
//            max = Math.max(max, height[i - 1]);
//            leftMax[i] = max;
//        }
//        max = 0;
//        for (int i = height.length - 2; i > -1; i--) {
//            max = Math.max(max, height[i + 1]);
//            rightMax[i] = max;
//        }
//        int res = 0;
//        for (int i = 1; i < height.length - 1; i++) {
//            var tmp = Math.min(leftMax[i], rightMax[i]);
//            if (tmp > height[i]) {
//                res += tmp - height[i];
//            }
//        }
//        return res;
//    }
    //tc:o(n);sc:o(1)
    public int trap(int[] height) {
        int res = 0;
        int left = 0, right = height.length - 1;
        int lMax = 0, rMax = 0;
        while (left < right) {
            lMax = Math.max(lMax, height[left]);
            rMax = Math.max(rMax, height[right]);

            if (lMax < rMax) {
                res += lMax - height[left];
                left++;
            } else {
                res += rMax - height[right];
                right--;
            }
        }
        return res;
    }
}
