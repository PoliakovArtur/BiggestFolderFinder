import java.util.*;

public class EmailList {
    private TreeSet<String> emailList = new TreeSet<>();
    private final static String LETTERS_LIST = "[1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]+";
    private final static String REGEX = LETTERS_LIST + '@' + LETTERS_LIST + "\\." + LETTERS_LIST;

    public void add(String email) {
        if (!email.matches(REGEX)) {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
            return;
        }
        emailList.add(email.toLowerCase(Locale.ROOT));
    }

    public Set<String> getSortedEmails() {
        return emailList;
    }
}
