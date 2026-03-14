package training;

import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String:-");
        String str = sc.nextLine();
        str = str.trim().toLowerCase();
        int leftPointer = 0, rightPointer = str.length() - 1;
        boolean isPalindrome = true;
        while (leftPointer < rightPointer) {
            while (leftPointer < str.length() && !Character.isLetterOrDigit(str.charAt(leftPointer))) {
                leftPointer++;
            }
            while (rightPointer >= 0 && !Character.isLetterOrDigit(str.charAt(rightPointer))) {
                rightPointer--;
            }
            if (str.charAt(leftPointer) != str.charAt(rightPointer)) {
                isPalindrome = false;
                break;
            }
            leftPointer++;
            rightPointer--;
        }
        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
        sc.close();
        ;
    }
}
