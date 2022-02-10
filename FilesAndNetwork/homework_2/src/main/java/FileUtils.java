import javax.swing.text.AttributeSet;
import javax.swing.text.html.Option;
import java.io.*;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUtils {

    public static void copyFolder(String sourceDirectory, String destinationDirectory) throws IOException {
        copyFiles(new File(sourceDirectory).listFiles(), destinationDirectory);
    }

    public static void copyFiles(File[] files, String destinationDirectory) throws IOException {

        for (int i = 0; i < files.length; i++) {
            String newPath = destinationDirectory + "\\" + files[i].getName();
            if (files[i].isFile()) {
                Files.copy(Paths.get(files[i].getPath()), Paths.get(newPath), StandardCopyOption.REPLACE_EXISTING);
            }
            else {
                Files.createDirectory(Paths.get(newPath));
                copyFiles(files[i].listFiles(), newPath);
            }
        }
    }
}


