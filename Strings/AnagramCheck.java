package strings;

import java.util.*;

public class AnagramCheck {

    public boolean AnagramSizeCheck(String str1, String str2) {
        return str1.length() == str2.length();
    }

    public boolean CheckAnagrams(String str_1, String str_2) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters in first string
        for (int i = 0; i < str_1.length(); i++) {
            char c = str_1.charAt(i);

            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.replace(c, map.get(c) + 1);
            }
        }

        // Reduce counts using second string
        for (int i = 0; i < str_2.length(); i++) {
            char c = str_2.charAt(i);
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) - 1);

                if (map.get(c) <= 0) {
                    map.remove(c);
                }
            } else {
                return false;
            }
        }

        return map.size() == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str_1, str_2;

        String[] arr1 = {
                "listen",
                "triangle",
                "hello",
                "aabb",
                "cat",
                "aabbcc",
                "a",
                "Listen",
                "123",
                "race"
        };

        String[] arr2 = {
                "silent",
                "integral",
                "world",
                "abcd",
                "cats",
                "abcabc",
                "a",
                "silent",
                "321",
                "care"
        };

        AnagramCheck anagram = new AnagramCheck();

        for (int i = 0; i < arr1.length; i++) {

            str_1 = arr1[i];
            str_2 = arr2[i];

            if (anagram.AnagramSizeCheck(str_1, str_2)) {

                if (anagram.CheckAnagrams(str_1, str_2)) {
                    System.out.println((i + 1) + " -> Anagrams");
                } else {
                    System.out.println((i + 1) + " -> Not an Anagrams");
                }

            } else {
                System.out.println((i + 1) + " -> Not an Anagrams Both Strings are in Different Length");
            }
        }

        sc.close();
    }
}