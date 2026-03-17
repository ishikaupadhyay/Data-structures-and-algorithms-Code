
import java.util.Arrays;
import java.util.List;

public class RemoveNthfromEnd2 {
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

            // USING FAST AND SLOW POINTER:
            Node fast = head;
            Node slow = head;

            for (int i = 0; i < N; i++) {
                if (fast == null)
                    return head.next;
                fast = fast.next;
            }
            if (fast == null)
                return head.next;
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            // when fast reaches the end , It means : slow has reached to (L-N)TH node ..so
            // to delete L-N+1 the node : slow.next.next!
            slow.next = slow.next.next;

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
