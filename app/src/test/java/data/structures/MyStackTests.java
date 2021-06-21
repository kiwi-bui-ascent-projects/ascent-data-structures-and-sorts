package data.structures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyStackTests {
    MyStack myStack;

    @Before
    public void setup() {
        myStack = new MyStack();
    }

    @Test
    public void myStackIsEmptyTest() {
        boolean expected = true;
        boolean actual = myStack.isEmpty();

        assertEquals("Should be empty", expected, actual);
    }

    @Test
    public void myStackPushTest() {
        myStack.push(4);

        boolean expected = false;
        boolean actual = myStack.isEmpty();

        assertEquals("Should be not be empty after adding", expected, actual);
    }

    @Test
    public void myStackPeekTest() {
        myStack.push(4);

        Object expected = 4;
        Object actual = myStack.peek();

        assertEquals("Peek should return 4", expected, actual);
    }

    @Test
    public void myStackPopTest() {
        myStack.push(4);
        myStack.push(6);

        Object expected = 6;
        Object actual = myStack.pop();

        assertEquals("Should return most recently added", expected, actual);
    }
}
