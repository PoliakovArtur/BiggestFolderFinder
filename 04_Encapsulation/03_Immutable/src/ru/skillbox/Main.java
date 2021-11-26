package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Лёгкий способ бросить курить", "Аллен Карр",
                208, "978-5-98124-284-7");

        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getAmountPages() + " Страниц");
        System.out.println("ISBN " + book.getIsbn());

        System.out.println("\n===============================================\n");

        Product coffee = new Product("Кофе", "4-607099-091375");
        coffee.setPrice(120);

        System.out.println(coffee.getName());
        System.out.println(coffee.getBarCode());
        System.out.println("Цена " + coffee.getPrice() + " руб.");



    }
}
