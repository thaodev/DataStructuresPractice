import java.util.HashMap;
import java.util.Map;

public class IndicesTwoSum {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        twoSum(arr, 9);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                array[0] = map.get(target - nums[i]);
                array[1] = i;

            } else {
                map.put(nums[i], i);
            }
        }
        return array;
    }

    public static int findIndexForGivenValue(int[] nums, int number) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
