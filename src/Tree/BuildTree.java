package Tree;

public class BuildTree {
    public TreeNode buildTree(Integer[] arr) {
        TreeNode[] tmp = new TreeNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                tmp[i] = new TreeNode(arr[i]);
            }
        }

        for (int i = arr.length; i > 1; i--) {
            if (i % 2 == 0) {
                tmp[i / 2 - 1].left = tmp[i - 1];
            } else {
                tmp[i / 2-1].right = tmp[i - 1];
            }
        }
        return tmp[0];
    }
}
