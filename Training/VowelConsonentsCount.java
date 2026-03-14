package training;

import java.util.*;

public class VowelConsonentsCount {
    public static int[] findCount(String str) {
        char ch[] = str.toCharArray();
        int vowelCount = 0, consonenetCount = 0;
        for (char c : ch) {
            if (Character.isLetter(c)) {
                if (isVowel(c))
                    vowelCount++;
                else
                    consonenetCount++;
            }

        }
        return new int[] { vowelCount, consonenetCount };

    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String:-");
        String str = sc.nextLine();
        System.out.println(Arrays.toString(findCount(str)));
        sc.close();
    }
}
