package training;

public class HouseRobberRecursion {
    public static int houseRobber(int[] arr) {
        return houseRobberHelper(0, arr);
    }

    public static int houseRobberHelper(int n, int[] arr) {
        if (n >= arr.length)
            return 0;
        return Math.max(1 + houseRobberHelper(n + 2, arr), 1 + houseRobberHelper(n + 1, arr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        System.out.print(houseRobber(arr));
    }
}
