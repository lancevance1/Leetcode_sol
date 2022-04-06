import java.util.*;

public class NaryTreePreorderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    //recursive
//     public List<Integer> preorder(Node root) {
//         List<Integer> res =new ArrayList();
//         if(root==null)return new ArrayList();
//         dfs(root,res);
//         return res;
//     }

    //     private void dfs(Node root,List<Integer> res){
//         res.add(root.val);
//         if(root.children==null||root.children.size()==0){
//             return;
//         }
//         for(Node t: root.children){
//             dfs(t,res);
//         }
//     }
    //tc:o(n), sc:o(n)
    //stack push from right to left on each layer.
    public List<Integer> preorder(Node root) {
        List<Integer> res =new ArrayList();
        Stack<Node> stack = new Stack();
        if(root==null)return new ArrayList();
        stack.push(root);
        while(!stack.isEmpty()){
            Node tmp = stack.pop();
            res.add(tmp.val);
            if(tmp.children.size()==0)continue;
            for(int i=tmp.children.size()-1;i>-1;i--){
                stack.push(tmp.children.get(i));
            }
        }
        return res;
    }
}
