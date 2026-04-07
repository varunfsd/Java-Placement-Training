package kunaldsa;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = findMaxIndex(arr, 0, last);
            swapIt(arr, maxIndex, last);

        }
    }

    public static int findMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void swapIt(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 3, 2, 1, 8, 9, 4 };
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
