package training;

import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:-");
        int n = sc.nextInt();
        int a = 0, b = 1;
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = a + b;
            a = b;
            b = ans;
        }
        System.out.println(ans);
        sc.close();
    }
}
