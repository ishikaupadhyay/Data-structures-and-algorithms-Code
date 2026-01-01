package PATTERNS;

public class halfdiamond {
    // 2 parts :
    // if n =3 , so 3 rows ,3 col..and uske neeche he aur 3 (middle -> common rhega)
    static void pattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) { // total no. of rows!

            // stars :
            int stars;
            // in 1st half , the stars will be equal to no.of rows!
            if (i <= n) {
                stars = i;
            } else { //latter half :
                stars = 2 * n - i;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;
        pattern(n);
    }
}
