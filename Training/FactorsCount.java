package training;

import java.util.*;

public class FactorsCount {

    // Optimized

    public void betterSolution(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i == Math.sqrt(n))
                    count++;
                else
                    count += 2;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        FactorsCount fc = new FactorsCount();
        Scanner sc = new Scanner(System.in);

        // BruteForce

        System.out.print("Enter The Number:-");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
            else
                continue;
        }
        System.out.println(count);
        System.out.println(Math.sqrt(n));
        fc.betterSolution(n);
        sc.close();
    }
}
