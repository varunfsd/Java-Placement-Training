package training;

import java.util.*;
import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int leftPointer = 0, rightPointer = arr.length - 1;
        while (leftPointer < rightPointer) {
            arr[leftPointer] = arr[leftPointer] ^ arr[rightPointer];
            arr[rightPointer] = arr[leftPointer] ^ arr[rightPointer];
            arr[leftPointer] = arr[leftPointer] ^ arr[rightPointer];
            leftPointer++;
            rightPointer--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
