import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        sortBySalaryAndAlphabet(staff);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        Collections.sort(staff, (o1, o2) -> {
        return o1.getSalary().compareTo(o2.getSalary());
        });
        Collections.sort(staff, (o1, o2) -> {
            if (!o1.getSalary().equals(o2.getSalary())) {
                return 0;
            }
            return o1.getName().compareTo(o2.getName());
        });
    }
}