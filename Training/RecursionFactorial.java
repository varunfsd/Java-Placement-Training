package Training;

import java.util.*;

public class RecursionFactorial {
    public int findFactorial(int n) {
        if (n == 1)
            return 1;
        return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:-");
        int n = sc.nextInt();
        RecursionFactorial rf = new RecursionFactorial();
        System.out.println(rf.findFactorial(n));
        sc.close();
    }
}
