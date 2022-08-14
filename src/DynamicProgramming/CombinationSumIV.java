package DynamicProgramming;

import java.util.Arrays;

public class CombinationSumIV {
    int count = 0;
    //tle
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        dfs(nums, target);
        return count;
    }

    private boolean dfs(int[] nums, int target) {
        if (0 == target) {
            count++;
        }
        if (0 > target) return true;

        for (int i = 0; i < nums.length; i++) {
            var res = dfs(nums, target - nums[i]);
            if (res) break;
        }

        return false;
    }
}
