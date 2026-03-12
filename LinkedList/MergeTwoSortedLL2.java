import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLL2 {
    // USING RECURSION:
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

            if (head1 == null) {
                return head2;

            }
            if (head2 == null) {
                return head1;
            }
            if (head1.data <= head2.data) {
                head1.next = merging(head1.next, head2);
                return head1;
            } else {
                head2.next = merging(head1, head2.next);
                return head2;
            }

        }

    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);

        System.out.println();
        Solution sol = new Solution();

        Node res = sol.merging(head1, head2);

        System.out.println("MERGED LIST :");
        Node temp = res;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
