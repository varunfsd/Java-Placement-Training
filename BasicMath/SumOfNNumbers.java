package basicmath;

import java.util.*;

public class SumOfNNumbers {
    public int sumOfNNumbers(int n) {
        if (n == 0)
            return 0;
        return n + sumOfNNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:-");
        int rangeNumber = sc.nextInt();
        SumOfNNumbers son = new SumOfNNumbers();
        System.out.println("Sum Of Numbers Is:-" + son.sumOfNNumbers(rangeNumber));
        sc.close();
    }
}