package training;

import java.util.Arrays;

public class LongestSubSequenceLength {
    public static int longestSubSequenceLength(String str, int[][] memo, int left, int right) {

        if (left > right) {
            return 0;
        }

        if (left == right)
            return 1;

        if (memo[left][right] != -1)
            return memo[left][right];

        if (str.charAt(right) == str.charAt(left)) {
            memo[left][right] = 2 + longestSubSequenceLength(str, memo, left + 1, right - 1);
        } else {
            int l = longestSubSequenceLength(str, memo, left + 1, right);
            int r = longestSubSequenceLength(str, memo, left, right - 1);
            memo[left][right] = Math.max(l, r);
        }

        return memo[left][right];
    }

    public static void main(String[] args) {
        String str = "abcdca";
        int n = str.length();

        int[][] memo = new int[n][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        System.out.println(longestSubSequenceLength(str, memo, 0, n - 1));
    }
}