package challenges;

import challenges.utilities.ArrayMaxThreeMultiplied;
import challenges.utilities.BattleShip;
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
    @Test
    public void testBattleShip (){
        String [][] board = {{"", "#", "#", ""},
                             {"", "" , "", ""},
                             {"#", "#", "#",""}};
        String expect = "Hit!";
        String fire = BattleShip.fire(board, 0, 2);
        assertEquals(expect, fire);
        expect = "Out of bounds";
        fire = BattleShip.fire(board, 4, 0);
        assertEquals(expect, fire);
    }
    @Test
    public void testArrayMaxThreeMultiplied () throws Exception {
        int test [] = {59,0,23,63,45,100};
        int expect = 371700;
        int actual = ArrayMaxThreeMultiplied.findMax(test);
        assertEquals(expect, actual);
        int test2[] = {-20, 100, -50, 0 , 10, 20};
        expect = 100000;
        actual = ArrayMaxThreeMultiplied.findMax(test2);
        assertEquals(expect, actual);
    }
}
