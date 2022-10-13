import java.lang.reflect.Array;
import java.util.*;

public class UniqueString {
    public static void main(String[] args) {
        UniqueString us = new UniqueString();
       System.out.println(us.uniqueLetterInWord("heloa3jk"));
       System.out.println(us.uniqueLetterInWord("hello"));
      System.out.println(us.uniqueWordInString("Today is a beautiful day day"));
    }

    public boolean uniqueLetterInWord(String word){
        char[] wordConvertedToChars = word.toCharArray();
        Set chars = new HashSet();
        for (int i = 0; i < wordConvertedToChars.length;i++) {
            chars.add(wordConvertedToChars[i]);
        }
        if (chars.size() == wordConvertedToChars.length) {
            return true;
        }
        return false;
    }

    public boolean uniqueWordInString(String stringToCheck) {
        String [] words = stringToCheck.split("\\W");
        System.out.println("Array of words is:" + Arrays.toString(words));
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

        for(String word : words) {
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                return false;
            }
        }

        return true;
    }
}
