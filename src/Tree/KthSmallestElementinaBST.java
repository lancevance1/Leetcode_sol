package Tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 230. Kth Smallest Element in a BST:
 * <p>
 * Given the root of a binary search tree, and an integer k,
 * return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
 * Example 1:
 * 3
 * / \
 * 1   4
 * \
 * 2
 * <p>
 * Input: root = [3,1,4,null,2], k = 1
 * Output: 1
 * <p>
 * Constraints:
 * The number of nodes in the tree is n.
 * 1 <= k <= n <= 104
 * 0 <= Node.val <= 104
 * <p>
 * Follow up: If the BST is modified often (i.e., we can do insert and delete operations)
 * and you need to find the kth smallest frequently, how would you optimize?
 */

public class KthSmallestElementinaBST {
    //iterative: TC:O(h+k), h for height of tree; SC:O(h)
    public class Guide {
        int opt; //0, add; 1, others;
        TreeNode node;

        Guide(int opt, TreeNode node) {
            this.opt = opt;
            this.node = node;
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        int res = -1;
        Deque<Guide> dq = new LinkedList();
        dq.add(new Guide(0, root));
        while (!dq.isEmpty()) {
            Guide guide = dq.removeFirst();
            if (guide.node == null) continue;

            if (guide.opt == 0) {
                dq.addFirst(new Guide(0, guide.node.right));
                dq.addFirst(new Guide(1, guide.node));
                dq.addFirst(new Guide(0, guide.node.left));
            } else {
                k--;
                if (k == 0) {
                    return guide.node.val;
                }
            }
        }
        return res;
    }

//    int res = -1;
//    int l;
//
//    public int kthSmallest(TreeNode root, int k) {
//        l = k;
//        traverse(root);
//        return res;
//    }
//
//    private void traverse(TreeNode root) {
//        if (root == null || res != -1) {
//            return;
//        }
//        traverse(root.left);
//        l--;
//        if (l == 0 && res == -1) {
//            res = root.val;
//        }
//        traverse(root.right);
//    }
}
