import java.util.*;

public class CoolNumbers {
    private final static char[] letters = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};

    public static List<String> generateCoolNumbers() {
        ArrayList<String> coolNumbers = new ArrayList<>();
        int index;

        for (int i = 0; i < 2000000; i++) {
            StringBuilder number = new StringBuilder();
            number.append(letters[(int) Math.round(Math.random() * (letters.length - 1))]);
            index = 1 + (int) Math.round(Math.random() * 8);
            number.append(index);
            number.append(index);
            number.append(index);
            number.append(letters[(int) Math.round(Math.random() * (letters.length - 1))]);
            number.append(letters[(int) Math.round(Math.random() * (letters.length - 1))]);
            number.append(generateRegion());
            coolNumbers.add(number.toString());
        }
        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        return Collections.binarySearch(sortedList, number) >= 0;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

    private static String generateRegion() {
        int region = 1 + (int) Math.round(Math.random() * 198);
        if (region < 10) {
            return "0" + region;
        }
        return Integer.toString(region);
    }

}
