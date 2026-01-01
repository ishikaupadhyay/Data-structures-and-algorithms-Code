package PATTERNS;

public class revTriangle {
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            // left spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // for No.of stars!!
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // right spaces;
            for (int j = 0; j < i; j++) {
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
