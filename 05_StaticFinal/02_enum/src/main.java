import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(0, 0);

        while (true) {

            System.out.println("Введите первое число");
            int firstNumber = new Scanner(System.in).nextInt();
            System.out.println("Введите второе число");
            int secondNumber = new Scanner(System.in).nextInt();

            arithmeticCalculator.setNumbers(firstNumber, secondNumber);

            arithmeticCalculator.choiceOperationAndCalculate();
        }
    }
}
