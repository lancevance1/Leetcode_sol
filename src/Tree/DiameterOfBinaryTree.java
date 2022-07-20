package Tree;

/**
 * Definition for a binary tree node.
 * public class Tree.TreeNode {
 * int val;
 * Tree.TreeNode left;
 * Tree.TreeNode right;
 * Tree.TreeNode(int x) { val = x; }
 * }
 */

public class DiameterOfBinaryTree {
    int res = 0;

    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        res = Math.max(rightDepth + leftDepth, res);
        return Math.max(rightDepth, leftDepth) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return res;
    }
}