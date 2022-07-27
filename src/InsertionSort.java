import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {12, 120, 6, 113, 105, 5};
        InsertionSort iS = new InsertionSort();
        iS.insertionSort(array);

    }

    private void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j - 1, j);
                j--;
            }
            System.out.println("i= " + i + ", j= " + j + " " + Arrays.toString(array));
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
