import java.util.*;
import java.util.stream.Stream;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 3, 3, 3};
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        Stream<Map.Entry<Integer, Integer>> sorted = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
        int count = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = sorted.iterator();
        while (iterator.hasNext() && count < k) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());

            result[count] = entry.getKey();
            count++;
        }

        return result;
    }
}
