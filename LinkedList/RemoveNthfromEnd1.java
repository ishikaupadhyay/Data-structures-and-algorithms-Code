import java.util.Arrays;
import java.util.List;

public class RemoveNthfromEnd1 {
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

        public static Node deleteNode(Node head, int N) {

            if (head == null) {
                return null;
            }
            // calcuating the length of the LL
            int cnt = 0;
            Node temp = head;

            while (temp != null) {
                cnt++;
                temp = temp.next;
            }

            if (cnt == N) {
                return head.next;// returns the head element!
            }
            int res = cnt - N;
            temp = head;

            while (temp != head) {
                res--;
                if (res == 0) {
                    break;
                }
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return head;
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int N = 3;

        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));
        head.next.next.next.next = new Node(arr.get(4));
        Solution sol = new Solution();

        System.out.println("Original list:");
        sol.print(head);

        head = Solution.deleteNode(head, N); // Update head in case the first node was deleted
        System.out.println("");
        System.out.println("After deleting " + N + "rd from end:");
        sol.print(head);

    }
}
