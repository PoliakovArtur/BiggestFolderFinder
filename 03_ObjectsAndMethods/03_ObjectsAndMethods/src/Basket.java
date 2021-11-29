public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private static int totalValue;
    private static int totalItems;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static void increaseTotalValue(int price, int count) {
        totalValue = totalValue + (count * price);
    }

    public static void increaseTotalItems(int count) {
        totalItems = totalItems + count;
    }

    public static double calculateAveragePrice() {
        return totalValue / totalItems;
    }

    public static double calculateAverageBasketPrice() {
        return totalValue / count;
    }


    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }
        if (totalPrice + count * price >= limit) {
            error = true;
        }
        if (error) {
            System.out.println("Error occured :(");
            return;
        }
        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб. ";
        if (weight > 0) {
            items = items + weight + " кг.";
        }

        increaseTotalValue(price, count);
        increaseTotalItems(count);

        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + weight;
    }

    public void add(String name, int price, int count) {
        add(name, price, count, 0);
    }

    public void add(String name, int price) {
        add(name, price, 1, 0);
    }


    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
        System.out.println("Общий вес товаров " + totalWeight + " кг.");
        System.out.println("Общая стоимость товаров " + totalPrice + " руб.");
        System.out.println("\n==========================\n");
    }

    public static int getCount() {
        return count;
    }

    public static int getTotalValue() {
        return totalValue;
    }

    public static int getTotalItems() {
        return totalItems;
    }

    public static String getAllStaticVars() {
        return "Количество корзин: " + count + "\n" +
                "Общая стоимость всех товаров во всех корзинах: " + totalValue + "\n" +
                "Общее количество товаров во всех корзинах: " + totalItems + "\n" +
                "Средняя стоимость товара во всех корзинах: " + calculateAveragePrice() + "\n" +
                "Средняя стоимость корзины: " + calculateAverageBasketPrice() + "\n";
    }
}


