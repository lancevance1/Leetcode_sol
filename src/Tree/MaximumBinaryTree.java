package Tree;

public class MaximumBinaryTree {
    //tc:o(n^2);sc:o(n)
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int left, int right) {
        if (left > right) return null;
        if (left == right) return new TreeNode(nums[left]);
        var tmp = findMax(nums, left, right);
        var node = new TreeNode(tmp[1]);
        node.right = dfs(nums, tmp[0] + 1, right);
        node.left = dfs(nums, left, tmp[0] - 1);
        return node;
    }

    private int[] findMax(int[] nums, int left, int right) {
        int max = -1, index = -1;
        for (int i = left; i <= right; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return new int[]{index, max};
    }
}
