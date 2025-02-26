import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public class EmployeeService {

    private Map<String, Employee> employees;
    public EmployeeService() {
        employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        String fullName = employee.getFirstName() + " " + employee.getLastName();
        employees.put(fullName, employee);
    }

    public void removeEmployee(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        employees.remove(fullName);
    }

    public Employee findEployee(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return employees.get(fullName);
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    public void addTestData() {
        employees.put("Иванов", new Employee("Иван", "Иванов", "1", "25000"));
        employees.put("Петров", new Employee("Петр", "Петров", "2", "45000"));
        employees.put("Сидоров", new Employee("Сидр", "Сидоров", "1", "75000"));
    }
}
