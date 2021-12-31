import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      String text = new Scanner(System.in).nextLine();
      System.out.println(splitTextIntoWords(text));
    }

  public static String splitTextIntoWords(String text) {
    String regex = "[0-9,.;:!?'\")(]";
    text = text.replaceAll(regex, "");
    String[] words = text.split("[\\s-]+");
    String splitText = "";
    for (int i = 0; i < words.length; i++) {
      splitText += words[i] + System.lineSeparator();
    }
    return splitText.trim();
  }
}