package training;

public class ContainerWithMostWaterBruteforce {
    public static void main(String[] args) {
        int ans = 0;
        int[] arr = { 3, 7, 4, 5, 2 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int width = j - i;
                int height = Math.min(arr[i], arr[j]);
                int water = width * height;
                ans = Math.max(ans, water);
            }
        }
        System.out.println(ans);
    }
}
