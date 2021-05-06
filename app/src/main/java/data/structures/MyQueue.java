package data.structures;

public class MyQueue {

    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return this.head == null;
    }

    public void add(Object data) {
        Node node = new Node(data);

        head = (head == null) ? node : head;

        if (tail != null) { tail.next = node; }

        tail = node;
    }

    public Object peek() {
        try {
            return head.data;
        } catch (NullPointerException e) {
            return null;
        }

    }

    public Object remove() {
        try {
            Object data = head.data;

            head = head.next;

            tail = (head == null) ? null : tail;

            return data;
        } catch (NullPointerException e) {
            return null;
        }
    }
}
