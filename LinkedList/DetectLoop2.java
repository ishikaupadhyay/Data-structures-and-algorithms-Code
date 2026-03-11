import java.util.HashMap;
import java.util.HashSet;

public class DetectLoop2 {

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

        public boolean detectLL(Node head) {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null && slow == null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast)
                    return true;// agr dono mil gye mtlb loop exists

            }
            return false;
        }

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        // fifth.next = third;

        System.out.println();
        Solution sol = new Solution();

        if (sol.detectLL(head)) {
            System.out.println("LOOP DETECTED!");
        } else {
            System.out.println("NO LOOP DETECTED!!");
        }

    }
}
