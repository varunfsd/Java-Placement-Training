package training;

import java.util.*;

public class CountNoOfOdds {
    public static int countOdds(int low, int high, int sum) {
        if (low > high) {
            return sum;
        }
        if (low % 2 == 1)
            sum += 1;
        return countOdds(low + 1, high, sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The 1st Range Number:-");
        int low = sc.nextInt();
        System.out.print("Enter The 2nd Range Number:-");
        int high = sc.nextInt();
        System.out.println(countOdds(low, high, 0));
        sc.close();
    }
}