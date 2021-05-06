package challenges;

import challenges.LeftJoin.LeftJoin;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void testLeftJoin (){
        HashMap hmLeft = new HashMap();
        HashMap hmRight = new HashMap();
//        test null HM inputs
        assertNull(LeftJoin.leftJoin(hmLeft, hmRight));
        hmLeft.put("Right", "Correct");
        hmLeft.put("Far", "Away");
        hmLeft.put("Sneak", "Scuttle");

//        test left only
        List actualOut = LeftJoin.leftJoin(hmLeft, hmRight);
//        System.out.println(actualOut.toString());
        String expect = "[[Sneak, Scuttle], [Far, Away], [Right, Correct]]";
        assertEquals("Should create a list of lists with key then value", actualOut.toString(), expect);
//        test left and right with one set not duplicated on each side
        hmRight.put("Right", "Wrong");
        hmRight.put("Far", "Near");
        hmRight.put("Confidence", "Doubt");
        List actual1 = LeftJoin.leftJoin(hmLeft, hmRight);
//        System.out.println(actual1.toString());
        String expect1 = "[[Sneak, Scuttle], [Far, Away, Near], [Right, Correct, Wrong]]";
        assertEquals(actual1.toString(), expect1);

    }

}
