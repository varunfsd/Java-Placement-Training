package training;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
        }
        System.out.println(dp[dp.length - 1]);
    }
}
