package strings;

import java.util.*;

public class PalindromeStringRecursion {
    public static boolean palindromeStringRecursion(String str, int start, int end) {
        if (start >= end)
            return true;
        if (str.charAt(start) != str.charAt(end))
            return false;
        return palindromeStringRecursion(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String:-");
        String str = sc.nextLine();
        if (palindromeStringRecursion(str, 0, str.length() - 1))
            System.out.println("Palindrome String");

        else
            System.out.println("Not a Palindrome String");

        sc.close();
    }
}
