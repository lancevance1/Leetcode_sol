package Tree;

public class TrimaBinarySearchTree {
//    public TreeNode trimBST(TreeNode root, int low, int high) {
//        return dfs(root, low, high);
//    }
//
//    private TreeNode dfs(TreeNode node, int low, int high) {
//        if (node == null) return null;
//        var left = dfs(node.left, low, high);
//        var right = dfs(node.right, low, high);
//        if (node != null) {
//            node.left = left;
//            node.right = right;
//        }
//        if (node != null && node.val < low) {
//            node = right;
//        }
//        if (node != null && node.val > high) {
//            node = left;
//        }
//        return node;
//    }

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;
        //剪枝放到前序可以减少遍历节点
        if (root.val > high) return trimBST(root.left, low, high);
        if (root.val < low) return trimBST(root.right, low, high);

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
