import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */

public class Array6 {
    public static void main(String[] args) {
        int[] array = {12, 4, 51, 23, 64, 73, 20, 48};
        int target = 68;
        int remainder = 0;
        int[] result = new int[array.length];
        int j = 0;
        for(int i = 0; i< array.length; i++){
            remainder = target - array[i];
            if(findANumber(array, remainder) &&  !findANumber(result,array[i]) ){
                result[j] = array[i];
                j++;
                result[j] = remainder;
                j++;
            }
        }
        displayArray(result);
    }

    public static boolean findANumber(int[] arr, int num){
        boolean outcome  = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num) {
                outcome = true;
            }
        }
        return outcome;
    }

    public static void displayArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
