public class Arithmetic {
    public int number0ne;
    public int numberTwo;

    public Arithmetic(int number0ne, int numberTwo) {
        this.number0ne = number0ne;
        this.numberTwo = numberTwo;
    }

    public int getSum() {
        return number0ne + numberTwo;
    }

    public int getMultiplication() {
        return number0ne * numberTwo;
    }

    public int getMaxNumber() {
        if (number0ne > numberTwo) {
            return number0ne;
        }
        return numberTwo;
    }

    public int getMinNumber() {
        if (number0ne > numberTwo) {
            return numberTwo;
        }
        return number0ne;
    }
}
