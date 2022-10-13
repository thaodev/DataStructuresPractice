import java.util.HashMap;
import java.util.Map;

public class findDuplicate {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 1};
        System.out.println(containDuplicateInArray(array));
    }

    private static boolean containDuplicateInArray(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for (int i =0 ; i< nums.length; i++) {
            if (numbers.containsKey(nums[i])) {
                numbers.put(nums[i], numbers.get(nums[i]) + 1);
            } else {
                numbers.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> mapSet : numbers.entrySet()) {
            if (mapSet.getValue() > 1) {
                return false;
            }
            System.out.println(mapSet.getKey() + ", " + mapSet.getValue()
            );
        }
        return true;
    }
}
