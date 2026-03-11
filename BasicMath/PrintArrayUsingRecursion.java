package basicmath;

public class PrintArrayUsingRecursion {
    public void printArrayUsingRecursion(int[] arr, int index) {
        if (index == arr.length)
            return;
        System.out.println(arr[index]);
        printArrayUsingRecursion(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 3, 4, 5, 34, 56, 78, 89, 90 };
        PrintArrayUsingRecursion paur = new PrintArrayUsingRecursion();
        paur.printArrayUsingRecursion(arr, 0);
    }
}
