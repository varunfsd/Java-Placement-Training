package training;

public class NoOfClosedIslands {

    public static boolean dfs(int[][] mat, int r, int c) {
        // If out of boundary → not closed
        if (r < 0 || r >= mat.length || c < 0 || c >= mat[0].length)
            return false;

        // If water → safe (doesn't affect closure)
        if (mat[r][c] == 1)
            return true;

        // mark visited
        mat[r][c] = 1;

        boolean up = dfs(mat, r - 1, c);
        boolean down = dfs(mat, r + 1, c);
        boolean left = dfs(mat, r, c - 1);
        boolean right = dfs(mat, r, c + 1);

        return up && down && left && right;
    }

    public static void main(String[] args) {
        int count = 0;

        int mat[][] = {
                { 1, 1, 1, 1, 1 },
                { 1, 0, 1, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 1, 1, 1, 1, 1 }
        };

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    if (dfs(mat, i, j)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}