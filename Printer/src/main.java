public class main {
    public static void main(String[] args) {
        Printer text = new Printer();
        text.append("Работают белазы", "ВНИМАНИЕ!", 6);
        text.append("Окрашено");
        text.append("Не входить!", "Внимание!");
        System.out.println("Количество страниц: " + text.getPendingPagesCount());
        text.print();
        System.out.println("Распечатано " + text.getAmountPrintedPages() + " страниц");
    }
}

