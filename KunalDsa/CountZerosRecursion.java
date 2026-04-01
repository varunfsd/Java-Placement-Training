package kunaldsa;

public class CountZerosRecursion {
    public static int countZeros(int n) {

        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        ;
        if (n % 10 == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);
    }

    public static void main(String[] args) {
        System.out.print(countZeros(10009090));
    }
}
