import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replaceAll("[^0-9]", "");
        System.out.println(phoneFormatter(input));

    }

    public static String phoneFormatter(String input) {

        String errorMessage = "Неверный формат номера";
        boolean is10Numbers = input.length() == 10;
        boolean is11Numbers = input.length() == 11;
        boolean isFirstNumber7 = input.charAt(0) == '7';
        boolean isFirstNumber8 = input.charAt(0) == '8';

        if (!is11Numbers) {
            if (is10Numbers) {
                return "7" + input;
            }
            return errorMessage;
        }

        if (!isFirstNumber7) {
            if (isFirstNumber8) {
                return "7" + input.substring(1);
            }
            return errorMessage;
        }
        return input;
    }
}

