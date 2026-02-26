//ckage STACK;

import java.util.Stack;

public class MinStack1 {
    /*
     * approach yhai haii: ki we need to check the minimum value with the current
     * values !!, and at the end(top of the stack )we 'll get
     * the minimum Values!!'
     */

    private Stack<int[]> st; // declaring a stack

    public MinStack1() {// constructor: Initializes a stack
        st = new Stack<>();
    }

    // push operation:
    public void push(int n) {
        if (st.isEmpty()) {
            st.push(new int[] { n, n });// n1:current val , n2: minimum value
        }
        // updating the minimum value at every stance :
        int min = Math.min(getMin(), n);

        // adding the other values now ,a long with the minimum value
        st.push(new int[] { n, min });
    }

    // pop operation:
    public void pop() {
        st.pop();
    }

    public int getMin() {
        return st.peek()[1];
        /*
         * how does it returns teh minimum value :
         * as sbse top pr current val and most minimum value rahenge
         * so obviously index 1 pr : we will have the most minimum value!!
         */
    }

    public int top() {
        return st.peek()[0];// return the top value !!
    }

    public static void main(String[] args) {
        MinStack1 s = new MinStack1();
        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.println(s.getMin() + " ");
        s.pop();
        System.out.println(s.top() + " ");
        s.pop();
        System.out.println(s.getMin());
    }

}
