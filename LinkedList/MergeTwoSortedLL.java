import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLL {

    static class Node {
        int data;
        Node next;
        // Node prev;

        Node(int data1, Node next1, Node prev1) {
            data = data1;
            // prev = prev1;
            next = next1;
        }

        Node(int data1) {
            data = data1;
            next = null;
            // prev = null;
        }
    }

    public static class Solution {

        public static Node merging(Node head1, Node head2) {
            ArrayList<Integer> arr = new ArrayList<>();

            while (head1 != null) {
                arr.add(head1.data);
                head1 = head1.next;
            }
            while (head2 != null) {
                arr.add(head2.data);
                head2 = head2.next;
            }

            Collections.sort(arr);

            Node newNode = new Node(-1);
            Node curr = newNode;

            for (int i = 0; i < arr.size(); i++) {
                curr.next = new Node(arr.get(i));
                curr = curr.next;
            }
            return newNode.next;
        }

    }

    public static void main(String[] args) {
        Node head1 = new Node(2);
        head1.next = new Node(7);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(8);
        head1.next.next.next.next = new Node(1);

        Node head2 = new Node(5);
        head2.next = new Node(3);
        head2.next.next = new Node(0);
        head2.next.next.next = new Node(9);
        head2.next.next.next.next = new Node(4);

        System.out.println();
        Solution sol = new Solution();

        Node res = sol.merging(head1, head2);

        System.out.println("MERGED LIST :");
        Node temp = res;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
}
