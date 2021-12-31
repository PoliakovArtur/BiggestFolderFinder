import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        System.out.println(getPersonInfo(input));

    }

    public static String getPersonInfo(String input) {

        String lettersList = "ёЁ\\-";

        for (int i = 'А'; i <= 'я'; i++) {
            lettersList += (char) i;
        }

        lettersList = "[" + lettersList + "]+";
        String regex = lettersList + "[\\s]" + lettersList + "[\\s]" + lettersList;

        if (!input.matches(regex)) {
            return "Введенная строка не является ФИО";
        }

        String[] words = input.split("\\s");

        return "Фамилия: " + words[0] + System.lineSeparator() +
                "Имя: " + words[1] + System.lineSeparator() +
                "Отчество: " + words[2];
    }
}

