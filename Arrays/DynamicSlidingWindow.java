package arrays;

import java.util.*;

public class DynamicSlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The k Value:-");
        int k = sc.nextInt();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int left = 0, right = 0, sum = 0, maxLength = 0;
        while (right < arr.length) {
            sum = sum + arr[right];
            while (sum > k) {
                sum = sum - arr[left];
                left++;
            }
            if (sum <= k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }
        System.out.println(maxLength);
        sc.close();
    }
}
