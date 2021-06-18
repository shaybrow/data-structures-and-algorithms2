package challenges.utilities;

import java.util.ArrayList;
import java.util.List;

public class CharacterByIndex {
    /* ------------------------------------------------------------------------------------------------
CHALLENGE 11 - Stretch Goal
Write a function named characterByIndex that takes in an array of strings and returns an array containing the first character of the first string, the second character of the second string, etc.
For example, ['abcd', 'efgh', 'ijkl', 'mnop'] returns ['a', 'f', 'k', 'p']
------------------------------------------------------------------------------------------------ */

    public static List<String> charByIndex (String [] input){
        List<String> output = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            char x = input[i].charAt(i);
            output.add(Character.toString(x));
        }
        return output;
    }
}
