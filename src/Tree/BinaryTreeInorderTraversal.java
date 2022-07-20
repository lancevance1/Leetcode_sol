package Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public class Guide {
        int opt; //0, add; 1, others;
        TreeNode node;

        Guide(int opt, TreeNode node) {
            this.opt = opt;
            this.node = node;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
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
                res.add(guide.node.val);
            }
        }
        return res;
    }
}
