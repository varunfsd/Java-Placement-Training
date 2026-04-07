package kunaldsa;

public class PatternRecursion {
    public static void pattern(int r, int c) {
        if (r == 0)
            return;

        if (c < r) {
            System.out.print("* ");
            pattern(r, c + 1);
        } else {
            System.out.println();
            pattern(r - 1, 0);
        }
    }

    public static void main(String[] args) {
        PatternRecursion.pattern(4, 0);
    }
}