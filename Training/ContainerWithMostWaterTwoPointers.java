package training;

public class ContainerWithMostWaterTwoPointers {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 4, 5, 2 };
        int left = 0, right = arr.length - 1;
        int area = 0;
        while (left < right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int water = width * height;
            area = Math.max(area, water);
            if (arr[right] < arr[left])
                right--;
            else
                left++;
        }
        System.out.println(area);
    }
}
