package data.structures;

public class MyQueue {
    private Node head;
    private Node tail;

    public class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void add(Object data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else if (tail == null) {
            head.next = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public Object peek() {
        return head.data;
    }

    public Object remove() {
        Object data = head.data;

        head = head.next;

        tail = (head == null) ? null : tail;

        return data;
    }
}
