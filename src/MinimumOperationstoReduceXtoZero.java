public class MinimumOperationstoReduceXtoZero {
    public int minOperations(int[] nums, int x) {
        int res = Integer.MAX_VALUE;
        var tmp = dfs(nums[0], x, nums);
        if (tmp > -1) {
            res = Math.min(res, tmp);
        }
//        i = nums.length-1;
        var tmp2 = dfs(nums[nums.length - 1], x, nums);


        if (tmp2 > -1) {
            res = Math.min(res, tmp2);
        }
        if (res == Integer.MAX_VALUE) return -1;
        return res;
    }


    int i = 0;

    //    int j = nums.length;
    private int dfs(int target, int x, int[] arr) {

        if (x == target) {
            return 0;
        } else if (x < target) {
            i--;
            return -1;
        } else {
            i++;
            if (i == arr.length) return -1;
        }
        int res = Integer.MAX_VALUE;
        var tmp = dfs(arr[i], x - target, arr);

        if (tmp > -1) {
            res = Math.min(res, tmp);
        }

        var tmp2 = dfs(arr[arr.length - i], x - arr[arr.length - i], arr);


        if (tmp2 > -1) {
            res = Math.min(res, tmp2);
        }
        if (res != Integer.MAX_VALUE) {
            res++;
        }

        return res;
    }

    private int dfs2(int target, int x, int[] arr) {
        int i = arr.length - 1;
        if (x == target) {
            return 0;
        } else if (x < target) {
            return -1;
        } else {
            i--;
            if (i == -1) return -1;
        }
        int res = Integer.MAX_VALUE;
        var tmp = dfs2(arr[i], x - arr[i], arr);

        if (tmp > -1) {
            res = Math.min(res, tmp);
        }

        var tmp2 = dfs2(arr[arr.length - i - 2], x - arr[arr.length - i - 2], arr);


        if (tmp2 > -1) {
            res = Math.min(res, tmp2);
        }
        if (res != Integer.MAX_VALUE) {
            res++;
        }

        return res;
    }
}
