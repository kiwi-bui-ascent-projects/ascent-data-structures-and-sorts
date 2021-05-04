package data.structures;

public class MyLinkedList {
    public class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public Object isEmpty() {
        return (head == null) ? true : false;
    }

}
