package service;
import controllers.Employee;
import javax.naming.InvalidNameException;
import java.util.Collection;


public interface EmployeeService {

    Employee add(String firstName, String LastName, int salary, int departmentId) throws EmployeeExistsException;

    Employee remove(String firstName, String LastName) throws InvalidNameException, EmployeeNotFoundException;

    Collection<Employee> findAll();
}
