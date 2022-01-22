import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {

        Pattern pattern = Pattern.compile(Integer.toString(year));
        return staff.stream().filter(e -> {
            Matcher matcher = pattern.matcher(e.getWorkStart().toString());
            return matcher.find();
        }).max(Comparator.comparing(Employee::getSalary)).get();
    }
}