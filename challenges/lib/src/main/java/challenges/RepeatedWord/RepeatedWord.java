package challenges.RepeatedWord;


import java.util.Hashtable;
import java.util.Locale;

public class RepeatedWord {

    public static String repeatedWord(String input){
        Hashtable<String, Integer> tracker  = new Hashtable<String, Integer>() ;
        String [] arr = splitBySpaces(input);
        for (int i = 0; i < arr.length; i++) {
            if (tracker.get(arr[i].toLowerCase(Locale.ROOT)) != null) return arr[i];
            tracker.put(arr[i].toLowerCase(Locale.ROOT), 1);
        }

        return null;
    }
//    https://stackoverflow.com/questions/7899525/how-to-split-a-string-by-space
    public static String [] splitBySpaces(String input){
        return input.split("\\s+");
    }
}
