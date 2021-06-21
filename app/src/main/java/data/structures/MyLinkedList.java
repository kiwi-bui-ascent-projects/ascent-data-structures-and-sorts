package data.structures;

public class MyLinkedList {
    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Object data) {
        if (head == null) {
            head = new Node(data);
            return;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = new Node(data);
        }
    }

    public Object get(int nth) {
        Node current = head;
        try {
            for (int i = 1; i < nth; i++) {
                current = current.next;
            }
            return current.data;
        } catch (NullPointerException e) {
            throw new IndexOutOfBoundsException();
        }
    }

    public Object getFirst() {
        return head == null ? null : head.data;
    }

    public Object getLast() {
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

    public int contains(Object object) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.data.equals(object)) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }


    public void delete(Object object) {
        Node current = head;

        if (current.data.equals(object)) {
            head = head.next;
        } else {
            Node next = head.next;
            while (next != null) {
                if (next.data.equals(object)) {
                    current.next = next.next;
                    break;
                } else {
                    current = next;
                    next = next.next;
                }
            }
        }
    }

    public void delete(int nth) {
        try {
            for (int i = 0; i < nth; i++) {
                head = head.next;
            }
        } catch (NullPointerException e) {
            throw new IndexOutOfBoundsException();
        }
    }
}
