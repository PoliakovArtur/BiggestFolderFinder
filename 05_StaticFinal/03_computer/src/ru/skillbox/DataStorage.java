package ru.skillbox;

public class DataStorage {
    private final DataStorageType dataStorageType;
    private final int memoryCapacity;
    private final int weight;

    public DataStorage(DataStorageType dataStorageType, int memoryCapacity, int weight) {
        this.dataStorageType = dataStorageType;
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Тип: " + dataStorageType + "\n" +
                "Объем: " + memoryCapacity + " Гб" + "\n" +
                "Вес: " + weight + " гр.";
    }
}
