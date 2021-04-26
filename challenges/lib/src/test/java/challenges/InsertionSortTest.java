package challenges;
import challenges.utilities.InsertionSort;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class InsertionSortTest {

    @Test
    public void insertionSortTest (){


        int [] test = {8,4,23,42,16,15};
        InsertionSort.insertionSort(test);

        int [] expect = {4, 8, 15, 16, 23, 42 };

//                assertArrayEquals(expect, test);
                assertArrayEquals(expect, test);
        int [] test1 = {8,4,23,42,16,15, 28, 900, -1};
        InsertionSort.insertionSort(test1);

        int [] expect1 = {-1, 4, 8, 15, 16, 23, 28, 42, 900 };
        assertArrayEquals(expect1, test1);
    }
}
