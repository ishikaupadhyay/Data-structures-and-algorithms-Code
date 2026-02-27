import java.util.Arrays;
import java.util.Stack;

public class nextGreaterEle22 {
    public int[] FindNextGreaterElement(int arr[]) {
        int n = arr.length;
        // creating a satck inw which elemment pushing(appropraiet one) will take place
        Stack<Integer> st = new Stack<>();

        int[] resultarr = new int[arr.length];// to store the result arr

        for (int i = (2 * n - 1); i >= 0; i--) {
            // 2n-1=makes circuar array rotation possible!!
            int ind = i % n;

            while (!st.isEmpty() && st.peek() <= arr[ind]) {
                st.pop();
            }

            if (st.isEmpty()) {
                resultarr[ind] = -1;
            } else {
                resultarr[ind] = st.peek();// jo sbse top pr hai wahi ans hai!
            }

            st.push(arr[ind]);
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
