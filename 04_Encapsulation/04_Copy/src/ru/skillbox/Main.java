package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions1 = new Dimensions(25,35,40);
        Loads load1 = new Loads(dimensions1, 2300,
                "ул. Пушкина, д.1, кв. 43",
                true,
                "225h5232",
                false);

        Dimensions dimensions2 = dimensions1.setHeight(30);

        System.out.println(load1);


        Loads load3 = load1.setDeliveryAddress("ул. Пушкина, д.1, кв. 33");

        load1 = load3;

        System.out.println(load1);

        System.out.println(load3);
    }
}
