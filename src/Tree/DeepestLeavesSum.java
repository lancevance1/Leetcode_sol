package Tree;

import java.util.*;

public class DeepestLeavesSum {
    //tc:o(n),sc:o(n)
//    public int deepestLeavesSum(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        Deque<TreeNode> dq = new LinkedList<>();
//        dq.add(root);
//        while (dq.size() != 0) {
//            int size = dq.size();
//            int sum = 0;
//            for (int i = 0; i < size; i++) {
//                var tmp = dq.removeFirst();
//                sum += tmp.val;
//                if (tmp.left != null) dq.addLast(tmp.left);
//                if (tmp.right != null) dq.addLast(tmp.right);
//            }
//            list.add(sum);
//        }
//        return list.get(list.size() - 1);
//    }

    //tc:o(n);,sc:o(h)
    public int deepestLeavesSum(TreeNode root) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap();
        dfs(root, 0, map);
        return map.get(map.size() - 1);
    }

    private void dfs(TreeNode root, int h, Map<Integer, Integer> map) {
        if (root == null) return;
        map.put(h, map.getOrDefault(h, 0) + root.val);
        h++;
        dfs(root.left, h, map);
        dfs(root.right, h, map);
    }
}
