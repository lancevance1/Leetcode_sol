import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
    // tc:o(n), sc:o(n)
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Deque<TreeNode> dq = new LinkedList();
        dq.offer(root);
        int count = 0;
        if(root==null)return res;
        while(dq.size()!=0){
            int l = dq.size();
            List<Integer> tmp = new LinkedList();
            for (int i = 0; i < l; i++) {
                TreeNode t;
                if(count%2==1){
                    t= dq.poll();
                }else{
                    t = dq.pollLast();
                }

                tmp.add(t.val);
                if(count%2==0) {
                    if(t.left!=null){
                        dq.offerFirst(t.left);
                    }
                    if(t.right!=null){
                        dq.offerFirst(t.right);
                    }
                }else{
                    if(t.right!=null){
                        dq.offer(t.right);
                    }
                    if(t.left!=null){
                        dq.offer(t.left);
                    }

                }


            }
            count++;
            res.add(tmp);
        }
        return res;
    }

    //soln2
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        if (root == null)
//            return result;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        boolean leftToRight = true;
//        while (!queue.isEmpty()) {
//            int levelSize = queue.size();
//            List<Integer> currentLevel = new LinkedList<>();
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode currentNode = queue.poll();
//
//                // add the node to the current level based on the traverse direction
//                if (leftToRight)
//                    currentLevel.add(currentNode.val);
//                else
//                    currentLevel.add(0, currentNode.val);
//
//                // insert the children of current node in the queue
//                if (currentNode.left != null)
//                    queue.offer(currentNode.left);
//                if (currentNode.right != null)
//                    queue.offer(currentNode.right);
//            }
//            result.add(currentLevel);
//            // reverse the traversal direction
//            leftToRight = !leftToRight;
//        }
//
//        return result;
//    }
}
