package data.structures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyLinkedListTests {
    MyLinkedList myLinkedList;

    @Before
    public void setup() {
        myLinkedList = new MyLinkedList();
    }

    @Test
    public void isEmptyTest() {
        assertEquals("Should be empty", true, myLinkedList.isEmpty());
    }

    @Test
    public void canAddFirstTest() {
        myLinkedList.add(4);

        assertEquals("Should not be empty", false, myLinkedList.isEmpty());
    }

    @Test
    public void canGetTest() {
        myLinkedList.add(4);
        myLinkedList.add(6);

        assertEquals("Should return 2nd element", 6, myLinkedList.get(2));
    }

    @Test
    public void getIndexExceptionTest() {
        myLinkedList.add(4);
        myLinkedList.add(6);

        try {
            Object actual = myLinkedList.get(3);
            fail("Did not throw expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Should throw IndexOutOfBoundsException", IndexOutOfBoundsException.class,
                    e.getClass());
        }
    }

    @Test
    public void getFirstTest() {
        myLinkedList.add(4);
        myLinkedList.add(6);

        assertEquals("Should return first element", 4, myLinkedList.getFirst());
    }

    @Test
    public void getLastTest() {
        myLinkedList.add(4);
        myLinkedList.add(6);

        assertEquals("Should return last element", 6, myLinkedList.getLast());
    }

    @Test
    public void containsTest() {
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(8);

        assertEquals("Should return 1 if value exists", 1, myLinkedList.contains(6));
    }

    @Test
    public void deleteOneTest() {
        myLinkedList.add("First");
        myLinkedList.delete("First");

        assertEquals("Should delete and make become empty", true, myLinkedList.isEmpty());
    }

    @Test
    public void deleteNoneExistTest() {
        myLinkedList.add("First");
        myLinkedList.delete("Second");

        assertEquals("Deletion should not have occurred as object does not exist",
                false, myLinkedList.isEmpty());
    }

    @Test
    public void deleteManyTest() {
        myLinkedList.add("First");
        myLinkedList.add("Second");
        myLinkedList.delete("Second");
        myLinkedList.delete("First");

        assertEquals("Should delete and make become empty", true, myLinkedList.isEmpty());
    }

    @Test
    public void deleteNthTest() {
        myLinkedList.add("First");
        myLinkedList.add("Second");
        myLinkedList.delete(2);

        assertEquals("Should delete 2nd node", -1, myLinkedList.contains("Second"));
    }

    @Test
    public void deleteNthExceptionTest() {
        myLinkedList.add("First");
        myLinkedList.add("Second");

        try {
            myLinkedList.delete(3);
            fail("Did not throw expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Should throw IndexOutOfBoundsException", IndexOutOfBoundsException.class,
                    e.getClass());
        }
    }
}
