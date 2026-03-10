public class insertionDLL {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data1, Node next1, Node prev1) {// constructor used when all paramters are provided
            data = data1;
            next = next1;
            prev = prev1;
        }

        Node(int data1) {// when only data is provided!
            data = data1;
            next = null;
            prev = null;
        }
    }

    static class solution {
        public static Node converArr2DLL(int[] arr) {
            Node head = new Node(arr[0]);
            Node prev = head;// prev ko initatialize kr dia haii

            for (int i = 1; i < arr.length; i++) {
                Node temp = new Node(arr[i], null, prev);
                prev.next = temp;// forms links b/w each varible
                prev = temp;// yeh chng krta rheta haii prev ptr ko
            }
            return head;
        }

        public static void printList(Node head) {
            while (head != null) {
                System.out.print(head.data+"  ");
                head = head.next;
            }
            System.out.println();
        }

        public static Node insertatTail(Node head, int k) {
            Node newNode = new Node(k);

            if (head == null) {
                return newNode;
            }

            Node tail = head;
            // tarversin to the last node in LL :
            while (tail.next != null) {
                tail = tail.next;
            }

            tail.next = newNode;
            newNode.prev = tail;

            return head;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 6, 7 };
        int k = 9;
        Node head = solution.converArr2DLL(arr);
        System.out.println("ORIGINAL LL ");
        solution.printList(head);

        System.out.println("AFTER INSERTION:");
        head = solution.insertatTail(head, k);
        solution.printList(head);

    }

}
