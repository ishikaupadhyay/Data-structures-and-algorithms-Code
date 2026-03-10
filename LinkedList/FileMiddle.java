public class FileMiddle {

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
            // edge cases :
            if (head == null || head.next == null) {
                return head;
            }
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }

            // Calculating the position of the node :
            int mid = (count / 2) + 1;
            // to know the exact element in ll (as direclty any elemnent cant be accessed
            // like we do in Array)
            temp = head;
            while (temp != null) {
                mid--;

                if (mid == 0) {
                    break;
                }
                temp = temp.next;
            }
            return temp;
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
        System.out.println("MIDDLE ELEMENT IN THE LL : "+middlNode.data);
    }
}
