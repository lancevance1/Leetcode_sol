package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountofSmallerNumbersAfterSelf {
    int[] tmp;
    Helper[] tmp2;

    public List<Integer> countSmaller(int[] nums) {
        int len = nums.length;
        tmp = new int[len];
        List<Integer> res = new ArrayList();

        if (len == 1) {
            res.add(0);
            return res;
        }
        Helper[] helper = new Helper[len];
        for (int i = 0; i < len; i++) {
            helper[i] = new Helper(nums[i], i, 0);
        }
        tmp2 = new Helper[len];
        sort(nums, 0, len - 1, helper);
        Integer[]test = new Integer[len];
        for (var c : helper) {
            test[c.index]=c.count;
        }
        res = Arrays.asList(test);
        return res;
    }


    private void sort(int[] nums, int left, int right, Helper[] helper) {
        if (left == right) return;
        int mid = (right - left) / 2 + left;
        sort(nums, left, mid, helper);
        sort(nums, mid + 1, right, helper);
        merge(nums, left, mid, right, helper);
    }

    private void merge(int[] nums, int left, int mid, int right, Helper[] helper) {
        if (left == right) return;
        for (int i = left; i <= right; i++) {
            tmp[i] = nums[i];
            tmp2[i] = helper[i];
        }

        int l = left, r = mid + 1;
        for (int i = left; i <= right; i++) {
            if (l > mid) {
                nums[i] = tmp[r];
                helper[i] = new Helper(tmp2[r].val,tmp2[r].index,tmp2[r].count);
                r++;
                continue;
            }
            if (r > right) {
                nums[i] = tmp[l];
                tmp2[l].count += r - mid - 1;
                helper[i] = new Helper(tmp2[l].val,tmp2[l].index,tmp2[l].count);
                l++;
                continue;
            }
            if (tmp[l] <= tmp[r]) {
                nums[i] = tmp[l];
                tmp2[l].count += r - mid - 1;
                helper[i] = new Helper(tmp2[l].val,tmp2[l].index,tmp2[l].count);
                l++;
            } else {
                nums[i] = tmp[r];
                helper[i] = new Helper(tmp2[r].val,tmp2[r].index,tmp2[r].count);
                r++;
            }
        }

    }

    public class Helper {
        int val;
        int index;
        int count;

        public Helper(int val, int index, int count) {
            this.val = val;
            this.index = index;
            this.count = count;
        }
    }
}
