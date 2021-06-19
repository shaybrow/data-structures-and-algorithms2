package challenges.utilities;

public class ArrayMaxThreeMultiplied {

    public static int findMax (int input []) throws Exception {
        if (input.length < 3) throw new Exception("DUMB");
        QuickSort.quickSort(input, input[0], input[input.length-1]);
        int positiveMax = input[input.length-1] * input[input.length-2] * input[input.length-3];
        int negativeMax = input[0] * input[1] * input[input.length-1];
        if (positiveMax > negativeMax) return positiveMax;
        else return negativeMax;
    }

}
