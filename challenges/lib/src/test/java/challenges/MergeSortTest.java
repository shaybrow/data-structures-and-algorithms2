package challenges;
import challenges.utilities.InsertionSort;
import challenges.utilities.MergeSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
public class MergeSortTest {

    @Test
    public void mergeSortTest (){
        int [] test = {8,4,23,42,16,15};
        MergeSort.mergeSort(test);

        int [] expect = {4,8,15,16,23,42};
        assertArrayEquals(expect, test);
        InsertionSort.printArray(test);
        int [] test1 = {2, 10, 3, 6};
        MergeSort.mergeSort(test1);

        int [] expect1 = {2,3,6,10};
        InsertionSort.printArray(test1);
        assertArrayEquals(expect1, test1);


    }


}
