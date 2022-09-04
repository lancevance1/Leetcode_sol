package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class VerticalOrderTraversalofaBinaryTree {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList();
        //step 1
        resTemp = new ArrayList();
        dfs(root, 0, 0);
        //step 2
        Collections.sort(resTemp, (a, b) -> {
            if (a.col == b.col && a.row == b.row) {
                return a.val - b.val;
            }
            if (a.col == b.col) {
                return a.row - b.row;
            }
            return a.col - b.col;
        });

        //step 3
        List<Integer> curCol = new ArrayList();
        for (var c : resTemp) {
            if (c.col == min) {
                curCol.add(c.val);

            } else {
                res.add(curCol);
                min = c.col;
                curCol = new ArrayList();
                curCol.add(c.val);
            }
        }
        res.add(curCol);
        return res;
    }

    List<Helper> resTemp;
    int min = Integer.MAX_VALUE;

    private class Helper {
        int row;
        int col;
        int val;

        Helper(int row,
               int col,
               int val) {
            this.row = row;
            this.col = col;
            this.val = val;
        }
    }

    private void dfs(TreeNode node, int row, int col) {
        if (node == null) return;
        min = Math.min(min, col);
        resTemp.add(new Helper(row, col, node.val));
        dfs(node.left, row + 1, col - 1);
        dfs(node.right, row + 1, col + 1);
    }
}
