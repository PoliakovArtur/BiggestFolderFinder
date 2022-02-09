import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {

    public static long calculateFolderSize(String path) throws Exception {
        File folder = new File(path);
        if (!folder.exists()) {
            throw new Exception("Неверный путь");
        }
        return getFolderSize(folder);
    }

    private static long getFolderSize(File folder) {
        if (folder.isFile()) {
            return folder.length();
        }
        long sum = 0;
        File[] files = folder.listFiles();
        for(File file : files) {
            sum += getFolderSize(file);
        }
        return sum;
    }
}
