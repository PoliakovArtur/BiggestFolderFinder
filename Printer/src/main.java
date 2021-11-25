public class main {
    public static void main(String[] args) {
        Printer textOne = new Printer();
        textOne.append("Работают белазы", "ВНИМАНИЕ!", 6);
        System.out.println("\nКоличество страниц " + textOne.getPendingPagesCount());
        textOne.print();

        Printer textTwo = new Printer();
        textTwo.append("Окрашено");
        System.out.println("\nКоличество страниц " + textTwo.getPendingPagesCount());
        textTwo.print();

        Printer textThree = new Printer();
        textThree.append("Не входить!", 3);
        textThree.clear();
        textThree.append("Не входить!", "Внимание!");
        System.out.println("\nКоличество страниц " + textThree.getPendingPagesCount());
        textThree.print();

        System.out.println("\nКоличество страниц за все время работы принтера " + textOne.getPrintPagesCountAllTime());
    }
}

