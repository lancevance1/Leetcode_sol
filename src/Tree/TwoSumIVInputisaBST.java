package Tree;

import java.util.ArrayList;
import java.util.List;

public class TwoSumIVInputisaBST {
    public boolean findTarget(TreeNode root, int k) {
        dfs(root);
        int l = 0, r = list.size() - 1;
        while (l < r) {
            var tmp = list.get(l) + list.get(r);
            if (tmp == k) {
                return true;
            } else if (tmp > k) {
                r--;
            } else {
                l++;
            }
        }
        return false;
    }

    List<Integer> list = new ArrayList();

    private void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }
}
