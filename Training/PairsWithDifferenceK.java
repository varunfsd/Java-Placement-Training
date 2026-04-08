package training;

public class   {
    public static void main(String[] args) {
        int[] arr = { -3, 0, 1, 3, 6, 8, 11, 14, 21, 25 };
        int left = 0, right = 1;
        int k = 5;
        boolean found = false;

        while (right < arr.length && left < arr.length) {
            if (left == right) {
                right++;
                continue;
            }
            int diff = arr[right] - arr[left];
            if (diff == k) {
                System.out.println(arr[left] + ", " + arr[right]);
                found = true;
                break;
            } else if (diff < k) {
                right++;
            } else {
                left++;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }
}