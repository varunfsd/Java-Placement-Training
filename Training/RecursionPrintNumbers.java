package training;

import java.util.*;

public class RecursionPrintNumbers {
    public void printIt(int n) {
        if (n == 0)
            return;
        printIt(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:-");
        int n = sc.nextInt();
        RecursionPrintNumbers rpn = new RecursionPrintNumbers();
        rpn.printIt(n);
        sc.close();
    }
}
