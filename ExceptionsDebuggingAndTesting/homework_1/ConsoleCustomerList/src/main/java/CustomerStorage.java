import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;
    protected static final String SYMBOLS = "[абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ" +
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-]+";
    protected static final String REGEX_PHONE = "\\+" + "[0-9]+";
    protected static final String REGEX_EMAIL = SYMBOLS + "@" + SYMBOLS + "\\." + SYMBOLS;
    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;
        String[] components = data.split("\\s+");
        if (components.length != 4) {
            throw new IllegalArgumentException("Wrong format. Correct format:\n" +
                    "Василий Петров vasily-petrov@gmail.com +79215637722");
        }

        if (!components[2].matches(REGEX_EMAIL)) {
            throw new IllegalArgumentException("Wrong email format");
        }

        if (!components[3].matches(REGEX_PHONE)) {
            throw new IllegalArgumentException("Wrong phone format");
        }

        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        if (!storage.containsKey(name)) {
            throw new IllegalArgumentException("Customer not found");
        }
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}