import java.util.Stack;

public class balancedParanthesis {

    public boolean CheckBalancedParanthesis(String s) {
        // approach :
        /*
         * stack lenge :
         * usme opening brackets PUSH krdenge saare
         * 
         * then ek ek krke unhe pop krenge and check krenge ki kya ch mai: wesa closing
         * braackets haii kya!!??
         */

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();

                // checking for matching pairs :
                if (ch == '}' && top == '{')
                    if (ch == ']' && top == '[')
                        if (ch == ')' && top == '(')
                            continue;

                        else {
                            return false;
                        }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "( ) { ( }) ]";
        balancedParanthesis result = new balancedParanthesis();
        if (result.CheckBalancedParanthesis(s)) {
            System.out.println("BALANCED PARANTHESIS ");
        } else {
            System.out.println("UNBALANCED PARATHESIS");
        }
    }
}
