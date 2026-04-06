package training;

import java.util.Arrays;
import java.util.Scanner;

public class StaircaseProblem {
    public static int staircaseProblem(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = staircaseProblem(n - 1, dp) + staircaseProblem(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:-");
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        System.out.println(staircaseProblem(n, arr));
        sc.close();
    }
}
