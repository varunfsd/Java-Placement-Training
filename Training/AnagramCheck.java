package training;

import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The 1st String:-");
        String str_1 = sc.nextLine();
        System.out.print("Enter The 2nd String:-");
        String str_2 = sc.nextLine();
        char[] arr_1 = str_1.toCharArray();
        char[] arr_2 = str_2.toCharArray();
        Arrays.sort(arr_1);
        Arrays.sort(arr_2);
        if (Arrays.equals(arr_1, arr_2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not an Anagrams");
        }
        sc.close();
    }
}
