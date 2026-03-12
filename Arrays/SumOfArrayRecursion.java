package arrays;

public class SumOfArrayRecursion {
    public static int sumOfArrayRecursion(int[] arr, int index) {
        if (index == arr.length - 1)
            return arr[index];
        return arr[index] + sumOfArrayRecursion(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("The Sum Of The Array Is:-" + sumOfArrayRecursion(arr, 0));
    }
}
