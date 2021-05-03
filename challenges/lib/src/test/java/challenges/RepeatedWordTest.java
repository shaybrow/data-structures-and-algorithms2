package challenges;
import challenges.RepeatedWord.RepeatedWord;
import org.junit.Test;

import static org.junit.Assert.*;
public class RepeatedWordTest {

    @Test
    public void testRepeatedWord(){
//        test casing
        String test = "The cat in the hat";
        String repeat = RepeatedWord.repeatedWord(test);

        String expect = "the";
        assertEquals(expect, repeat);

//        test close but no repeat
        test = "the dog climbed a log and then fell off";
        assertNull(RepeatedWord.repeatedWord(test));

//        test empty string
        test = "";
        assertNull(RepeatedWord.repeatedWord(test));






    }
}
