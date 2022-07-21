package Graph;

/***
 * 695. Max Area of Island
 *
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 *
 * The area of an island is the number of cells with a value 1 in the island.
 *
 * Return the maximum area of an island in grid. If there is no island, return 0.
 *
 * Example 1:
 * Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * Output: 6
 * Explanation: The answer is not 11, because the island must be connected 4-directionally.
 * Example 2:
 *
 * Input: grid = [[0,0,0,0,0,0,0,0]]
 * Output: 0
 *
 *
 * Constraints:
 *
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 50
 * grid[i][j] is either 0 or 1.
 */

//tc:o(mn),sc:o(mn)
public class MaxAreaofIsland {
    int res = 0;
    int[] dx = new int[]{1, -1, 0, 0};
    int[] dy = new int[]{0, 0, 1, -1};

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //每次调用dfs()，都记录小岛的大小
                res = Math.max(res, dfs(grid, i, j, m, n));
            }
        }

        return res;
    }

    // 用的是后续递归
    private int dfs(int[][] grid, int x, int y, int m, int n) {
        if (x < 0 || y < 0 || x == m || y == n) return 0;

        if (grid[x][y] == 0) return 0;
        grid[x][y] = 0;

        int tmp = 0;
        for (int i = 0; i < 4; i++) {
            tmp += dfs(grid, x + dx[i], y + dy[i], m, n);
        }
        return tmp + 1;
    }
}
