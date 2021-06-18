package challenges.utilities;

public class FirstLetter {
    /* ------------------------------------------------------------------------------------------------
CHALLENGE 2
Write a function named firstLetters that takes in an array of strings and returns an array containing only the first letter of each string.
For example, ['this is great :)', 'wow', 'whyyyyyy :(', ':)))))'] returns ['t', 'w', 'w', ':']
------------------------------------------------------------------------------------------------ */
    public static String [] firstLetter(String input){
        if (input == null) return null;
        String [] brokenUp = input.split(" ");
        String [] output = new String[brokenUp.length];

        for (int i = 0; i < brokenUp.length; i++) {

            char x = brokenUp[i].charAt(0);
            output[i] = Character.toString(x);

        }
        return output;

    }
}
