public class Palindrome {

    public static void main(String[] args) {
        System.out.println(palindromeCheck(16461));
        System.out.println(palindromeCheck(16462));
        System.out.println(palindromeCheck("illuminati"));
        System.out.println(palindromeCheck("abba"));
        System.out.println(reverseString("hellos"));
       


    }

    public static boolean palindromeCheck(int number) {
       int reverse = 0;
       int temp = number;
       while (temp > 0 ) {
           reverse = reverse * 10 + temp % 10;
           temp = temp/ 10;
       }
       if (reverse == number) {
           return true;
       } else {
           return false;
       }
    }

    public static boolean palindromeCheck(String word) {
        String reverseString = new StringBuilder(word).reverse().toString();
        if (reverseString.equals(word)) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverseString(String word) {
        String reversedStr = "";
        for ( int i = 1 ; i <= word.length(); i++) {
            reversedStr = reversedStr + word.charAt(word.length() - i);
        }
        return reversedStr;
    }
}
