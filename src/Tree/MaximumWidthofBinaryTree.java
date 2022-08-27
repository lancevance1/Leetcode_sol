package Tree;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumWidthofBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        long res = 0;
        Deque<Helper> dq = new LinkedList<>();
        dq.add(new Helper(1, root));
        while (dq.size() != 0) {
            int size = dq.size();
            //check head and last element in each level
            long min = dq.peekFirst().x;
            long max = dq.peekLast().x;
            for (int i = 0; i < size; i++) {
                var h = dq.removeFirst();
                long tmp;
                if (h.node.left != null) {
                    tmp = h.x * 2;
                    dq.addLast(new Helper(tmp - 1, h.node.left));
                }
                if (h.node.right != null) {
                    tmp = h.x * 2 + 1;
                    dq.addLast(new Helper(tmp - 1, h.node.right));
                }
            }
            res = Math.max(res, max - min + 1);
        }
        return (int) res;
    }

    private class Helper {
        long x;
        TreeNode node;

        Helper(long x,
               TreeNode node) {
            this.x = x;
            this.node = node;
        }
    }
}
