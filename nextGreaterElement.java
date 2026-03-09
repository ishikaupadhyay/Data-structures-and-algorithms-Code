import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {
    public int[] FindNextGreaterElement(int arr[]) {

        // creating a satck inw which elemment pushing(appropraiet one) will take place
        Stack<Integer> st = new Stack<>();

        int[] resultarr = new int[arr.length];// to store the result arr

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                resultarr[i] = -1;
            } else {
                resultarr[i] = st.peek();// jo sbse top pr hai wahi ans hai!
            }
            st.push(arr[i]);
        }     
        return resultarr;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        nextGreaterElement result = new nextGreaterElement();
        int ans[] = result.FindNextGreaterElement(arr);
        System.out.println(Arrays.toString(ans));
    }
}
