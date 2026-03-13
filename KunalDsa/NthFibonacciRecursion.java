package kunaldsa;

import java.util.*;

public class NthFibonacciRecursion {
    public static int findFibo(int n) {
        if (n < 2)
            return n;
        return findFibo(n - 1) + findFibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:-");
        int n = sc.nextInt();
        System.out.print(findFibo(n));
        sc.close();
    }
}
