public class Manager extends Person{

    public Manager(int salary, int income) {
        super(salary + (int) Math.round(income * 0.05));
        this.income = income;
    }
}
