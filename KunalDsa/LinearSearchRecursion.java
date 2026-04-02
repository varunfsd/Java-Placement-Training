package kunaldsa;

public class LinearSearchRecursion {

    public static boolean linearSearch(int[] arr, int target) {
        return linearSearchHelper(arr, target, 0);
    }

    public static boolean linearSearchHelper(int[] arr, int target, int ind) {
        if (ind == arr.length) {
            return false;
        }
        return arr[ind] == target || linearSearchHelper(arr, target, ind + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(linearSearch(arr, 5));
    }
}