package challenges;

import challenges.utilities.InsertionSort;
import challenges.utilities.QuickSort;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {


    @Test
    public void testThing (){

    int [] test = {8,4,23,42,16,15};
    int left = 0;
    int right = test.length -1 ;
    QuickSort.quickSort(test, left, right);
    InsertionSort.printArray(test);
    int [] expect = {4,8,15,16,23,16};
    assertArrayEquals(expect, test);



    }
}
