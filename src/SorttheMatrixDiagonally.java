import java.util.*;

public class SorttheMatrixDiagonally {
    // tc:o(mnlog(mn));sc:o(mn)
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        for (int i = n - 1; i > -1; i--) {
            List<Integer> list = new ArrayList<>();
            for (int j = i; (j < n) && (j < m + i); j++) {
                int r = j - i;
                int c = j;

                list.add(mat[r][c]);
            }
            Collections.sort(list);
            for (int j = i; j < n && j < m + i; j++) {
                int r = j - i;
                int c = j;
                if (list.size() != 0)
                    mat[r][c] = list.remove(0);
            }
        }
        for (int i = m - 1; i > 0; i--) {
            List<Integer> list = new ArrayList();
            for (int j = i; j < m && j < n + i; j++) {
                int r = j;
                int c = j - i;
                list.add(mat[r][c]);
            }
            Collections.sort(list);
            for (int j = i; j < m && j < n + i; j++) {
                int r = j;
                int c = j - i;
                if (list.size() != 0)
                    mat[r][c] = list.remove(0);
            }
        }
        return mat;
    }
}
