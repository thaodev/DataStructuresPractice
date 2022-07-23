import java.util.Arrays;


/**
 * For two unsorted arrays where elements are in non-decreasing order, write a code to merge the two arrays such that the new array is sorted
 */
public class Array2 {
    public static void main(String[] args) {
        int[] arr1 = {12, 54, 56, 48, 4};
        int[] arr2 = {133, 100, 150, 11, 113};
        int[] sortedArray = combineTwoArrays(arr1, arr2);
        System.out.println(Arrays.toString(sortAscendingOrder(arr1)));
        System.out.println(Arrays.toString(sortAscendingOrder(arr2)));
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(Arrays.toString(sortAscendingOrder(sortedArray)));

    }

    public static int[] sortAscendingOrder(int[] arr){
        int[] sortedArray = arr;
        for (int i = 0; i < sortedArray.length; i++) {
            int j = i;
            int temp = sortedArray[i];
            while (j > 0 && sortedArray[j-1] > temp){
                sortedArray[j] = sortedArray[j-1];
                j--;
            }
            sortedArray[j] = temp;
        }
         return sortedArray;
    }

    public static int[] combineTwoArrays(int[] a, int[] b){
        int [] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        return c;
    }
}
