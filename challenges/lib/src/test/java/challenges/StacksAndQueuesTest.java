package challenges;

import challenges.stackandqueues.Queue;
import challenges.stackandqueues.Stack;
import org.junit.Test;
import static org.junit.Assert.*;
public class StacksAndQueuesTest {

//    can push single/multiple values onto stack and pop top number
    @Test public void testStackPushandPop() throws Exception {
//        Stack trueOut = new Stack();
//        trueOut.push(1);
//        int trueOutput = trueOut.pop();
//        int expectOut = 1;
//        assertEquals(expectOut, trueOutput);
//        trueOut.push(4);
//        trueOut.push(3);
//        trueOutput = trueOut.pop();
//        expectOut = 3;
//        assertEquals(expectOut, trueOutput);
////        trueOutput = trueOut.pop();
//        expectOut = 4;
//        assertEquals(expectOut, trueOutput);


    }
    @Test public void testPeek() throws Exception{
//        testing can peek top value
//        Stack test = new Stack();
//        test.push(1);
//        test.push(2);
//        int trueOut = test.peek();
//        int expectOut = 2;
//        assertEquals(expectOut,trueOut);
//        test.pop();
//        trueOut = test.peek();
//        expectOut = 1;
//        assertEquals(expectOut,trueOut);
    }
    @Test public void testEmptyStack () throws Exception {
        //  confirms empty stack is empty
        Stack test = new Stack();
        boolean trueOutput = test.isEmpty();
        assertTrue(trueOutput);

//        confirms pop on empty stack throws exception
        test.push(2);
        test.pop();
        assertThrows(Exception.class,()->{test.pop();});
        assertThrows(Exception.class,()->{test.peek();});
//        assertThrows(ExceptionType.class, ()-> {method();});

//       confirms is empty after multiple pops
        trueOutput = test.isEmpty();
        assertTrue(trueOutput);

    }
    @Test public void testEnqueueAndDequeueAndPeek () throws Exception {
//        confirm enqueue multiples and dequeue expected val
        Queue test = new Queue();
        test.enqueue(5);
        test.enqueue(6);
        int expectOut = 5;
//        tests need to be refactored due to generic typing implemented
//        int trueOut = test.dequeue();
//        assertEquals(expectOut, trueOut);
//        expectOut = 6;
//        trueOut = test.peek();
//        assertEquals(expectOut, trueOut);

    }
//    test all empty queue expections
    @Test public void testEmptyQueue () throws Exception {
        Queue test = new Queue();
        boolean trueOutB = test.isEmpty();
        assertTrue(trueOutB);

        test.enqueue(10);
        test.enqueue(20);
        test.enqueue(25);
        test.enqueue(30);

        test.dequeue();
        test.dequeue();
        test.dequeue();
        test.dequeue();

        trueOutB = test.isEmpty();
        assertTrue(trueOutB);

        assertThrows(Exception.class,()->{test.dequeue();});
        assertThrows(Exception.class,()->{test.peek();});



    }

}
