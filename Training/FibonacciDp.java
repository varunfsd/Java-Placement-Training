package training;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciDp {
    public static int fibonacciDp(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = fibonacciDp(n - 1, dp) + fibonacciDp(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:-");
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        System.out.println(fibonacciDp(n, arr));
        sc.close();
    }
}
