import java.util.Arrays;

public class replaceMinElements {
    /**
     * Given an array arr, replace every element in that array with the smallest element among the elements to its right, and replace the last element with -1.
     */

    public static void main(String[] args) {
        int[] arr = { 18, 15, 4, 3, 7, 5};
        System.out.println(Arrays.toString(replaceMinElement(arr)));
    }

    public static int[] replaceMinElement(int[] arr) {
        int min = arr[arr.length -1], a;
        for (int i = arr.length - 2; i >=0 ; i--) {
            a = arr[i];
            arr[i] = min;
            min = Math.min(min, a);
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
