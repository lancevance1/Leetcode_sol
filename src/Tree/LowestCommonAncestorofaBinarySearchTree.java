package Tree;

public class LowestCommonAncestorofaBinarySearchTree {
    //tc:o(n);sc:o(1)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            var tmp = p;
            p = q;
            q = tmp;
        }
        while (root != null) {
            if ((root.val < q.val && root.val > p.val) || root.val == p.val || root.val == q.val) return root;
            if (root.val < p.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }

        return root;
    }

    //tc:o(n);sc:o(n)
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        TreeNode res;
//        if (p.val < q.val) {
//            res = dfs(root, p, q);
//        } else {
//            res = dfs(root, q, p);
//        }
//        return res;
//    }
//
//    private TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
//        if (root == null) return null;
//        if (root.val > p.val && root.val < q.val) return root;
//        if (root.val == q.val) return root;
//        if (root.val == p.val) return root;
//        TreeNode node = null;
//        if (root.val < p.val) {
//            node = dfs(root.right, p, q);
//        }
//        if (root.val > q.val) {
//            node = dfs(root.left, p, q);
//        }
//        return node;
//    }
}
