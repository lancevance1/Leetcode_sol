package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathSumII {
    //tc:o(n^2);sc:o(n)
    public List<List<Integer>> pathSum(TreeNode root, int t) {
        List<List<Integer>> res = new ArrayList();
        LinkedList<Integer> track = new LinkedList<>();
        dfs(root,res,track,t);
        return res;
    }

    private void dfs(TreeNode node, List<List<Integer>> res, LinkedList<Integer> track , int t){
        if(node==null)return;
        track.add(node.val);
        if(node.left==null&&node.right==null){
            if(node.val==t){
                // o(n) for each path;
                res.add(new LinkedList(track));
            }
            return;
        }
        for(int i=0;i<2;i++){
            var tmp = (i==0)?node.left:node.right;
            if(tmp==null)continue;
            dfs(tmp,res,track,t-node.val);
            track.removeLast();
        }
    }
}
