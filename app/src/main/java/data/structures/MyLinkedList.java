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

    public boolean isEmpty() {
        return (head == null) ? true : false;
    }

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
    }

    public int get(int i) {
        Node current = head;

        for (int j = 0; j < i; j++) {
            current = current.next;
        }

        try {
            return current.data;
        } catch (NullPointerException e) {
            throw new IndexOutOfBoundsException();
        }
    }
}
