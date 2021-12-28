public class Main {

    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String start1 = "заработал";
        String start2 = "Петя -";
        String start3 = "Маша -";
        String end = "руб";

        int startIndex = text.indexOf(start1) + start1.length();
        int endIndex = text.indexOf(end);
        String money = text.substring(startIndex, endIndex).trim();
        int sum = Integer.parseInt(money);

        startIndex = text.indexOf(start2) + start2.length();
        endIndex = text.indexOf(end, startIndex);
        money = text.substring(startIndex, endIndex).trim();
        sum += Integer.parseInt(money);

        startIndex = text.indexOf(start3) + start3.length();
        endIndex = text.lastIndexOf(end);
        money = text.substring(startIndex, endIndex).trim();
        sum += Integer.parseInt(money);

        System.out.println(sum);
    }
}