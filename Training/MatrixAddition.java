package training;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix_1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrix_2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int matrix_3[][] = new int[matrix_1.length][matrix_1[0].length];
        for (int i = 0; i < matrix_1.length; i++) {
            for (int j = 0; j < matrix_1[0].length; j++) {
                matrix_3[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }
        for (int[] row : matrix_3) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
