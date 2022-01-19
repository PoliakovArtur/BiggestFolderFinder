public class TopManager extends Person {
    public TopManager(int salary, int companyIncome) {
        super(companyIncome > 10_000_000 ? (int) Math.round(salary * 2.5) : salary);
    }
}


