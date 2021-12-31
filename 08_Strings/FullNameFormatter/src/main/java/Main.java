import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        System.out.println(getPersonInfo(input));

    }

    public static String getPersonInfo(String input) {
        int spaceCount = 0;
        String errorMessage = "Введенная строка не является ФИО";
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            boolean isRus = (symbol >= 'А') && (symbol <= 'я');
            boolean isLegalSymbol = (symbol == '-') || (symbol == 'ё') || (symbol == 'Ё');
            boolean isSpace = symbol == ' ';
            if (!isRus && !isLegalSymbol && !isSpace) {
                return errorMessage;
            }
            if (isSpace) {
                spaceCount++;
            }
        }

        if (spaceCount != 2) {
            return errorMessage;
        }

        int end = input.indexOf(' ');
        String surname = input.substring(0, end);

        int start = end + 1;
        end = input.lastIndexOf(' ');
        String name = input.substring(start, end);

        start = input.lastIndexOf(' ') + 1;
        String patronymic = input.substring(start);

        return "Фамилия: " + surname + System.lineSeparator() +
                "Имя: " + name + System.lineSeparator() +
                "Отчество: " + patronymic;
    }
}
