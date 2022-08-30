package Matrix;

public class MaxSumofRectangleNoLargerThanK {
    //tc:o(m^2n^2);sc:o(mn)
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int res = Integer.MIN_VALUE;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] preMat = new int[m + 1][n + 1];
        // create presum matrix
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                preMat[i][j] = preMat[i - 1][j] + preMat[i][j - 1] - preMat[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
        //calculate all submatrix sum
        for (int o = 0; o < m; o++) {
            for (int l = 0; l < n; l++) {
                for (int i = o; i < m; i++) {
                    for (int j = l; j < n; j++) {
                        int tmp = preMat[i + 1][j + 1] - preMat[i + 1][l] - preMat[o][j + 1] + preMat[o][l];
                        if (tmp <= k)
                            res = Math.max(res, tmp);
                        if (tmp == k) return k;
                    }
                }
            }
        }
        return res;
    }
}
