package PATTERNS;

public class triangle {
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            // left spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // for No.of stars!!
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // right spaces;
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
