package training;

public class TotalIslandCount {
    public static void dfsArea(int[][] mat, int r, int c) {
        if (r < 0 || r >= mat.length || c < 0 || c >= mat[0].length || mat[r][c] == 0)
            return;
        mat[r][c] = 0;
        dfsArea(mat, r, c - 1);
        dfsArea(mat, r, c + 1);
        dfsArea(mat, r - 1, c);
        dfsArea(mat, r + 1, c);
    }

    public static void main(String[] args) {
        int totalIslands = 0;
        int mat[][] = { { 1, 1, 1, 0, 0 },
                { 1, 1, 1, 0, 0 },
                { 0, 0, 0, 1, 1 },
                { 0, 1, 0, 0, 0 } };
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    dfsArea(mat, i, j);
                    totalIslands++;
                }
            }
        }
        System.out.println(totalIslands);
    }
}
