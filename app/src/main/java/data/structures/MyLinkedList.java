package data.structures;

@SuppressWarnings("DuplicatedCode")
public class MyLinkedList {
    Node head;

    public boolean isEmpty() {
        return (head == null) ? true : false;
    }

    public void add(Object data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
    }

    public Object get(int nth) {
        Node current = head;

        for (int j = 0; j < nth - 1; j++) {
            current = current.next;
        }

        try {
            return current.data;
        } catch (NullPointerException e) {
            throw new IndexOutOfBoundsException();
        }
    }

    public Object getFirst() {
        return head.data;
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
        if (head.data.equals(object)) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current != null) {
            if (current.next.data.equals(object)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void delete(int nth) {
        if (nth == 1) {
            head = head.next;
            return;
        }
        Node current = head;

        try {
            for (int j = 0; j < nth - 2; j++) {
                current = current.next;
            }

            current.next = current.next.next;
        } catch (NullPointerException e) {
            throw new IndexOutOfBoundsException();
        }
    }
}
