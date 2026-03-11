import java.util.HashMap;
import java.util.HashSet;

public class DetectLoop {

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
            Node temp = head;
            HashMap<Node, Integer> nodes = new HashMap<>();

            while (temp != null) {
                if (nodes.containsKey(temp)) {
                    return true;// agr hashmap mai koi value repear horahi h , so declare that there's a loop
                }
                nodes.put(temp, 1);

                temp = temp.next;// aaage badhte chalooooo!!
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
        fifth.next = third;

      
        System.out.println();
        Solution sol = new Solution();

        if (sol.detectLL(head)) {
            System.out.println("LOOP DETECTED!");
        } else {
            System.out.println("NO LOOP DETECTED!!");
        }

    }
}
