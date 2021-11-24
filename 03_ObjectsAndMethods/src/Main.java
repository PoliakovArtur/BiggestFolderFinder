public class Main {

    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 50, 3, 1);
        vasyaBasket.add("Сыр", 200, 1, 0.3);
        vasyaBasket.add("Хлеб", 50, 1);
        vasyaBasket.add("Чай", 120, 1);
        vasyaBasket.add("Сахар", 54, 1, 1);
        vasyaBasket.add("Кофе", 235, 1);
        vasyaBasket.print("Корзина Васи");

        System.out.println();
        System.out.println(vasyaBasket.getTotalWeight());


    }
}
