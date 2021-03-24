package challenges;
//https://www.javatpoint.com/binary-search-in-java
public class BinarySearch {
    public static int BinarySearch(int[] inputArray, int search){
        int low = 0;
        int high = inputArray.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if (inputArray[mid] == search) {
                return mid;
            }
            else if (inputArray[mid] < search) low = mid+1;
            else high = mid -1;
        }
       return -1;
    }
}
