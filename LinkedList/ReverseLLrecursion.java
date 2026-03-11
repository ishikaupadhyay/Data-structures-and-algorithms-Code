public class ReverseLLrecursion {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data1, Node next1, Node prev1) {
            data = data1;
            prev = prev1;
            next = next1;
        }

        Node(int data1) {
            data = data1;
            next = null;
            prev = null;
        }
    }

    public static class Solution {

        public Node reverseLL(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node newHead = reverseLL(head.next);
            Node front = head.next;
            front.next = head;
            head.next = null;

            return newHead;
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
