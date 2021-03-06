/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenges;

public class Library {
    //worked with stephan webber
    public static int [] shiftArray (int[] inputArray, int insertNumber){
        int [] outputArray = new int [inputArray.length+1];
        int middle = 0;
        if (inputArray.length%2 == 0) {
            middle = inputArray.length/2;
        } else middle = inputArray.length/2+1;


        for (int i = 0; i < outputArray.length ; i++) {
           if (middle > i){
               outputArray[i] = inputArray[i];
           }
            else if (middle == i){
                outputArray[i] = insertNumber;
            }
            else if (middle < i){
                outputArray[i] = inputArray[i-1];
            }

        }
        return outputArray;
    }
}
