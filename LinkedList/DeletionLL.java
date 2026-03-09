public class DeletionLL {

    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    static class Solution {
        public Node DeleteNode(Node head) {
            // If there's no no node in the LL - return null
            // if only one node in the LL - return null
            if (head == null || head.next == null) {
                return null;
            }

            Node curr = head;// 1st node is = curr node
            while (curr.next.next != null) {// in order to traverse to the last second element
                curr = curr.next;// yeh aage badhata jaegaa , ek ek krkee
            }

            curr.next = null;
            /*
             * it removes the connection bw the second last & last node
             * anjd pts the second last node to NULL
             * means auto matically your last node gets removed
             */

            return head;// it returns the new one1
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(7);
        head.next.next = new Node(5);

        System.out.print("original list :");
Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
        Solution obj = new Solution();
        head = obj.DeleteNode(head);

        System.out.println();
        // printing list after deletion;
        System.out.print("LIST AFTER DELELTING LAST ELEMENT : ");
         temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
