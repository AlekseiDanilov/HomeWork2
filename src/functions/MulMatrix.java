package functions;

public class MulMatrix {
    public int[][] mulMatrix(int[][] matrixA, int[][] matrixB) {
        if (matrixA == null || matrixB == null) {
            return new int[][]{};
        }
        if (numberLine(matrixA) == 0 || numberLine(matrixB) == 0 || numberColumns(matrixA) == 0 || numberColumns(matrixB) == 0) {
            return new int[][]{};
        }
        if (numberColumns(matrixA) != numberLine(matrixB)) {
            return new int[][]{};
        }

        int n = numberLine(matrixA);
        int m = numberColumns(matrixA);
        int k = numberColumns(matrixB);

        int[][] matrixC = new int[n][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < m; l++) {
                    matrixC[i][j] += matrixA[i][l] * matrixB[l][j];
                }
            }
        }
        return matrixC;
    }

    private int numberLine(int[][] matrix) {
        if (matrix == null) {
            return 0;
        }
        if (matrix.length == 0) {
            return 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null) {
                return 0;
            }
        }
        return matrix.length;
    }

    private int numberColumns(int[][] matrix) {
        int numberColumns = 0;
        if (numberLine(matrix) > 0) {
            numberColumns = matrix[0].length;
        } else {
            return 0;
        }
        for (int i = 1; i < numberLine(matrix); i++) {
            if (matrix[i].length != numberColumns) {
                return 0;
            }
        }
        return numberColumns;
    }
}
