public abstract class Person
    implements Employee {
    protected int salary;
    protected int income = 0;

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        return Integer.compare(salary, person.getMonthSalary());
    }

    public Person(int salary) {
        this.salary = salary;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }

    public int getIncome() {
        return income;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

