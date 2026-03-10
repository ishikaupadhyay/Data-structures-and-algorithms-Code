public  class DoubleLL {
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
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 6, 7 };

        Node head = new Node(arr[0]);
        /*
         * Node= DATA TYPE(custom class)
         * head=reference variable
         * new= alocating memory
         * Node(arr[0])..calling the second constructor
         */

        System.out.println(head);// prints the address of arr[0]
        System.out.println(head.data);


        head.next=new Node(arr[1]);
        System.out.println(head.next.data);









    }
}
