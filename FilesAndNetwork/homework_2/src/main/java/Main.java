import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введите путь до папки, которую нужно скопировать");
                String sourceDirectory = scanner.nextLine();

                if (!(new File(sourceDirectory).exists())) {
                    throw new IOException("Неверно указан путь до копируемой папки");
                }

                System.out.println("Введите путь до папки, в которую будет произведено копирование");
                String destinationDirectory = scanner.nextLine();

                if (!(new File(destinationDirectory).exists())) {
                    throw new IOException("Неверно указан путь до папки, в которую будут скопированы файлы");
                }

                FileUtils.copyFolder(sourceDirectory, destinationDirectory);

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
