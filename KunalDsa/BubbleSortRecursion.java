package kunaldsa;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void bubbleSortRecursion(int[] arr, int r, int c) {
        if (r == 0)
            return;

        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubbleSortRecursion(arr, r, c + 1);
        } else {
            bubbleSortRecursion(arr, r - 1, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 5, 7, 3 };
        bubbleSortRecursion(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }
}