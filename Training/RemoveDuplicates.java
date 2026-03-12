package training;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9 };
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        for (int ind = 0; ind <= i; ind++) {
            System.out.println(arr[ind]);
        }
    }
}
