package Training;

import java.util.*;

public class PrimeNumberRange {
    public boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i == Math.sqrt(n))
                    count++;
                else
                    count += 2;
            }
        }
        if (count == 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        PrimeNumberRange pnr = new PrimeNumberRange();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Range Number:-");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (pnr.isPrime(i))
                System.out.println(i);
        }
        sc.close();
    }
} // 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97