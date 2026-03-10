public class FindMiddle2 {

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

        static Node ReturnMiddle(Node head) {
            /*
             * APPROACH :
             * fast ptr : jumps 2 elments aage aage
             * SLOW ptr : 1 -1 aage badhta haii
             */
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null && slow != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
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
        Node middlNode = Solution.ReturnMiddle(head);
        System.out.println("MIDDLE ELEMENT IN THE LL : " + middlNode.data);
    }
}
