import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Введите два числа");

        int numberOne = new Scanner(System.in).nextInt();
        int numberTwo = new Scanner(System.in).nextInt();

        Arithmetic numbers = new Arithmetic(numberOne, numberTwo);

        System.out.println("Сумма чисел равна " + numbers.getSum());
        System.out.println("Произведение чисел равно " + numbers.getMultiplication());
        System.out.println("Максимальное число " + numbers.getMaxNumber());
        System.out.println("Минимально число " + numbers.getMinNumber());

    }
}

