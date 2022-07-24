import java.util.ArrayList;
import java.util.List;

/*
For a given unsorted array, write a program to find a "contiguous" subarray in the array that adds to a given number
 */
public class Array1 {
    public static void main(String[] args) {
        Array1 subArray = new Array1();
        int[] array = {5, 6, 7, 13, 43, 3, 16};
        int sum = 62;
        subArray.findSubArray(array, sum);
    }

    int findSubArray(int arr[], int n, int sum)
    {
        int curr_sum = arr[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i <= n; i++) {
            // If curr_sum exceeds the sum,
            // then remove the starting elements
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum,
            // then return true
            if (curr_sum == sum) {
                int p = i - 1;
                System.out.println(
                        "Sum found between indexes " + start
                                + " and " + p);
                return 1;
            }

            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];
        }

        System.out.println("No subarray found");
        return 0;
    }

    int findSubArray(int[] a, int sum){
        int currSum = 0;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {

            currSum += a[i];
            while(currSum > sum){
                currSum -= a[temp];
                temp ++;
            }
            if(currSum == sum){
                System.out.println("Found at index: "+ temp + " thru index: " + i);
                return -1;
            }

        }
        return 0;

    }
}
