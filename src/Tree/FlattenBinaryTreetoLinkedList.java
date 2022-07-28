package Tree;

public class FlattenBinaryTreetoLinkedList {
    //TC:O(n),SC:O(n)
//    private TreeNode head;
//
//    public void flatten(TreeNode root) {
//        if (root == null) return;
//        // postorder
//        flatten(root.right);
//        flatten(root.left);
//        root.right = head;
//        root.left = null;
//        head = root;
//    }
//    public void flatten(TreeNode root) {
//        dfs(root);
//    }

    //TC:O(n),SC:O(n)
//    private TreeNode dfs(TreeNode root) {
//        if (root == null) return root;
//
//        TreeNode leftNode = dfs(root.left);
//        TreeNode rightNode = dfs(root.right);
//
//        root.left = null;
//        root.right = leftNode;
//        while (leftNode != null && leftNode.right != null) {
//            leftNode = leftNode.right;
//        }
//        if (leftNode != null) {
//            leftNode.right = rightNode;
//        } else {
//            root.right = rightNode;
//        }
//        return root;
//    }

//    private TreeNode dfs(TreeNode root) {
//        if (root == null) return root;
//
//        //return leaf node
//        if (root.left == null && root.right == null) return root;
//
//        TreeNode leftNode = dfs(root.left); //right most node of left subtree
//        TreeNode rightNode = dfs(root.right); // right most node of right subtree
//
//        TreeNode tmp = root.right;
//        if (root.left != null) {
//            root.right = root.left;
//        }
//        root.left = null;
//        if (leftNode != null)
//            leftNode.right = tmp;
//
//        //if right node is empty, return left node
//        return rightNode == null ? leftNode : rightNode;
//    }

    // tc:O(n),sc:O(1)
    public void flatten(TreeNode root) {
        // Handle the null scenario
        if (root == null) {
            return;
        }

        TreeNode node = root;
        while (node != null) {
            // If the node has a left child
            if (node.left != null) {

                // Find the rightmost node
                TreeNode rightmost = node.left;
                while (rightmost.right != null) {
                    rightmost = rightmost.right;
                }

                // rewire the connections
                rightmost.right = node.right;
                node.right = node.left;
                node.left = null;
            }

            // move on to the right side of the tree
            node = node.right;
        }
    }

}
