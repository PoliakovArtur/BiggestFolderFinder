public class Main {

    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 50, 3, 1);
        vasyaBasket.add("Сыр", 100, 1, 0.3);
        vasyaBasket.add("Кофе", 300, 1);
        vasyaBasket.print("Корзина Васи");

        Basket petyaBasket = new Basket();
        petyaBasket.add("Хлеб", 50, 2);
        petyaBasket.add("Чай", 120, 1);
        petyaBasket.add("Сахар", 50, 1, 1);
        petyaBasket.print("Корзина Васи");

        System.out.println(Basket.getAllStaticVars());
    }
}
