public class Printer {

    public String queue;
    public int amountPages;
    public static int amountPagesAllTime;

    public void append(String text, String name, int amountPages) {
        this.amountPages = amountPages;
        queue = name + "\n" + text;
    }

    public void append(String text, String name) {
        append(text, name, 1);
    }

    public void append(String text) {
        append(text, "", 1);
    }

    public void append(String text, int amountPages) {
        append(text, "", amountPages);
    }

    public int getPendingPagesCount() {
        return amountPages;
    }

    public int getPrintPagesCountAllTime () {
        return amountPagesAllTime;
    }

    public void print() {
        amountPagesAllTime = amountPagesAllTime + amountPages;
        System.out.println(queue);
        clear();
    }

    public void clear() {
        queue = "";
        amountPages = 0;
    }
}

