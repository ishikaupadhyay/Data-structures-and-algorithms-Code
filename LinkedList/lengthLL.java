public class lengthLL {
    static class Node {
        int data;
        Node next;

        Node(int value) {
            value = data;
            next = null;

        }
    }

    static class Solution {
        public static int FindLengthLL(Node head) {
            Node temp = head;
            int count = 0;

            while (temp != null) {
                count++;
                temp = temp.next;// aage badhte chalooooooo
            }

            return count;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(7);
        head.next = new Node(3);
        head.next.next = new Node(9);
        head.next.next.next = new Node(2);

        Solution sol = new Solution();
        System.out.println("LENGTH OF THE LINKED LIST : " + sol.FindLengthLL(head));

    }
}
