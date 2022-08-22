package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//tc:o(mn);sc:o(mn)
public class PrintBinaryTree {
    String[][] map;
    int height;

    public List<List<String>> printTree(TreeNode root) {
        this.height = dfs(root) - 1;
        int m = height + 1;
        // int n=(int)Math.pow(2,m)-1;
        int n = (1 << m) - 1;
        this.map = new String[m][n];
        for (var row : map)
            Arrays.fill(row, "");
        dfs2(root, 0, (n - 1) / 2);
        List<List<String>> res = new ArrayList();
        List<String> list = new ArrayList();
        for (String[] c : map) {
            list = Arrays.asList(c);
            res.add(list);
        }
        return res;
    }
    //find height of tree
    private int dfs(TreeNode root) {
        if (root == null) return 0;
        var left = dfs(root.left);
        var right = dfs(root.right);
        return Math.max(left, right) + 1;
    }
    // traverse tree and build matrix by following instruction
    private void dfs2(TreeNode root, int r, int c) {
        if (root == null) return;
        map[r][c] = String.valueOf(root.val);
        // int tmp = (int)Math.pow(2,this.height-r-1);
        int tmp = (1 << this.height - r - 1);
        dfs2(root.left, r + 1, c - tmp);
        dfs2(root.right, r + 1, c + tmp);

    }
}
