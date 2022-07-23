import java.util.Arrays;

/**
 * For a given array of size N, write a code to print the reverse of the array
 */
public class Array4 {
    public static void main(String[] args) {
        int [] arr = {1, 20, 13, 14, 59};
        int[] array = arr;
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length-1) - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
