package Greedy;

public class SplitArrayintoConsecutiveSubsequences {
    //tc:o(n);sc:o(n)
    public boolean isPossible(int[] nums) {
        // make all elements are postive
        for (int i = 0; i < nums.length; i++) {
            nums[i] += 1000;
        }
        int[] count = new int[2001], isConnect = new int[2001];
        for (var c : nums) {
            count[c]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (count[nums[i]] == 0) continue;
            if (isConnect[nums[i]] > 0) {
                count[nums[i]]--;
                isConnect[nums[i]]--;
                isConnect[nums[i] + 1]++;
            } else if (count[nums[i]] > 0 && count[nums[i] + 1] > 0 && count[nums[i] + 2] > 0) {
                count[nums[i]]--;
                count[nums[i] + 1]--;
                count[nums[i] + 2]--;
                isConnect[nums[i] + 3]++;
            } else {
                return false;
            }
        }
        return true;
    }
}
