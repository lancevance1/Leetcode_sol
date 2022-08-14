package ArraryHashTable;

public class FindPermutation {
    //tc:o(n);sc:o(n)
    public int[] findPermutation(String s) {
        int[] res = new int[s.length() + 1];
        for (int i = 1; i <= s.length() + 1; i++) {
            res[i - 1] = i;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'D') {
                count++;
            } else {
                reverse(res, i - count, i);
                count = 0;
            }
        }
        if (count > 0) {
            reverse(res, s.length() - count, s.length());
        }
        return res;
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[r];
            nums[r] = nums[l];
            nums[l] = tmp;
            l++;
            r--;
        }
    }
}
