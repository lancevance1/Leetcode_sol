package Matrix;

public class RotateImage {
    //tc:o(m^2),sc:o(m)
    public void rotate(int[][] matrix) {
        rotateMatrix(matrix, 0, matrix.length);
    }

    private void rotateMatrix(int[][] matrix, int row, int len) {
        if (row * 2 > matrix.length) return;
        int length = matrix.length;
        for (int i = row; i < row + len - 1; i++) {
            var tmp = matrix[row][i];
            matrix[row][i] = matrix[length - i - 1][row];
            matrix[length - i - 1][row] = matrix[length - row - 1][length - i - 1];
            matrix[length - row - 1][length - i - 1] = matrix[i][length - row - 1];
            matrix[i][length - row - 1] = tmp;
        }
        rotateMatrix(matrix, row + 1, len - 2);
    }
}
