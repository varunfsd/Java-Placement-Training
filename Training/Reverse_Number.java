package Training;

import java.util.*;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:-");
        int n = sc.nextInt();
        int reversedNumber = 0;
        while (n > 0) {
            reversedNumber = reversedNumber * 10 + n % 10;
            n /= 10;
        }
        System.out.println(reversedNumber);
        sc.close();
    }
}
