package training;

public class PrintDiagonalMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }
    }
}
