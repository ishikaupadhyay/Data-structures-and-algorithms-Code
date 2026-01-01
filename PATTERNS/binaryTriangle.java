package PATTERNS;

public class binaryTriangle {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            int start;
            if (i % 2 == 0)
                start = 1;// if row's index=even ,then ele=1;
            else
                start = 0;

            for (int j = 0; j <= i; j++) 
            {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
