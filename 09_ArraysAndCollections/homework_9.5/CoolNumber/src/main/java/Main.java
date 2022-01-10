import java.util.*;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        String result;
        boolean isFind;
        List<String> coolNumbers = CoolNumbers.generateCoolNumbers();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер");
            String input = scanner.nextLine();

            long time = System.nanoTime();
            isFind = CoolNumbers.bruteForceSearchInList(coolNumbers, input);
            time = System.nanoTime() - time;
            if (isFind) {
                result = "Поиск перебором: номер найден, поиск занял " + time + " нс";
            } else {
                result = "Поиск перебором: номер не найден, поиск занял " + time + " нс";
            }

            Collections.sort(coolNumbers);
            time = System.nanoTime();
            isFind = CoolNumbers.binarySearchInList(coolNumbers, input);
            time = System.nanoTime() - time;
            if (isFind) {
                result = result + System.lineSeparator() +
                        "Бинарный поиск: номер найден, поиск занял " + time + " нс";
            } else {
                result = result + System.lineSeparator() +
                        "Бинарный поиск: номер не найден, поиск занял " + time + " нс";
            }

            HashSet<String> hashSet = new HashSet<>(coolNumbers);
            time = System.nanoTime();
            isFind = CoolNumbers.searchInHashSet(hashSet, input);
            time = System.nanoTime() - time;
            if (isFind) {
                result = result + System.lineSeparator() +
                        "Поиск в HashSet: номер найден, поиск занял " + time + " нс";
            } else {
                result = result + System.lineSeparator() +
                        "Поиск в HashSet: номер не найден, поиск занял " + time + " нс";
            }

            TreeSet<String> treeSet = new TreeSet<>(coolNumbers);
            time = System.nanoTime();
            isFind = CoolNumbers.searchInTreeSet(treeSet, input);
            time = System.nanoTime() - time;
            if (isFind) {
                result = result + System.lineSeparator() +
                        "Поиск в TreeSet: номер найден, поиск занял " + time + " нс";
            } else {
                result = result + System.lineSeparator() +
                        "Поиск в TreeSet: номер не найден, поиск занял " + time + " нс";
            }

            System.out.println(result);
        }

    }
}
