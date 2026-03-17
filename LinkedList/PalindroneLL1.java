
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PalindroneLL1 {

    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;

        }

        Node(int value, Node next1) {
            data = value;
            next = next1;

        }

    }

    static class Solution {
        public void print(Node head) {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }

        public static boolean checkPalindrone(Node head) {
            Stack<Integer> stack = new Stack<>();
            Node temp = head;

            // first push all elemnets into teh stack
            while (temp != null) {
                stack.push(temp.data);
                temp = temp.next;
            }
            // reverse order : pop all ele and check whether equal or NOt
            temp = head;
            while (temp != null) {
                if (temp.data != stack.pop()) {
                    return false;// why not true ? if true written wth appropriate condition also , it would
                                 // return true right after a single conditio is true
                }
                temp = temp.next;
            }
            return true;// return true when all the conditions are checked !
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1);
        int N = 3;

        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));
        head.next.next.next.next = new Node(arr.get(4));
        Solution sol = new Solution();

        System.out.println("Original list:");
        sol.print(head);
        System.out.println();
        // head = Solution.checkPalindrone(head);
        if (Solution.checkPalindrone(head)) {
            System.out.println("YES THE GIVEN LL IS PALINDRONE");
        } else {
            System.out.println("ITS NOT PALINDRONE LL");
        }
    }

}
