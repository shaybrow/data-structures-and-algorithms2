package challenges;

import challenges.stackandqueues.PseudoQueue;
import challenges.stackandqueues.Queue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PseudoQueueTest {
    @Test
    public void testEnqueueAndDequeueAndPeek () throws Exception {
//        confirm enqueue multiples and dequeue expected val
        PseudoQueue test = new PseudoQueue();
        test.enqueue(5);
        test.enqueue(6);
        int expectOut = 5;
        int trueOut = test.dequeue();
        assertEquals(expectOut, trueOut);
        expectOut = 6;
        trueOut = test.dequeue();
        assertEquals(expectOut, trueOut);

    }
}
