package Tree;

public class LongestUnivaluePath {
    //tc:o(n);sc:o(n)
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return res;
        dfs(root, root.val);
        return res;
    }
    int res = 0;
    private int dfs(TreeNode node, int x) {
        if (node == null) return 0;
        var left = dfs(node.left, node.val);
        var right = dfs(node.right, node.val);
        res = Math.max(res, left + right);
        if (node.val != x) {
            return 0;
        }
        return 1 + Math.max(left, right);
    }
}
