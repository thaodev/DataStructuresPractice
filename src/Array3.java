import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * For a given array of size N-1, containing integers in the range from 1 to N, write a program to find the missing element in the array
 */
public class Array3 {
    public static void main(String[] args) {
        int arr[] = {25, 49, -12, 58, 104, -92, -3, 28, 83, 121};
        int[] sortedArr = arr;
        sortedArr = insertionSort(sortedArr);
        List missingElementList = new ArrayList<>();
        System.out.println(Arrays.toString(sortedArr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (sortedArr[i + 1] - sortedArr[i] > 1) {
                missingElementList.add(sortedArr[i] + 1);
            }
        }
        System.out.println(missingElementList);

    }

    public static int[] insertionSort(int[] arr) {
       // arr = new int[]{25, 49, -12, 58, 104, -92, -3, 28, 83, 121};
        int[] sortedArray = arr;

        for (int i = 1; i < sortedArray.length - 1; i++){
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j - 1]){
                arr[j] = arr[j -1 ];
                j--;
            }
            arr[j] = temp;
            //System.out.println("i = " + i +", j = " + j + Arrays.toString(arr));
        }

        return sortedArray;
    }

    public static int[] sortAscendingOrder2(int[] unsortedArray) {
        int[] arr = unsortedArray;

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int temp = arr[i];
            while ((j > 0) && (arr[j - 1] > temp)) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        } return arr;
    }

    public static boolean missingNumberInArray(int num, int[] a) {
        boolean result = true;
        for (int i = 0; i < a.length; i++) {
            if (a[1] == num) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static int[] sortAscendingOrder3(int[] arr) {
        int[] sortedArray = arr;
        int temp = 0;
        for (int i = 0; i < sortedArray.length - 2; i++){
            int j = i;
            temp = arr[i];
            while(temp > 0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }

        return sortedArray;
    }
}
