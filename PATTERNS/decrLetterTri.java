package PATTERNS;

public class decrLetterTri {
   static void pattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {

            for (char ch ='A'+i; ch >= 'A'; ch++) {
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
