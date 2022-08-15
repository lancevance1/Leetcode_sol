package Tree;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeVerticalOrderTraversal {
    List<List<Integer>> res;
    public List<List<Integer>> verticalOrder(TreeNode root) {
        res = new LinkedList<>();
        dfs(new Helper(root, 0,0));
        for(int i=0;i<res.size();i++){
            Collections.sort(res.get(i)) ;
        }
        return res;
    }

    class Helper {
        TreeNode node;
        int index;
        int y;
        Helper(TreeNode node, int index,int y) {
            this.node = node;
            this.index = index;
            this.y=y;
        }
    }

    int min = 1, max = -1;

    private Helper dfs(Helper h) {
        if (h.node == null) return h;
        var left = dfs(new Helper(h.node.left, h.index - 1,h.y+1));
        var right = dfs(new Helper(h.node.right, h.index + 1,h.y+1 ));

            min = Math.min(min, h.index);

        int val = h.index - min;
        if (res.size() > val) {
            int size = res.get(val).size();

            if(size>h.y){
                res.get(val).add(h.y,h.node.val);
            }else{

            }

        } else {
            int t =val-res.size();
            for(int i=0;i<=t;i++){
                LinkedList<Integer> tmp = new LinkedList<>();
                res.add(tmp);
            }
            res.get(val).add(h.node.val);
        }
        return h;
    }
}
