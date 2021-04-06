package challenges;

import challenges.stackandqueues.animalshelter.Animal;
import challenges.stackandqueues.animalshelter.AnimalShelter;
import challenges.stackandqueues.animalshelter.Cat;
import challenges.stackandqueues.animalshelter.Dog;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test
    public void testEnqueueAndDequeue () throws Exception {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Dog("Bill"));
        test.enqueue(new Dog("Bob"));
        test.enqueue(new Cat("Mary"));
        test.enqueue(new Cat("Maxine"));
        test.enqueue(new Cat("Montana"));
        Cat trueOC = new Cat("Mary");
        assertEquals(trueOC.toString(), test.dequeue("cat").toString());
        test.dequeue("dog");
        String trueOD = test.dequeue("dog").toString();
        assertEquals("Dog{name='Bob'}", trueOD);
        assertNull(test.dequeue("dfsdd"));
        assertNull(test.dequeue("dfsdsdsad"));

    }
//    test all possible exception types
    @Test
    public void testException() throws Exception{
        AnimalShelter test = new AnimalShelter();
        assertThrows(Exception.class,()->{test.dequeue("dog");});
        assertThrows(Exception.class,()->{test.dequeue("cat");});
        assertThrows(Exception.class,()->{test.enqueue(new Animal("Bob"));});
    }
}
