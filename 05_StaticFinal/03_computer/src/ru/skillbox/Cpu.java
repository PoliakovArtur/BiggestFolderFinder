package ru.skillbox;

public class Cpu {
    private final int frequency;
    private final int coresAmount;
    private final String vendor;
    private final int weight;

    public Cpu(int frequency, int coresAmount, String vendor, int weight) {
        this.frequency = frequency;
        this.coresAmount = coresAmount;
        this.vendor = vendor;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Частота: " + frequency + " МГц\n" +
                "Количество ядер: " + coresAmount + "\n" +
                "Производитель: " + vendor + "\n" +
                "Вес: " + weight + " гр.";
    }
}
