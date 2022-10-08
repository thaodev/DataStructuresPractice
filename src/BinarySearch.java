public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-3, 5 , 8, 11, 21, 23, 44, 51, 66};
        binarySearch(11, arr, 0, arr.length - 1);
        System.out.println(binarySearch(11, arr, 0, arr.length-1));
    }

    public static int binarySearch(int number, int[] arr, int left, int right) {

        while (left <= right) {
            int mid = (left + right)/2;
            if (number > arr[mid]) {

                return binarySearch(number, arr, mid + 1, right);
            } else if (number < arr[mid]) {

                return binarySearch(number, arr, left, mid - 1);
            } else {
                return mid;
            }
        }
        return -1;
    }
}
