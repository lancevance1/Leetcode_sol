package BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new LinkedList();
        LinkedList<int[]> tr = new LinkedList();

        //edge case
        if (n == 1) {
            List<String> sol2 = new LinkedList();
            sol2.add("Q");
            res.add(sol2);
            return res;
        } else if (n == 2 || n == 3) {
            return res;
        }

        //creating an empty board
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        backtracking(0, tr, n, board, res);
        return res;
    }


    // placed rules
    private boolean isValid(int x, int y, List<int[]> tr) {
        boolean res = true;
        for (var t : tr) {
            if (x == t[0] || y == t[1] || Math.abs(x - t[0]) == Math.abs(y - t[1]))
                return false;
        }
        return res;
    }

    // backtracking template
    private void backtracking(int row, LinkedList<int[]> tr, int n, char[][] board, List<List<String>> res) {
        if (tr.size() == n) {
            List<String> tmp = new LinkedList();
            for (int i = 0; i < n; i++) {
                String s = String.valueOf(board[i]);
                tmp.add(s);
            }
            res.add(new LinkedList(tmp));
            return;
        }

        for (int column = 0; column < n; column++) {
            if (!isValid(row, column, tr)) continue;
            tr.add(new int[]{row, column});
            board[row][column] = 'Q';
            //check each row
            if (row < n) {
                backtracking(row + 1, tr, n, board, res);
            }
            board[row][column] = '.';
            tr.removeLast();
        }
    }
}
