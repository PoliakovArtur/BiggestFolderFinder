package ru.skillbox;

public class Ram {
    private final RamType ramType;
    private final int memoryCapacity;
    private final int weight;

    public Ram(RamType ramType, int memoryCapacity, int weight) {
        this.ramType = ramType;
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Тип: " + ramType + "\n" +
                "Объем: " + memoryCapacity + " Гб" + "\n" +
                "Вес: " + weight + " гр.";
    }
}
