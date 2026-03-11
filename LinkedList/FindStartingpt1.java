
import java.util.HashMap;
import java.util.HashSet;

public class FindStartingpt1 {

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

        public static Node detectLL(Node head) {
            Node temp = head;
            HashSet<Node> nodes = new HashSet<>();

            while (temp != null) {
                if (nodes.contains(temp)) {
                    return temp;// agr hashmap mai koi value repear horahi h , so declare that there's a loop
                }
                nodes.add(temp);

                temp = temp.next;// aaage badhte chalooooo!!
            }
            return null;
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
        fifth.next = third;

        System.out.println();
        // Solution sol = new Solution();

        Node startNode = Solution.detectLL(head);

        if (startNode != null) {
            System.out.println("STARTING POINT OF THE LOOP :" + startNode.data);
        } else {
            System.out.println("NO LOOP DETECTED!!");
        }

    }
}
