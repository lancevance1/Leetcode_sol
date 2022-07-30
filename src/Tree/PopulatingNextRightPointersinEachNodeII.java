package Tree;

import java.util.Deque;
import java.util.LinkedList;

public class PopulatingNextRightPointersinEachNodeII {
    public Node connect(Node root) {
        if (root == null) return null;
        Deque<Node> dq = new LinkedList<>();
        dq.add(root);
        while (!dq.isEmpty()) {
            int size = dq.size();
            for (int i = 0; i < size; i++) {
                Node node = dq.removeFirst();
                if (node.left != null)
                    dq.addLast(node.left);
                if (node.right != null)
                    dq.addLast(node.right);
                if (i < size - 1) {
                    node.next = dq.peek();
                }
            }
        }
        return root;
    }
    
}
