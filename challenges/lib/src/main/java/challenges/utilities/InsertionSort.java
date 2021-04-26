package challenges.utilities;

public class InsertionSort {

    public static void insertionSort (int[] input){
        for (int i = 1; i < input.length; i++) {
            int temp = input[i];
            int j = i-1;

            while (j>= 0 && input[j] > temp){
                input[j+1] = input[j];
                j = j-1;
            }
            input[j+1] = temp;
            printArray(input);
        }

    }
//    borrowed this from https://www.geeksforgeeks.org/insertion-sort/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
