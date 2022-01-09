import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        while (true) {
            String input = scanner.nextLine();

            if (input.matches(PhoneBook.REGEX_PHONE)) {
                if (phoneBook.getContactByPhone(input).isEmpty()) {
                    System.out.println("Такого номера нет в телефонной книге." +
                            System.lineSeparator() +
                            "Введите имя абонента для номера \"" + input + "\":");
                    phoneBook.addContact(input, setName());
                    continue;
                }
                System.out.println(phoneBook.getContactByPhone(input));
                continue;
            }

            if (input.matches(PhoneBook.REGEX_NAME)) {
                if (phoneBook.getContactByName(input).isEmpty()) {
                    System.out.println("Такого имени в телефонной книге нет." +
                            System.lineSeparator() +
                            "Введите номер телефона для абонента \"" + input + "\":");
                    phoneBook.addContact(setPhone(), input);
                    continue;
                }
                System.out.println(phoneBook.getContactByName(input));
                continue;
            }

            if (input.matches(PhoneBook.REGEX_NAME_AND_PHONE)) {
                String[] split = input.split("[\\s]");
                phoneBook.addContact(split[1], split[0]);
                continue;
            }

            if (input.equals("LIST")) {
                System.out.println(phoneBook.getAllContacts());
                continue;
            }
            System.out.println("Неверный формат ввода");
        }
    }

    public static String setName() {
        while (true) {
            String name = scanner.nextLine();
            if (name.matches(PhoneBook.REGEX_NAME)) {
                return name;
            }
            System.out.println("Неверный формат ввода");
        }
    }

    public static String setPhone() {
        while (true) {
            String phone = scanner.nextLine();
            if (phone.matches(PhoneBook.REGEX_PHONE)) {
                return phone;
            }
            System.out.println("Неверный формат ввода");
        }
    }
}
