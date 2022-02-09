import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введите путь до папки");
                String path = scanner.nextLine();
                long size = FileUtils.calculateFolderSize(path);
                String[] units = {"B", "KB", "MB", "GB", "TB"};

                for (int rate = 0; rate < 50; rate+=10) {
                    if ((size >= Math.pow(2, rate)) && (size < Math.pow(2, rate + 10))) {
                        double result = size / Math.pow(2, rate);
                        String format = "Размер папки " + path + " составляет %.2f %s\n";
                        System.out.printf(format, result, units[rate / 10]);
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
