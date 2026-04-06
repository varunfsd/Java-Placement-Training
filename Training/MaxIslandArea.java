package training;

public class MaxIslandArea {
    public static int dfsArea(int[][] mat, int r, int c) {
        if (r < 0 || r >= mat.length || c < 0 || c >= mat[0].length || mat[r][c] == 0)
            return 0;
        mat[r][c] = 0;
        int area = 1;
        area += dfsArea(mat, r, c - 1);
        area += dfsArea(mat, r, c + 1);
        area += dfsArea(mat, r - 1, c);
        area += dfsArea(mat, r + 1, c);
        return area;
    }

    public static void main(String[] args) {
        int maxArea = 0;
        int mat[][] = { { 1, 1, 1, 0, 0 },
                { 1, 1, 1, 0, 0 },
                { 0, 0, 0, 1, 1 },
                { 0, 1, 0, 0, 0 } };
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    int curArea = dfsArea(mat, i, j);
                    maxArea = Math.max(maxArea, curArea);
                }
            }
        }
        System.out.println(maxArea);
    }
}
