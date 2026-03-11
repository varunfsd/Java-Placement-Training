package Training;

import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Range Number:-");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + "-> Fizz Buzz");
            else {
                if (i % 3 == 0)
                    System.out.println(i + "-> Fizz");
                else if (i % 5 == 0)
                    System.out.println(i + "-> Buzz");
            }

        }
        sc.close();
    }
}
