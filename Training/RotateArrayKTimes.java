package training;

import java.util.*;

public class RotateArrayKTimes {
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            arr[start] = arr[start] ^ arr[end];
            arr[end] = arr[start] ^ arr[end];
            arr[start] = arr[start] ^ arr[end];
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The k Value:-");
        int k = sc.nextInt();
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] optArr = arr.clone();
        System.out.println(Arrays.toString(optArr));

        // BruteForce

        for (int i = 1; i <= k; i++) {
            if (k == arr.length)
                break;
            int index = arr.length - 1;
            while (index > 0) {
                arr[index] = arr[index] ^ arr[index - 1];
                arr[index - 1] = arr[index] ^ arr[index - 1];
                arr[index] = arr[index] ^ arr[index - 1];
                index--;
            }
        }
        System.out.print("BruteForce:- ");
        System.out.println(Arrays.toString(arr));

        // Better

        k = k % arr.length;
        reverseArray(optArr, 0, optArr.length - 1);
        reverseArray(optArr, 0, k - 1);
        reverseArray(optArr, k, arr.length - 1);
        System.out.print("Optimized:- ");
        System.out.println(Arrays.toString(optArr));
        sc.close();
    }
}