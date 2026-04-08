package training;

import java.util.*;

public class TwoSumTwoPointers {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 9, 23, 56, 12, 34 };
        int left = 0, right = arr.length - 1;
        int target = 79;
        Arrays.sort(arr);
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(true);
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
    }
}
