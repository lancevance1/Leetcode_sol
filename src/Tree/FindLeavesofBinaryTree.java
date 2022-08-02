package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 366. Find Leaves of Binary Tree
 *
 * Given the root of a binary tree, collect a tree's nodes as if you were doing this:
 *
 * Collect all the leaf nodes.
 * Remove all the leaf nodes.
 * Repeat until the tree is empty.
 *
 *
 * Example 1:
 *     1
 *   /  \      1
 *  2   3  => /   =>   1
 * /\        2
 *4  5
 *
 * Input: root = [1,2,3,4,5]
 * Output: [[4,5,3],[2],[1]]
 * Explanation:
 * [[3,5,4],[2],[1]] and [[3,4,5],[2],[1]] are also considered correct answers since per each level it does not matter the order on which elements are returned.
 * Example 2:
 *
 * Input: root = [1]
 * Output: [[1]]
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [1, 100].
 * -100 <= Node.val <= 100
 */
public class FindLeavesofBinaryTree {
    List<List<Integer>> res;
    //tc:O(n);sc:O(n)
    public List<List<Integer>> findLeaves(TreeNode root) {
        res = new ArrayList();
        dfs(root);
        return res;
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int height = 1 + Math.max(left, right);

        if (res.size() < height) {
            List<Integer> list = new ArrayList();
            list.add(root.val);
            res.add(list);
        } else {
            res.get(height - 1).add(root.val);
        }

        return height;
    }
}
