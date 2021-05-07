package data.structures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyStackTest {
    @Test
    public void stackIsEmptyTest() {
        MyStack stack = new MyStack();

        boolean expected = true;
        boolean actual = stack.isEmpty();

        assertEquals("Should be empty", expected, actual);
    }

    @Test
    public void stackPushTest() {
        MyStack stack = new MyStack();

        stack.push(4);
        boolean expected = false;
        boolean actual = stack.isEmpty();

        assertEquals("Should be not be empty after adding", expected, actual);
    }

    @Test
    public void stackPeekTest() {
        MyStack stack = new MyStack();

        stack.push(4);
        Object expected = 4;
        Object actual = stack.peek();

        assertEquals("Peek should return 4", expected, actual);
    }

    @Test
    public void stackPopTest() {
        MyStack stack = new MyStack();

        stack.push(4);
        stack.push(6);
        Object expected = 6;
        Object actual = stack.pop();

        assertEquals("Should return most recently added", expected, actual);
    }
}
