import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Company {
    private ArrayList<Person> employee = new ArrayList<>();
    private int income = 0;

    public void hire(Person person) {
        income += person.getIncome();
        employee.add(person);
    }

    public void hireAll(ArrayList<Person> employee) {
        for (Person person : employee) {
            income += person.getIncome();
        }
        this.employee.addAll(employee);
    }

    public void fire(Person person) {
        income -= person.getIncome();
        employee.remove(person);
    }

    public void getTopSalaryStaff(int count) {
        if (count > employee.size() || count < 0) {
            System.out.println("Неверное количество сотрудников");
            return;
        }
        Collections.sort(employee);
        for (int i = employee.size() - 1; i > employee.size() - count - 1; i--) {
            System.out.println(employee.get(i).getMonthSalary() + " руб.");
        }
    }

    public void getLowestSalaryStaff(int count) {
        if (count > employee.size() || count < 0) {
            System.out.println("Неверное количество сотрудников");
            return;
        }
        Collections.sort(employee);
        for (int i = 0; i < count; i++) {
            System.out.println(employee.get(i).getMonthSalary() + " руб.");
        }
    }

    public int getIncome() {
        return income;
    }

    public List<Person> getEmployee() {
        ArrayList<Person> employee = new ArrayList<>(this.employee);
        return Collections.unmodifiableList(employee);
    }

    public void recountSalaryToTopManagers() {
        if (income < 10_000_000) {
            for (Person person : employee) {
                if (person.getClass().getName().equals("TopManager")) {
                    person.setSalary((int) Math.round(person.getMonthSalary() / 2.5));
                }
            }
        }
    }
}
