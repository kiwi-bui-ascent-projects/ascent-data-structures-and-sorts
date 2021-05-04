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

        assertEquals("Linked list should be empty", false, myLinkedList.isEmpty());
    }

    @Test
    public void canGetTest() {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(4);
        myLinkedList.add(6);

        assertEquals("Linked list should be empty", 6, myLinkedList.get(2));
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
}
