package challenges;

import challenges.Utilities.MainFile;
import org.junit.Test;


import static org.junit.Assert.*;
public class multiBracketTest {




    @Test
        public void testMultiBracketValidate () throws Exception {
            String test = "{}[]()";
            MainFile mainFile = new MainFile();
//          test easy
            assertTrue(mainFile.multiBracketValidation(test));
//            testing close bracket with no open
            test = "}()[sda]";
            assertFalse(mainFile.multiBracketValidation(test));
//            testing same type bracket closed correct inside
            test = "[[]](df)";
            assertTrue(mainFile.multiBracketValidation(test));
//            testing open bracket never closed
            test = "[]](df)";
            assertFalse(mainFile.multiBracketValidation(test));
//            testing wrong brackets close
            test = "[{]}";
            assertFalse(mainFile.multiBracketValidation(test));
//            test end with open bracket
            test = "()(";
            assertFalse(mainFile.multiBracketValidation(test));
        }
}
