public class validParanthesis
{

    public boolean FindWhetherValidParanthesisChecker(String s, int index, int open) {

        if (open < 0)
            return false;// if the opening has gone below 0 it obvioulsy means that : the paranthesis are
                         // invalid

        if (index == s.length())
            return true;/// mtlb last tk pahuch gye haii , so all successful!! u r goog to go
        char ch = s.charAt(index);

        if (ch == '(') {
            return FindWhetherValidParanthesisChecker(s, index + 1, open + 1);
        }
        if (ch == ')') {
            return FindWhetherValidParanthesisChecker(s, index + 1, open - 1);
        }

        // If it's '*', we try all 3 possibilities:
        // 1. Treat '*' as empty string
        // 2. Treat '*' as '('
        // 3. Treat '*' as ')'
        if (ch == '*') {
            return FindWhetherValidParanthesisChecker(s, index + 1, open) ||
                    FindWhetherValidParanthesisChecker(s, index + 1, open + 1) ||
                    FindWhetherValidParanthesisChecker(s, index + 1, open - 1);
        }
        // or e;se write : else and all the 3 conditions that can be applied fro :- *

        return false;

    }

    public static void main(String[] args) {
        String s = "((*)";
        validParanthesis result = new validParanthesis();
        if (result.FindWhetherValidParanthesisChecker(s, 0, 0)) {
            System.out.println("VALID PARANTHESIS IN THIS STRING ");
        } else {
            System.out.println("NOT VALID PARANTHESIS !!");
        }
    }
}
