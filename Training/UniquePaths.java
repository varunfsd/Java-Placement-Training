package training;

public class UniquePaths {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        for (int i = 0; i < grid.length; i++) {
            grid[i][0] = 1;
            grid[0][i] = 1;
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
            }
        }
        System.out.println(grid[2][2]);
    }
}
