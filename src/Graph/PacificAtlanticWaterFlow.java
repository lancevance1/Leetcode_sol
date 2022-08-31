package Graph;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    int[] x = new int[]{1, -1, 0, 0};
    int[] y = new int[]{0, 0, 1, -1};

    boolean[][] track;
    boolean[][] track2;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList();
        track = new boolean[heights.length][heights[0].length];
        track2 = new boolean[heights.length][heights[0].length];
        for (int i = 0; i < heights.length; i++) {
            dfs(heights, i, 0, track);
        }
        for (int j = 0; j < heights[0].length; j++) {
            dfs(heights, 0, j, track);
        }
        for (int i = 0; i < heights.length; i++) {
            dfs(heights, i, heights[0].length - 1, track2);
        }
        for (int j = 0; j < heights[0].length; j++) {
            dfs(heights, heights.length - 1, j, track2);
        }
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (track[i][j] && track2[i][j]) {
                    List<Integer> tmp = new ArrayList();
                    tmp.add(i);
                    tmp.add(j);
                    res.add(tmp);
                }
            }
        }
        return res;
    }
    private void dfs(int[][] heights, int row, int col, boolean[][] track) {
        if (track[row][col]) {
            return;
        } else {
            track[row][col] = true;
        }

        for (int i = 0; i < 4; i++) {
            int nrow = row + x[i];
            int ncol = col + y[i];
            if (nrow < 0 || ncol < 0 || nrow == heights.length || ncol == heights[0].length || track[nrow][ncol])
                continue;
            if (heights[nrow][ncol] >= heights[row][col]) {
                dfs(heights, nrow, ncol, track);
            }

        }
    }
}
