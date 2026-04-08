package training;

public class TwoSumBruteForce {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 9, 6, 1, 7, 8, 56 };
        int target = 65;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + "->" + j);
                    break;
                }
            }
        }
    }
}
