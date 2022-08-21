package Tree;

public class AmountofTimeforBinaryTreetoBeInfected {
    int res = 0;
    int cStart = -1;

    public int amountOfTime(TreeNode root, int start) {
        dfs(root, 0, start);
        return res;
    }

    private int dfs(TreeNode node, int c, int start) {
        if (node == null) return 0;
        //preorder
        if (node.val == start) cStart = c;
        var left = dfs(node.left, c + 1, start);
        // inorder
        boolean isLeft = false;
        if (cStart != -1) {
            isLeft = true;
        }
        var right = dfs(node.right, c + 1, start);
        //postorder
        if (node.val == start) {
            res = Math.max(res, Math.max(left, right));
        }
        if (isLeft) {
            res = Math.max(res, cStart - c + right);
        } else {
            res = Math.max(res, cStart - c + left);
        }

        return Math.max(left, right) + 1;
    }
}
