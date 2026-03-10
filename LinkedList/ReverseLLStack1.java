
import java.util.Stack;

public class ReverseLLStack1 {

    static class Node {
        int data;
        Node next;

        Node(int data1, Node next1) {
            data = data1;
            next = next1;
        }

        Node(int data1) {
            data = data1;
            next = null;
        }
    }

    public static class Solution {

        public Node reverseLL(Node head) {
            Stack<Integer> stack = new Stack<>();

            Node temp = head;

            while (temp != null) {
                stack.push(temp.data);
                temp = temp.next;
            }

            // RESET : back to head
            // and then : pop out elements frm the stack !
            temp = head;
            while (temp != null) {
                temp.data = stack.pop();
                temp = temp.next;
            }
            return head;
        }

    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(7);
        head.next.next = new Node(5);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(1);

        System.out.println("ORIGINAL LL");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        Solution sol = new Solution();
        head = sol.reverseLL(head);


        System.out.println("REVERSED LINKED LIST : ");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
