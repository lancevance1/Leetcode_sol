package Tree;

public class PathSumIII {
    //tc:o(n^2);sc:o(n)
    public int pathSum(TreeNode root, int t) {
        dfs2(root, (long) t);
        return res;
    }

    int res = 0;

    private void dfs2(TreeNode node, long t) {
        if (node == null) return;
        dfs(node, t);
        dfs2(node.left, t);
        dfs2(node.right, t);
    }

    private void dfs(TreeNode node, long t) {
        if (node == null) return;
        var tmp = t - (long) node.val;
        if (tmp == 0) {
            res++;
        }
        dfs(node.left, tmp);
        dfs(node.right, tmp);
    }
}
