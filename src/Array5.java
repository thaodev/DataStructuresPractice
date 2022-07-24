/**
 * Largest sum contiguous subarray having only non-negative elements/aka subarray contains non-negative numbers
 */
public class Array5 {
    public static void main(String[] args) {
        Array5 array = new Array5();
        int[] arr = {12, -100, -40, -55, -113, -69, -72, -213, -5};
        System.out.println(array.findLargestSumContiguousSubArray(arr));
    }

    private int findLargestSumContiguousSubArray(int[] arr) {
        int curr_sum = 0;
        int max_sum = 0;
        int endIndex = 0, startIndex = 0;
        for (int i = 0; i < arr.length; i++){

            if (arr[i] > 0) {
                curr_sum += arr[i];
            }
            if(curr_sum > max_sum) {
                max_sum = curr_sum;
                startIndex = i;
                endIndex = i;
                while(arr[startIndex] >0 && startIndex >0 && arr[startIndex - 1] > 0){
                    startIndex--;
                }
            }
            if (arr[i] < 0) {
                curr_sum = 0;
            }
            if ( i == arr.length - 1){
                if (startIndex == endIndex){
                    System.out.println("Non-negative element Subarray with largest sum at index " + startIndex);
                } else {
                    System.out.println("Non-negative element Subarray with largest sum at index " + startIndex + " thru index: " + endIndex);
                }
            }
        }
        return max_sum;

    }
}
