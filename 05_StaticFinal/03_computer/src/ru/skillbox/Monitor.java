package ru.skillbox;

public class Monitor {
    private final double diagonal;
    private final MonitorType monitorType;
    private final int weight;

    public Monitor(double diagonal, MonitorType monitorType, int weight) {
        this.diagonal = diagonal;
        this.monitorType = monitorType;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Диагональ: " + diagonal + " д." + "\n" +
                "Тип: " + monitorType + "\n" +
                "Вес: " + weight + " гр.";
    }
}
