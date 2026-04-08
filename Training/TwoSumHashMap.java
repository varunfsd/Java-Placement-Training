package training;

import java.util.*;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 2, 76, 89, 34 };
        int target = 90;

        Map<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];

            if (map.containsKey(val)) {
                System.out.println("Pair found at indices: "
                        + map.get(val) + " -> " + i);
                found = true;
                break;
            }

            map.put(arr[i], i);
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}