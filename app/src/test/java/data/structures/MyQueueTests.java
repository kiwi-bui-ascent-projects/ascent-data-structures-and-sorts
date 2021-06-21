package data.structures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyQueueTests {
    MyQueue myQueue;

    @Before
    public void setup() {
        myQueue = new MyQueue();
    }

    @Test
    public void queueIsEmptyTest() {
        boolean expected = true;
        boolean actual = myQueue.isEmpty();

        assertEquals("Should be empty", expected, actual);
    }

    @Test
    public void queueAddTest() {
        myQueue.add(4);

        boolean expected = false;
        boolean actual = myQueue.isEmpty();

        assertEquals("Should not be empty after adding", expected, actual);
    }

    @Test
    public void queuePeekTest() {
        myQueue.add(4);

        Object expected = 4;
        Object actual = myQueue.peek();

        assertEquals("Peek should return 4", expected, actual);
    }

    @Test
    public void queueRemoveTest() {
        myQueue.add(4);
        myQueue.add(6);
        myQueue.add(8);

        Object expected = 6;

        myQueue.remove();

        Object actual = myQueue.remove();

        assertEquals("Should return 6 after removing", expected, actual);
    }
}
