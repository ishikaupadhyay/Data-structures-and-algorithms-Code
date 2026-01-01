package PATTERNS;

public class increLetterTri {
    static void pattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
