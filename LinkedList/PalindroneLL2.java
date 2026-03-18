
public class PalindroneLL2 {

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

        public static Node reverse(Node head) {
            if (head == null || head.next == null) {
                return head;
            }
            // reversing
            Node newhead = reverse(head.next);
            Node front = head.next;
            front.next = head;
            head.next = null;

            return newhead;
        }

        public static boolean checkPalindrone(Node head) {

            if (head == null || head.next == null) {
                return true;

            }
            Node slow = head;
            Node fast = head;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;// this moves fast & slow ptr gradually!
            }
            // reversing the second half
            Node newhead = reverse(slow.next);
            // checking the ptrs of first half and 2nd(reverse half ):

            Node first = head;
            Node second = newhead;

            while (second != null) {
                if (first.data != second.data) {
                    return false;
                }
                first = first.next;
                second = second.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(1);
        // Node head.next.next.next=new Node(3);
        // Node head.next.next.next.next=new Node(2);
        // Node head.next.next.next.next.next=new Node(1);

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
