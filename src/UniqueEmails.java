import java.util.HashSet;
import java.util.Set;

public class UniqueEmails {

    public static void main(String[] args) {
        String[] emails = { "test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com" };
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> setEmail = new HashSet<>();
        for (String email : emails) {
            String[] localAndDomain = email.split("@");
            String formattedEmail = "";
           for (int i = 1; i < localAndDomain[0].length(); i++) {
               if (localAndDomain[0].charAt(i) == '+') {
                   break;
               }
               formattedEmail += localAndDomain[0].charAt(i);
           }
           formattedEmail = formattedEmail.replace(".","");
            formattedEmail = formattedEmail.replace("+","");
            formattedEmail += "@" + localAndDomain[1];
            setEmail.add(formattedEmail);
        }
        return setEmail.size();
    }
}
