/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TreeNode {
    int val, depth;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x;  }
}
class DiameterOfBinaryTree {
    int res = 0;

    int maxDepth(TreeNode root){
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        res = Math.max(rightDepth + leftDepth, res);
        return Math.max(rightDepth,leftDepth) + 1;


    }




    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);

        return res;
    }
}