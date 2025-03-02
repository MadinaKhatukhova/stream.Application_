package stream.application.service;
import org.springframework.stereotype.Service;
import stream.application.domain.Employee;
import stream.application.exception.EmployeeExistsException;
import stream.application.exception.InvalidNameException;

import java.util.*;

@Service
public interface EmployeeService {

    Employee add(String firstName, String LastName, int salary, int departmentId) throws EmployeeExistsException;

    Employee remove(String firstName, String LastName) throws javax.naming.InvalidNameException, InvalidNameException;

    Collection<Employee> findAll();

    Employee find(String firstName, String lastName) throws InvalidNameException;


}
