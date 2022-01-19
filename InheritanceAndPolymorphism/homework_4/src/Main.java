public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        for (int i = 0; i < 180; i++) {
            int salary = (int) Math.round(Math.random() * 5_000) + 30_000;
            company.hire(new Operator(salary));
        }

        for (int i = 0; i < 80; i++) {
            int salary = (int) Math.round(Math.random() * 5_000) + 50_000;
            int income = (int) Math.round(Math.random() * 25_000) + 115_000;
            company.hire(new Manager(salary, income));
        }

        for (int i = 0; i < 10; i++) {
            int salary = (int) Math.round(Math.random() * 5_000) + 70_000;
            company.hire(new TopManager(salary, company.getIncome()));
        }

        System.out.println("В компании " + company.getEmployee().size() + " сотрудников");
        System.out.println("10 самых высоких зарплат");
        company.getTopSalaryStaff(10);
        System.out.println("30 самых низких зарплат");
        company.getLowestSalaryStaff(30);

        int firedOperatorsCount = 0;
        int firedManagersCount = 0;
        int firedTopManagersCount = 0;

        for (Person person : company.getEmployee()) {
            if (person.getClass().getName().equals("Operator") && firedOperatorsCount < 90) {
                company.fire(person);
                firedOperatorsCount++;
            }

            if (person.getClass().getName().equals("Manager") && firedManagersCount < 40) {
                company.fire(person);
                firedManagersCount++;
            }

            if (person.getClass().getName().equals("TopManager") && firedTopManagersCount < 5) {
                company.fire(person);
                firedTopManagersCount++;
            }
        }
        company.recountSalaryToTopManagers();
        System.out.println("В компании " + company.getEmployee().size() + " сотрудников");
        System.out.println("10 самых высоких зарплат");
        company.getTopSalaryStaff(10);
        System.out.println("30 самых низких зарплат");
        company.getLowestSalaryStaff(30);
    }
}


