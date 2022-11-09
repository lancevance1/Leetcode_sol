package Graph;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class ShortestPathinaGridwithObstaclesElimination {
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length, curK = 0, res = 0;
        k = Math.max(1, Math.min(k, m + n - 3));
        int[] dirx = new int[]{-1, 1, 0, 0}, diry = new int[]{0, 0, 1, -1};
        int[][][] dp = new int[m][n][k + 1];

        // initial dp: all positions that are not in original position [0,0] will be set as max value;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], Integer.MAX_VALUE);
            }
        }
        dp[0][0][0] = 0;

        Deque<int[]> dq = new LinkedList<>();
        dq.add(new int[]{0, 0, curK});
        while (dq.size() != 0) {
            int size = dq.size();

            for (int i = 0; i < size; i++) {
                var tmp = dq.removeFirst();
                int dis = dp[tmp[0]][tmp[1]][tmp[2]];
                if (tmp[0] == m - 1 && tmp[1] == n - 1) return dis;

                for (int j = 0; j < 4; j++) {
                    int nrow = tmp[0] + dirx[j];
                    int ncol = tmp[1] + diry[j];
                    curK = tmp[2];
                    if (nrow < m && ncol < n && nrow > -1 && ncol > -1) {
                        //  dp[nrow][ncol][curK + 1] == Integer.MAX_VALUE
                        //  这个条件非常重要，可以大幅减少运行时间，因为bfs中每遍历到新的点必然是最短的距离，
                        // 所以只要曾经走过就不需要在重新入队计算距离
                        if (grid[nrow][ncol] == 1 && curK < k && dp[nrow][ncol][curK + 1] == Integer.MAX_VALUE) {
                            curK++;
                            dq.addLast(new int[]{nrow, ncol, curK});
                            dp[nrow][ncol][curK] = Math.min(dp[nrow][ncol][curK], dis + 1);
                        } else if (grid[nrow][ncol] == 0 && dp[nrow][ncol][curK] == Integer.MAX_VALUE) {
                            dq.addLast(new int[]{nrow, ncol, curK});
                            dp[nrow][ncol][curK] = Math.min(dp[nrow][ncol][curK], dis + 1);
                        }
                    }
                }
            }
        }
        return -1;
    }
}
