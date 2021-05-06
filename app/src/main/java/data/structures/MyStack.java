package data.structures;

public class MyStack {

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Object data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public Object peek() {
        try {
            return top.data;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public Object pop() {
        try {
            Object data = top.data;
            top = top.next;
            return data;
        } catch (NullPointerException e) {
            return null;
        }
    }
}
