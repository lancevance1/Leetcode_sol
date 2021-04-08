import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumSubarray {
    // soln1: bruteforce, TC: O(n^2), SC: O(1)
//    public static int maxSubArray(int[] nums) {
//        int ans = Integer.MIN_VALUE;
//
//        for (int i = 0; i < nums.length; i++) {
//            int tmp = 0;
//            for (int j = i; j < nums.length; j++) {
//                tmp += nums[j];
//                ans = Math.max(ans, tmp);
//            }
//        }
//
//        return ans;
//    }
    // soln2 kadane alg, dynamic programming, Tc: O(n), Sc： O(1)
    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int tmp=0;
        for (int i = 0; i < nums.length; i++) {
                tmp+=nums[i];
                tmp = Math.max(nums[i],tmp); //局部最优解对应每个i
                ans = Math.max(ans, tmp);
        }

        return ans;
    }
}
