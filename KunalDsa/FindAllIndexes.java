package kunaldsa;

import java.util.ArrayList;

public class FindAllIndexes {

    public static ArrayList<Integer> findAllIndex(int[] arr, int target) {
        return findAllIndexHelper(arr, target, 0);
    }

    public static ArrayList<Integer> findAllIndexHelper(int[] arr, int target, int ind) {
        ArrayList<Integer> list = new ArrayList<>();
        if (ind == arr.length) {
            return list;
        }

        if (arr[ind] == target) {
            list.add(ind);
        }
        ArrayList<Integer> temp = findAllIndexHelper(arr, target, ind + 1);
        list.addAll(temp);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 8, 8, 9, 8, 8, 8 };
        System.out.println(findAllIndex(arr, 8));
    }
}