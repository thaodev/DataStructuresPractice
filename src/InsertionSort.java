import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 10, 1, 6, 2};
        InsertionSort iS = new InsertionSort();
        iS.insertionSort(array);

    }

    private void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            int temp = array[j];
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
            System.out.println("i= " + i + ", j= " + j + " " + Arrays.toString(array));
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
