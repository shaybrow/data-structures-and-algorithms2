package challenges.utilities;

import java.util.ArrayList;
import java.util.List;

public class FindString {
    /* ------------------------------------------------------------------------------------------------
    CHALLENGE 7 - Stretch Goal
    Write a function named findAnything that takes in an array of strings, along with a target string. Return an array containing only those strings from the original array that contain the target string.
    ------------------------------------------------------------------------------------------------ */
    public static List<String> findString (String [] inputArray, String target){
        if (inputArray == null || target == null) return null;
        List<String> output = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].contains(target)) output.add(inputArray[i]);
        }
        return output;
    }
}
