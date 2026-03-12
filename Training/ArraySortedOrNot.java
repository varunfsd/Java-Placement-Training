package training;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1 };
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1])
                continue;
            else {
                isSorted = false;
                break;
            }
        }
        if (isSorted)
            System.out.println("Sorted Order");
        else
            System.out.println("Not In Sorted Order");
    }
}
