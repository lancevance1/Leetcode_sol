package BackTracking;

import java.util.*;

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        this.map = new int[nums.length];
        dfs(nums);
        return res;
    }

    List<List<Integer>> res = new ArrayList();
    LinkedList<Integer> track = new LinkedList();
    int[] map;

    private void dfs(int[] nums) {
        if (track.size() == nums.length) {
            res.add(new LinkedList(track));
        }
        int pre = Integer.MAX_VALUE; //local variable to handle same layer nodes.
        for (int i = 0; i < nums.length; i++) {
            if (map[i] == 1) continue;
            if (pre == nums[i]) continue;
            map[i] = 1;
            track.add(nums[i]);
            pre = nums[i];
            dfs(nums);
            track.removeLast();
            map[i] = 0;
        }
    }
}
