package training;

import java.util.*;

public class RootTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter The Number:-");
        n = sc.nextInt();
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
