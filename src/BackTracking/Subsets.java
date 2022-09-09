package BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return res;
    }

    List<List<Integer>> res = new ArrayList();
    LinkedList<Integer> track = new LinkedList<>();

    private void dfs(int[] nums, int x) {
        res.add(new LinkedList(track));
        for (int i = x; i < nums.length; i++) {
            track.add(nums[i]);
            dfs(nums, i + 1);
            track.removeLast();
        }
    }
}
