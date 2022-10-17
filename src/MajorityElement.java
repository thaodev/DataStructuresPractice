import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(findMajorityElement(nums));
    }

    private static int findMajorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }
      for (Integer key : map.keySet()) {
          if (map.get(key) > nums.length/2) {
              return key;
          }
      }
      return -1;
    }
}
