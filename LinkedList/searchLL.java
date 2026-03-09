public class searchLL {

    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;

        }
    }

    static class Solution {
        public static boolean SearchLL(Node head, int k) {
            Node curr = head;

            while (curr != null) {
                if (curr.data == k) {
                    return true;
                }
                curr = curr.next;// aage badhte chaloo
            }
            return false;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(7);
        head.next = new Node(3);
        head.next.next = new Node(9);
        head.next.next.next = new Node(2);

        Solution sol = new Solution();
        if (sol.SearchLL(head, 9)) {
            System.out.println(" VALUE FOUND");
        } else {
            System.err.println("NOT FOUND!");
        }

    }
}
