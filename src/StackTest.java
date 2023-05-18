package src;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StackTest {

    private Mystack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Mystack();
    }

    @Test
    public void newStack_isEmpty() throws Exception {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterOnePush_isNotEmpty() throws Exception {
        stack.push(0);
        assertFalse(stack.isEmpty());
    }

    @Test(expected = Mystack.Underflow.class)
    public void willThrowUnderflow_WhenEmptyStackIsPopped() throws Exception {
        stack.pop();

    }

    @Test
    public void afterOnePushAndOnePop_WillBeEmpty() throws Exception {
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterTwoPushesAndOnePop_WilNotBeEmpty() throws Exception {
        stack.push(0);
        stack.push(0);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterPushingX_WillPopX() throws Exception {
        stack.push(99);
        assertEquals(99, stack.pop());
        stack.push(88);
        assertEquals(88, stack.pop());
    }

    @Test
    public void afterPushingXandY_WillPopYThenX() throws Exception {
        stack.push(99);
        stack.push(88);
        assertEquals(88, stack.pop());
        assertEquals(99, stack.pop());

    }

    @Test
    public void afterThreePushesAndTwoPops_WillPopX() throws Exception {
        stack.push(99);
        stack.push(88);
        stack.push(77);
        stack.pop();
        assertEquals(88, stack.pop());
    }

}