package Graph;

/***
 * 130. Surrounded Regions
 * Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.
 *
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 *
 * Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
 * Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
 * Explanation: Notice that an 'O' should not be flipped if:
 * - It is on the border, or
 * - It is adjacent to an 'O' that should not be flipped.
 * The bottom 'O' is on the border, so it is not flipped.
 * The other three 'O' form a surrounded region, so they are flipped.
 * Example 2:
 *
 * Input: board = [["X"]]
 * Output: [["X"]]
 *
 * Constraints:
 *
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 200
 * board[i][j] is 'X' or 'O'.
 */

public class SurroundedRegions {
    int[] dx = new int[]{1, -1, 0, 0};
    int[] dy = new int[]{0, 0, 1, -1};

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        // replace those cell (corner cell which is 'O' and other cells which is connected to this cell)
        // to other character like '!'
        for (int i = 0; i < m; i++) {
            dfs(board, i, 0, m, n);
            dfs(board, i, n - 1, m, n);
        }

        for (int i = 0; i < n; i++) {
            dfs(board, m - 1, i, m, n);
            dfs(board, 0, i, m, n);
        }

        //then replace those cells back
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == '!') board[i][j] = 'O';
            }
        }
    }

    private void dfs(char[][] board, int x, int y, int m, int n) {
        if (x < 0 || y < 0 || x == m || y == n) return;
        if (board[x][y] != 'O') {
            return;
        } else if (board[x][y] == 'O') {
            board[x][y] = '!';
        }
        for (int i = 0; i < 4; i++) {
            dfs(board, x + dx[i], y + dy[i], m, n);
        }
    }
}
