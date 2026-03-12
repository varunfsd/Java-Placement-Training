package basicmath;

import java.util.*;

public class PowerOfNumberRecursion {
    public static long powerOfNumberRecursion(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * powerOfNumberRecursion(base, power - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Base Number:-");
        int base = sc.nextInt();
        System.out.print("Enter The Power Number:-");
        int power = sc.nextInt();
        long ans = powerOfNumberRecursion(base, power);
        System.out.println(ans);
        sc.close();
    }
}
