import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailList emailList = new EmailList();

        while (true) {
            String input = scanner.nextLine();
            String[] split = input.split("\\s");

            if (split.length > 2) {
                System.out.println(WRONG_EMAIL_ANSWER);
                continue;
            }

            switch (split[0]) {
                case "ADD" -> {
                    if (split.length == 1) {
                        System.out.println(WRONG_EMAIL_ANSWER);
                        break;
                    }
                        emailList.add(split[1]);
                }
                case "LIST" -> {
                    for (String email : emailList.getSortedEmails()) {
                        System.out.println(email);
                    }
                }
                default -> System.out.println("Неизвестная команда");
            }
        }
    }
}

