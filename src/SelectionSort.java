import java.util.Arrays;

/**
 * an array is divided into two sub- arrays, i.e., one is an unsorted sub-array, and the other is sorted sub-array.
 * Initially, we assume that the sorted subarray is empty. First, we will find the minimum element from the unsorted subarray,
 * and we will swap the minimum element with an element which is at the beginning position of the array.
 * This algorithm is named as selection sort because it is selecting the minimum element and then performs swapping.
 */

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] array = {7, 4, 10, 8, 3, 1};
        ss.selectionSort(array);
    }

    private int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            int temp = array[i];
            for (int j = i +1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i)
            array[i] = array[min];
            array[min] = temp;
            System.out.println(Arrays.toString(array));
        }
        return array;
    }


}
