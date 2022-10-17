import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
      System.out.println(isAnagram("anagram" , "nagaram"));
    }

    /**
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     */
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<Character, Integer>();
        Map<Character, Integer> mapT = new HashMap<Character, Integer>();
        if (s.length() != t.length()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (mapS.containsKey(c)) {
                mapS.put(c, mapS.get(c) + 1);
            } else {
                mapS.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (mapT.containsKey(c)) {
                mapT.put(c, mapT.get(c) + 1);
            } else {
                mapT.put(c, 1);
            }
        }
//
//        if (mapS.size() != mapT.size()) {
//            return false;
//        }
        System.out.println("mapS");
        for(Map.Entry<Character, Integer> mapEntry : mapS.entrySet()) {
            System.out.println("[" + mapEntry.getKey() + ", " + mapEntry.getValue() + "]");
        }

        System.out.println("mapT");
        for(Map.Entry<Character, Integer> mapEntry : mapT.entrySet()) {
            System.out.println("[" + mapEntry.getKey() + ", " + mapEntry.getValue() + "]");
        }

        return mapS.equals(mapT);

    }
}
