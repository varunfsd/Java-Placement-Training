package strings;

import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter The string:-");
        str = sc.next();
        int left = 0, right = str.length() - 1;
        int flag = 0;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Not a Palindrome");
        } else {
            System.out.println("Palindrome");
        }
        sc.close();
    }
}