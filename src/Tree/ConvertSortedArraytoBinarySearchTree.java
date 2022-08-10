package Tree;

public class ConvertSortedArraytoBinarySearchTree {
    //tc:o(n);sc:o(logn)
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int left, int right) {
        if (left == right) {
            return new TreeNode(nums[left]);
        }
        if (left > right) {
            return null;
        }
        int mid = (right - left) / 2 + left;

        TreeNode leftNode = dfs(nums, left, mid - 1);
        TreeNode rightNode = dfs(nums, mid + 1, right);
        TreeNode res = new TreeNode(nums[mid]);
        res.left = leftNode;
        res.right = rightNode;
        return res;
    }
}
