package ru.skillbox;

public class Keyboard {
    private final KeyboardType keyboardType;
    private final BacklightExistence backlightExistence;
    private final int weight;

    public Keyboard(KeyboardType keyboardType, BacklightExistence backlightExistence, int weight) {
        this.keyboardType = keyboardType;
        this.backlightExistence = backlightExistence;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Тип клавиатуры: " + keyboardType + "\n" +
                "Наличие подсветки: " + backlightExistence + "\n" +
                "Вес: " + weight + " гр.";
    }
}


