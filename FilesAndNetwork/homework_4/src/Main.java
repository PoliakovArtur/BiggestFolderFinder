import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://lenta.ru/").get();
        Elements elements = doc.select("img");
        String[] formats = {".jpg", ".jpeg", ".png"};
        elements.forEach((e) -> {
            try {
                String[] split = e.attr("abs:src").split("/");

                for (String format : formats) {
                    Pattern pattern = Pattern.compile(format);
                    Matcher matcher = pattern.matcher(split[split.length - 1]);
                    if (matcher.find()) {
                        BufferedImage image = ImageIO.read(new URL(e.attr("abs:src")));
                        File file = new File("images/" + split[split.length - 1]);
                        ImageIO.write(image, "jpg", file);
                        return;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
}
