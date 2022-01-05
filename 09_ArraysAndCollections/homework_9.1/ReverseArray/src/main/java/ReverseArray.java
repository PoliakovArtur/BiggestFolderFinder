public class ReverseArray {

    public static String[] reverse(String[] strings) {
        String string;
        for (int i = 0; i < strings.length / 2; i++) {
            string = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = string;
        }
        return strings;
    }
}