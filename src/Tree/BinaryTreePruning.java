package Tree;

public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = pruneTree(root.left);
        TreeNode right = pruneTree(root.right);
        root.left = left;
        root.right = right;

        //only remove node when node is a leaf and root.val == 0.
        if (left == null && right == null && root.val == 0) {
            return null;
        }
        return root;
    }
}
