package Math;

public class BeautifulArrangementII {
    //tc:o(n);sc:o(n)
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        int left = 1, right = n;
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                res[i] = left;
                left++;
            } else {
                res[i] = right;
                right--;
            }
        }
        int x = k;
        if (k % 2 != 0) {
            while (x < n) {
                res[x] = left;
                left++;
                x++;
            }
        } else {
            while (x < n) {
                res[x] = right;
                right--;
                x++;
            }
        }
        return res;
    }
}
