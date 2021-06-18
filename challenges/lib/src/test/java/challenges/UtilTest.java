package challenges;

import challenges.utilities.FirstLetter;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void testFirstLetter (){

        String test = "asd aasdff asddfd fff zz";

        String [] expect = {"a", "a", "a", "f", "z"};
        String [] trueOut = FirstLetter.firstLetter(test);
        assertArrayEquals(trueOut, expect);

        String none = null;
        assertNull(FirstLetter.firstLetter(none));
    }


}
