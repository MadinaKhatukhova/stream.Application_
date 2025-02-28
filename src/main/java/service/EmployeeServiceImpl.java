package service;
import controllers.Employee;
import org.springframework.stereotype.Service;

import javax.naming.InvalidNameException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.apache.tomcat.util.IntrospectionUtils.capitalize;
import static org.apache.tomcat.util.http.parser.HttpParser.isAlpha;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String, Employee> employees;
    public EmployeeServiceImpl() { employees = new HashMap<>();
    }

    @Override
    public Employee add(String firstName, String lastName, int salary, int departmentId) throws EmployeeExistsException {

        Employee newEmployee = new Employee(
                firstName,
                lastName,
                salary,
                departmentId
        );
        if (employees.containsKey(getKey(firstName, lastName))) {
            throw new EmployeeExistsException();
        }

        employees.put(getKey(firstName, lastName), newEmployee);
        return newEmployee;
    }

    @Override
    public Employee remove(String firstName, String lastName) throws InvalidNameException, EmployeeNotFoundException {
        validateNames(firstName, lastName);

        if (!employees.containsKey(getKey(firstName, lastName))) {
            throw new EmployeeNotFoundException();
        }

        return employees.get(getKey(firstName, lastName));
    }

    @Override
    public Collection<Employee> findAll() {

        return Collections.unmodifiableCollection(employees.values());
    }

    private void validateNames(String... names) throws InvalidNameException {
        for (String name : names) {
            if (!isAlpha(Integer.parseInt(name))) {
                throw new InvalidNameException(name);
            }
        }
    }

    private String getKey(String firstNae, String lastName) {
        String firstName = "";
        return (firstName + " " + lastName).toLowerCase();}
}
