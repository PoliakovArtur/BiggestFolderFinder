public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        char[][] chars = new char[size][size];

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                chars[i][j] = (i == j) || (i + j == size - 1) ?  SYMBOL : ' ';
            }
        }
        return chars;
    }
}
