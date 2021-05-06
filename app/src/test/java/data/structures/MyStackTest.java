package data.structures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyStackTest {

    @Test
    public void stackIsEmptyTest() {
        MyStack stack = new MyStack();

        boolean expected = true;
        boolean actual = stack.isEmpty();

        assertEquals("New stack should be empty", expected, actual);
    }

    @Test
    public void stackPushTest() {
        MyStack stack = new MyStack();

        stack.push(4);
        boolean expected = false;
        boolean actual = stack.isEmpty();

        assertEquals("Stack should be not be empty after adding one node", expected, actual);
    }

    @Test
    public void stackPeekTest() {
        MyStack stack = new MyStack();

        stack.push(4);
        Object expected = 4;
        Object actual = stack.peek();

        assertEquals("Stack peek should return 4", expected, actual);
    }

    @Test
    public void stackPopTest() {
        MyStack stack = new MyStack();

        stack.push(4);
        stack.push(6);
        Object expected = 6;
        Object actual = stack.pop();

        assertEquals("Stack pop should return most recently added", expected, actual);
    }
}
