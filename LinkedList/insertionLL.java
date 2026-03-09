public class insertionLL {

    static class Node {
        int data;
        Node next;

        // constructor with data and the next ptr
        Node(int data1, Node next1) { // used in order to assign value to the head !
            data = data1;
            next = next1;

        }

        // constructor wth only data
        Node(int data1) { // used whn creating a single node
            data = data1;
            next = null;
        }
    }

    static class Solution {
        // functiom to insert a new nide at the head (starting)
        public Node insertNode(Node head, int newData) {
            Node newnNode = new Node(newData, head);
            return newnNode;
        }

        public void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // creating a sample ll:

        Node head = new Node(3);
        head.next = new Node(5);

        System.out.print("original list :");
        sol.printList(head);

        // INSERTING NEW NODE AT HEAD :
        head = sol.insertNode(head, 1);
        System.out.println();
        System.out.print("After Insertion at Head: ");

        sol.printList(head);
    }
}
