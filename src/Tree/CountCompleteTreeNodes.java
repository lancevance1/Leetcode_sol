package Tree;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        int leftVal = getLeft(root);
        int level = getLevel(leftVal);
        int rightVal = (1 << (level + 1)) - 1;

        while (leftVal <= rightVal) {
            int mid = (rightVal - leftVal) / 2 + leftVal;
            if (find(root, mid, level)) {
                leftVal = mid + 1;
            } else {
                rightVal = mid - 1;
            }
        }
        return rightVal;
    }

    private int getLevel(int val) {
        int res = -1;
        while (val != 0) {
            res++;
            val >>= 1;
        }
        return res;
    }

    private boolean find(TreeNode node, int val, int level) {
        int rev = reverse(val);
        int le = -1;
        while (node != null) {
            le++;
            rev >>= 1;
            if ((rev & 1) == 1) node = node.right;
            else node = node.left;
        }
        return le == level;
    }

    private int reverse(int x) {
        int b = 0;
        while (x != 0) {
            b <<= 1;
            b |= (x & 1);
            x >>= 1;
        }
        return b;
    }

    private int getLeft(TreeNode node) {
        int res = 1;
        while (node != null) {
            res <<= 1;
            node = node.left;
        }
        return res >> 1;
    }

//    public int countNodes(TreeNode root) {
//        TreeNode l = root, r = root;
//        // 沿最左侧和最右侧分别计算高度
//        int hl = 0, hr = 0;
//        while (l != null) {
//            l = l.left;
//            hl++;
//        }
//        while (r != null) {
//            r = r.right;
//            hr++;
//        }
//        // 如果左右侧计算的高度相同，则是一棵满二叉树
//        if (hl == hr) {
//            return (int)Math.pow(2, hl) - 1;
//        }
//        // 如果左右侧的高度不同，则按照普通二叉树的逻辑计算
//        return 1 + countNodes(root.left) + countNodes(root.right);
//    }
}
