import java.util.Arrays;

/**
 * start comparing element at index 1 to 0, if it is greater swap the two, if not, stay the same. Then comparing 1 to 2, and so forth
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {-15, 27, 80, 35, 55, 17, -5};
        int tempt = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length -1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    tempt = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempt;
                }

            }
            System.out.println(Arrays.toString(array));
        }


    }
}
