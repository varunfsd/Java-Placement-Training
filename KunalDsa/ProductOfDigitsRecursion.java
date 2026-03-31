package kunaldsa;

public class ProductOfDigitsRecursion {
    public static int productOfDigits(int n) {
        if (n == 1)
            return 1;
        return (n % 10) * productOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(productOfDigits(123));
    }
}
