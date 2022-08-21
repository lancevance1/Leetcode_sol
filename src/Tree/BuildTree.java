package Tree;

public class BuildTree {
    public TreeNode buildTree(Integer[] arr) {
        TreeNode[] tmp = new TreeNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                tmp[i] = new TreeNode(arr[i]);
            }
        }

//        for (int i = arr.length; i > 1; i--) {
//            if (i % 2 == 0) {
//                tmp[i / 2 ].left = tmp[i - 1];
//            } else {
//                tmp[i / 2].right = tmp[i - 1];
//            }
//        }
        for (int i = 0; 2*(i+1)-1<arr.length; i++){
            if(tmp[i]==null)continue;
            tmp[i].left=tmp[2*(i+1)-1];
            tmp[i].right=tmp[2*(i+1)];
        }

            return tmp[0];
    }
}
