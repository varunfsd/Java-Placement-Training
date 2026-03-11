package Arrays;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int compliment;
        for (int i = 0; i < arr.length; i++) {
            compliment = target - arr[i];
            if (map.containsKey(compliment))
                return new int[] { map.get(compliment), i };
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 5, 78, 34, 56, 23, 67, 8, 9, 34 };
        System.out.print("Enter The Target Value:-");
        int target = sc.nextInt();
        TwoSum ts = new TwoSum();
        System.out.println(Arrays.toString(ts.twoSum(arr, target)));
        sc.close();
    }
}