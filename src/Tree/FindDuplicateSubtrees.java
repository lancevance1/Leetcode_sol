package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateSubtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        List<TreeNode> res = new ArrayList();
        for (var c : map.keySet()) {
            if (map.get(c).freq > 1) {
                res.add(map.get(c).node);
            }
        }
        return res;
    }

    private class Helper {
        TreeNode node;
        int freq;

        Helper(TreeNode node,
               int freq) {
            this.node = node;
            this.freq = freq;
        }
    }

    HashMap<String, Helper> map = new HashMap();

    private String dfs(TreeNode node) {
        if (node == null) return "";
        var left = dfs(node.left);
        var right = dfs(node.right);
        String tmp = "(" + left + node.val+ right + ")";
        if (map.containsKey(tmp)) {
            map.get(tmp).freq++;
        } else {
            map.put(tmp, new Helper(node, 1));
        }
        return tmp;
    }
}
