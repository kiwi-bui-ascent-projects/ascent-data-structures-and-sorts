package data.structures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class MyLinkedListTest {
    @Test
    public void isEmptyTest() {
        MyLinkedList myLinkedList = new MyLinkedList();

        assertEquals("New linked list should be empty", true, myLinkedList.isEmpty());
    }

    @Test
    public void canAddFirstTest() {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(4);

        assertEquals("Linked list should not be empty", false, myLinkedList.isEmpty());
    }

    @Test
    public void canGetTest() {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(4);
        myLinkedList.add(6);

        assertEquals("Should get 2nd element", 6, myLinkedList.get(2));
    }

    @Test
    public void getThrowExceptionTest() {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(4);
        myLinkedList.add(6);

        try {
            myLinkedList.get(3);
            fail("Did not throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Should throw IndexOutOfBoundsException", IndexOutOfBoundsException.class,
                    e.getClass());
        }
    }

    @Test
    public void getFirstTest() {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(4);
        myLinkedList.add(6);

        assertEquals("Should get first element", 4, myLinkedList.getFirst());
    }

    @Test
    public void getLastTest() {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(4);
        myLinkedList.add(6);

        assertEquals("Should get last element", 6, myLinkedList.getLast());
    }

    @Test
    public void containsTest() {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(8);

        assertEquals("Should index of object", 1, myLinkedList.contains(6));
    }

    @Test
    public void deleteTest() {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("First");
        myLinkedList.add("Second");
        myLinkedList.delete("Second");
        myLinkedList.delete("First");

        assertEquals("Should delete and make linked list empty", true, myLinkedList.isEmpty());
    }

    @Test
    public void deleteNthTest() {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("First");
        myLinkedList.add("Second");
        myLinkedList.delete(2);

        assertEquals("Linked list should not contain 'test'", -1, myLinkedList.contains("Second"));
    }

    @Test
    public void deleteNthExceptionTest() {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("First");
        myLinkedList.add("Second");

        try {
            myLinkedList.delete(3);
            fail("Did not throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Should throw IndexOutOfBoundsException", IndexOutOfBoundsException.class,
                    e.getClass());
        }
    }
}
