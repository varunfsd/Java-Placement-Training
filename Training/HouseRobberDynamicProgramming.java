package training;

import java.util.Arrays;

public class HouseRobberDynamicProgramming {
    public static int houseRobber(int[] arr, int[] dp) {
        return houseRobberHelper(0, arr, dp);
    }

    public static int houseRobberHelper(int n, int[] arr, int[] dp) {
        if (n >= arr.length)
            return 0;
        if (dp[n] != -1)
            return dp[n];
        dp[n] = Math.max(1 + houseRobberHelper(n + 2, arr, dp), 1 + houseRobberHelper(n + 1, arr, dp));
        return dp[n];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.print(houseRobber(arr, dp));
    }
}
