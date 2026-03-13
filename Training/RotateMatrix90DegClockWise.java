package training;

public class RotateMatrix90DegClockWise {
    public static int[][] transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                matrix[i][j] = matrix[i][j] ^ matrix[j][i];
                matrix[j][i] = matrix[i][j] ^ matrix[j][i];
                matrix[i][j] = matrix[i][j] ^ matrix[j][i];
            }
        }
        return matrix;
    }

    public static int[][] reverse(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int leftPointer = 0, rightPointer = matrix[i].length - 1;
            while (leftPointer < rightPointer) {
                matrix[i][leftPointer] = matrix[i][leftPointer] ^ matrix[i][rightPointer];
                matrix[i][rightPointer] = matrix[i][leftPointer] ^ matrix[i][rightPointer];
                matrix[i][leftPointer] = matrix[i][leftPointer] ^ matrix[i][rightPointer];
                leftPointer++;
                rightPointer--;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        reverse(transpose(matrix));
        for (int[] row : matrix) {
            for (int a : row) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

    }

}
