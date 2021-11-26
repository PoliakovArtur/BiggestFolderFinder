public class Elevator {

    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    private void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    private void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Этаж введен неверно");
            return;
        }

            while (floor > currentFloor) {
                moveUp();
                System.out.println(currentFloor);
            }

            while (floor < currentFloor) {
                moveDown();
                System.out.println(currentFloor);
            }
            System.out.println("Вы находитесь на " + currentFloor + " этаже");
    }
}
