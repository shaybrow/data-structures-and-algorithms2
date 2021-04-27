package challenges.utilities;

public class MergeSort {

    public static void mergeSort (int [] input){
        int n = input.length;
        if (n > 1){
            int mid = n/2;
            int left [] = new int [mid];
            for (int i = 0; i < mid; i++) {
                left [i] = input [i];

            }
            int right [] = new int [n - mid];
            for (int i = mid; i < n; i++) {
                right [i - mid] = input[i];

            }

            mergeSort(left);
//            InsertionSort.printArray(left);
//            System.out.println("right");
//            InsertionSort.printArray(right);
            mergeSort(right);
            merge(left, right, input);
        }

    }

    public static void merge(int[] left, int[] right, int[] input){
        int i = 0;
        int j = 0;
        int k = 0;

//        InsertionSort.printArray(right);
        while (i< left.length && j < right.length){
            if (left[i] <= right[j]){
                input[k] = left[i];
                i ++;
            } else{
                input[k] = right[j];
                j++;
            }
            k++;
        }
        if (i == left.length){
            while ( j < right.length){
                input[k] = right[j];
                j++;
            }
        } else{
            while (i < left.length){
                input[k] = left[i];
                i ++;
            }
        }

    }
}
