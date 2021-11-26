import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Elevator elevator = new Elevator(-3, 26);

        System.out.println("Вы находитесь на " + elevator.getCurrentFloor() + " этаже");

        while(true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            if (elevator.getCurrentFloor() == floor) {
                continue;
            }
            elevator.move(floor);
        }
    }
}
