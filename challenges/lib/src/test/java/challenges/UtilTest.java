package challenges;

import challenges.utilities.FindString;
import challenges.utilities.FirstLetter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testFindString (){

        String test = "xd";

        String [] input = {"xddd", "lmaoxd", "gottem", "ex  D", "z"};
        List<String> trueOut = FindString.findString(input, test);
        List<String> expect = new ArrayList<>();
        expect.add("xddd");
        expect.add("lmaoxd");
        assertEquals(trueOut, expect);

       
    }
}
