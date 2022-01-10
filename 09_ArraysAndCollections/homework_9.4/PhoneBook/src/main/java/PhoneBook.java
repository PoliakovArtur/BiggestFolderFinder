import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {

    private TreeMap<String, String> phoneBook = new TreeMap<>();
    public final static String REGEX_NAME = "[абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ]+";
    public final static String REGEX_PHONE = "[0-9]+";
    public final static String REGEX_NAME_AND_PHONE = REGEX_NAME + "[\\s]+" + REGEX_PHONE;

    public void addContact(String phone, String name) {

        if (name.matches(REGEX_NAME) && phone.matches(REGEX_PHONE)) {

            if (phoneBook.containsKey(name) && isContainsPhone(phone)) {
                System.out.println("Такой контакт уже есть.");
                return;
            }

            if (phoneBook.containsKey(name) && !isContainsPhone(phone)) {
                phoneBook.put(name, phoneBook.get(name) + ", " + phone);
                System.out.println("Контакт сохранен!");
                return;
            }

            if (!phoneBook.containsKey(name) && isContainsPhone(phone)) {
                String phones = phoneBook.get(getNameByPhone(phone));
                phoneBook.remove(getNameByPhone(phone));
                phoneBook.put(name, phones);
                System.out.println("Контакт сохранен!");
                return;
            }

            phoneBook.put(name, phone);
            System.out.println("Контакт сохранен!");
            return;
        }
        System.out.println("Неверный формат ввода");
    }

    public String getContactByPhone(String phone) {
        if (isContainsPhone(phone)) {
            return getNameByPhone(phone) + " - " + phoneBook.get(getNameByPhone(phone));
        }
        return "";
    }

    public Set<String> getContactByName(String name) {
        if (phoneBook.containsKey(name)) {
            TreeSet<String> phones = new TreeSet<>();
            phones.add(name + " - " + phoneBook.get(name));
            return Collections.unmodifiableSet(phones);
        }
        return new TreeSet<>();
    }

    public Set<String> getAllContacts() {
        TreeSet<String> contacts = new TreeSet<>();
        for (String name : phoneBook.keySet()) {
            contacts.add(name + " - " + phoneBook.get(name));
        }
        return Collections.unmodifiableSet(contacts);
    }

    private boolean isContainsPhone(String phone) {
        for (String name : phoneBook.keySet()) {
            String[] split = phoneBook.get(name).split("[\\,\\s]");
            for (String s : split) {
                if (phone.equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    private String getNameByPhone(String phone) {
        for (String name : phoneBook.keySet()) {
            String[] split = phoneBook.get(name).split("[\\,\\s]");
            for (String s : split) {
                if (phone.equals(s)) {
                    return name;
                }
            }
        }
        return "";
    }
}