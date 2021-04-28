package challenges.utilities;

public class QuickSort {

    public static void quickSort (int [] input, int left, int right){
        if (left < right){
            int position =partition(input, left, right);

            quickSort(input, left, position-1);
            quickSort(input, position+1, right);

        }

    }
    private static int partition(int[] input, int left, int right){

        int pivot = input[right];
        int low = left -1;
        for (int i = left; i <right ; i++) {
            if (input[i] <= pivot){
                low ++;
                swap(input, i, low);
            }
        }
        swap(input, right, low+1);
        return low + 1;
    }
    private static void swap (int [] input, int i, int low){
        int temp = input[i];
        input[i] = input[low];
        input[low] = temp;
    }
}
