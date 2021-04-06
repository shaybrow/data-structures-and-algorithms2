package challenges;

import challenges.stackandqueues.animalshelter.AnimalShelter;
import challenges.stackandqueues.animalshelter.Dog;
import org.checkerframework.checker.units.qual.A;
import org.junit.Test;

public class AnimalShelterTest {
    @Test
    public void testEnqueueAndDequeue () throws Exception {
        AnimalShelter test = new AnimalShelter();
        test.enqueue(new Dog("Bill"));

    }
}
