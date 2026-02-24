public class validParanthesis2 {

    public boolean FindWhetherValidParanthesisChecker(String s) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                min++;
                max++;
            } else if (ch == ')') {
                min--;
                max++;
            } else {
                min--;// if * is )
                max++;// if * is (
            }

            if (min < 0) {
                min = 0;
            }
            if (max < 0) {
                return false;
            }
        }

        // If minOpen is 0 at the end, it's a valid configuration
        return min == 0;
    }

    public static void main(String[] args) {
        String s = "((*)(";
        validParanthesis2 result = new validParanthesis2();
        if (result.FindWhetherValidParanthesisChecker(s)) {
            System.out.println("VALID PARANTHESIS IN THIS STRING ");
        } else {
            System.out.println("NOT VALID PARANTHESIS !!");
        }
    }
}
