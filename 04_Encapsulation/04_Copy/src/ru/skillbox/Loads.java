package ru.skillbox;

import java.util.Arrays;

public class Loads {
    private final Dimensions dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final boolean possibleToTurn;
    private final String regNumber;
    private final boolean delicateLoad;

    public Loads(Dimensions dimensions, int weight, String deliveryAddress, boolean possibleToTurn,
                 String regNumber, boolean delicateLoad) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.possibleToTurn = possibleToTurn;
        this.regNumber = regNumber;
        this.delicateLoad = delicateLoad;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Loads setDimensions(Dimensions dimensions) {
        return new Loads(dimensions, weight, deliveryAddress, possibleToTurn, regNumber, delicateLoad);
    }

    public int getWeight() {
        return weight;
    }

    public Loads setWeight(int weight) {
        return new Loads(dimensions, weight, deliveryAddress, possibleToTurn, regNumber, delicateLoad);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Loads setDeliveryAddress(String deliveryAddress) {
        return new Loads(dimensions, weight, deliveryAddress, possibleToTurn, regNumber, delicateLoad);
    }

    public boolean isPossibleToTurn() {
        return possibleToTurn;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isDelicateLoad() {
        return delicateLoad;
    }

    public String toString() {
        return dimensions + "\n" +
                "Масса: " + weight + " гр.\n" +
                "Адрес доставки: " + deliveryAddress + "\n" +
                "Можно ли переворачивать: " + (possibleToTurn ? "Можно" : "Нельзя") + "\n" +
                "Регистрационный номер: " + regNumber + "\n" +
                "Является ли груз хрупким: " + (delicateLoad ? "Является" : "Не является")
                + "\n=============================================\n";
    }
}
