package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Country russia = new Country("Россия");
        russia.setArea(17130000);
        russia.setPopulation(144100000);
        russia.setCapital("Москва");
        russia.setAccessToTheSea(true);

        System.out.println("Страна " + russia.getName());
        System.out.println("Cтолица " + russia.getCapital());
        System.out.println("Население " + russia.getPopulation() + " человек");
        System.out.println("Площадь " + russia.getArea() + " кв.км");
        System.out.println(russia.isAccessToTheSea() ? "Есть выход к морю" : "Нет выхода к морю");

        System.out.println("\n=========================================\n");

        Car volkswagen = new Car("Volkswagen", "Polo");
        volkswagen.setColor("Черный");
        volkswagen.setYear(2016);

        System.out.println("Бренд " + volkswagen.getBrand());
        System.out.println("Модель " + volkswagen.getModel());
        System.out.println("Год выпуска " + volkswagen.getYear());
        System.out.println("Цвет " + volkswagen.getColor());
    }
}
