package Graph;

import java.util.Deque;
import java.util.LinkedList;

public class ShortestPathtoGetFood {
    public int getFood(char[][] grid) {
        int m = grid.length, n = grid[0].length, res = 0;
        int[] dirx = new int[]{-1, 1, 0, 0}, diry = new int[]{0, 0, -1, 1};
        Deque<int[]> dq = new LinkedList<>();
        int[] start = new int[2];
        boolean[][] dp = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '*') {
                    start = new int[]{i, j};
                }
            }
        }
        dp[start[0]][start[1]] = true;
        dq.add(start);
        while (dq.size() != 0) {
            int size = dq.size();
            for (int i = 0; i < size; i++) {
                var tmp = dq.removeFirst();
                if (grid[tmp[0]][tmp[1]] == '#') return res;
                for (int j = 0; j < 4; j++) {
                    int nrow = tmp[0] + dirx[j];
                    int ncol = tmp[1] + diry[j];
                    if (nrow > -1 && ncol > -1 && nrow < m && ncol < n
                            && grid[nrow][ncol] != 'X' && !dp[nrow][ncol]) {
                        dq.addLast(new int[]{nrow, ncol});
                        dp[nrow][ncol] = true;
                    }
                }
            }
            res++;
        }
        return -1;
    }
}
