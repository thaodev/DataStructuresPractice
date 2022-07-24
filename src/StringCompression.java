/**
 * perform a basic string compression using the counts of repeated characters
 */
public class StringCompression {
    public static void main(String[] args) {
        String String = "aabccccaaaaTTTtttttt";
        String compressedString = "";
        char[] letters = String.toCharArray();
        int count = 1;
        for (int i = 0; i < letters.length; i++) {
            count = 1;
            compressedString+= letters[i];
            while((i+1) < letters.length && letters[i] == letters[i+1] ) {
                count++;
                i++;
            }
            compressedString += count;

        }
        System.out.println(compressedString);
    }
}
