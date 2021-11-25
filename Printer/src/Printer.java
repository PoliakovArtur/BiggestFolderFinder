public class Printer {

    public String queue = "";
    public int amountPages;
    public int amountPrintedPages;

    public void append(String text, String name, int amountPages) {
        this.amountPages += amountPages;
        if (name == "") {
            queue = queue + "\n" + text + "\n";
            return;
        }
            queue = queue + "\n" +  name + "\n" + text + "\n";
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

    public int getAmountPrintedPages() {
        return amountPrintedPages;
    }

    public void print() {
        amountPrintedPages += amountPages;
        System.out.println(queue);
        clear();
    }

    public void clear() {
        queue = "";
        amountPages = 0;
    }
}

