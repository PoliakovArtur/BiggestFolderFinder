import java.util.Scanner;

public class ArithmeticCalculator {
    private int firstNumber;
    private int secondNumber;

    public ArithmeticCalculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void choiceOperationAndCalculate() {
        System.out.println("""
                    Выберите операцию:
                    1 - Сложение
                    2 - Вычитание
                    3 - Умножение""");

        int choice = new Scanner(System.in).nextInt();

        if (choice == 1) {
            calculate(Operation.ADD);
            return;
        }

        if (choice == 2) {
            calculate(Operation.SUBTRACT);
            return;
        }

        if (choice == 3) {
            calculate(Operation.MULTIPLY);
            return;
        }
        calculate(Operation.ILLEGAL_OPERATION);
    }

    private void calculate(Operation operation) {

        if (operation == Operation.valueOf("ADD")) {
            System.out.println(firstNumber + secondNumber);
            return;
        }

        if (operation == Operation.valueOf("MULTIPLY")) {
            System.out.println(firstNumber * secondNumber);
            return;
        }

        if (operation == Operation.valueOf("SUBTRACT")) {
            System.out.println(firstNumber - secondNumber);
            return;
        }
        System.out.println("Операция выбрана неверно");
    }

    public void setNumbers(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
}
