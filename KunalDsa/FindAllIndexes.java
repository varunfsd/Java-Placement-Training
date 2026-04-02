package kunaldsa;

import java.util.ArrayList;

public class FindAllIndexes {

    public static ArrayList<Integer> findAllIndex(int[] arr, int target) {
        return findAllIndexHelper(arr, target, 0, new ArrayList<>());
    }

    public static ArrayList<Integer> findAllIndexHelper(int[] arr, int target, int ind, ArrayList<Integer> list) {
        if (ind == arr.length) {
            return list;
        }

        if (arr[ind] == target) {
            list.add(ind);
        }

        return findAllIndexHelper(arr, target, ind + 1, list);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 8, 8, 9, 8, 8, 8 };
        System.out.println(findAllIndex(arr, 8));
    }
}