package stream.Application.service;
import stream.Application.domain.Employee;
import stream.Application.exception.EmployeeExistsException;
import stream.Application.exception.InvalidNameException;

import java.util.Collection;


public interface EmployeeService {

    Employee add(String firstName, String LastName, int salary, int departmentId) throws EmployeeExistsException;

    Employee remove(String firstName, String LastName) throws javax.naming.InvalidNameException, InvalidNameException;

    Collection<Employee> findAll();

    Employee find(String firstName, String lastName) throws InvalidNameException;
}
