import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] chars = TwoDimensionalArray.getTwoDimensionalArray(scanner.nextInt());

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                System.out.print(chars[i][j]);
            }
            System.out.println();
        }
    }
}
