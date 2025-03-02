package stream.application.service;

import org.springframework.stereotype.Service;
import stream.application.domain.Employee;
import stream.application.exception.EmployeeExistsException;
import stream.application.exception.InvalidNameException;

import java.util.*;

import static java.util.Comparator.comparingInt;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final EmployeeService employeeService;

    @Override
    public Optional<Employee> findEmployeeWithMaxSalary(int departmentId) {

        Optional<Employee> max = employeeService
                .findAll()
                .stream()
                .filter(e -> e.getDepartment() ==departmentId)
                .max(comparingInt((java.util.function.ToIntFunction<? super Employee>) Employee::getSalary));

        return employeeService
                .findAll()
                .stream()
                .filter(e -> e.getDepartmentId() == departmentId)
                .max(comparingInt((java.util.function.ToIntFunction<? super Employee>) Employee::getSalary));

    }

    public DepartmentServiceImpl(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public Employee findEmployeeWithMinSalary(int departmentId) {
        return null;
    }

    @Override
    public Map<Integer, List<Employee>> findEmployeesByDepartmentSortedByNameSurname() {
        return Map.of();
    }

    @Override
    public Collection<Employee> findEmployeesByDepartmentSortedByNameSurname(int departmentId) {
        return List.of();
    }

    @Override
    public List<String> usFlatMapTest() {
        return List.of();
    }

    @Override
    public String toString() {
        return "DepartmentServiceImpl{" +
                "employeeService=" + employeeService +
                '}';
    }

    public Employee add(String firstName, String LastName, int salary, int departmentId) throws EmployeeExistsException {
        return employeeService.add(firstName, LastName, salary, departmentId);
    }

    public Employee remove(String firstName, String LastName) throws javax.naming.InvalidNameException, InvalidNameException {
        return employeeService.remove(firstName, LastName);
    }

    public Collection<Employee> findAll() {
        return employeeService.findAll();
    }

    public Employee find(String firstName, String lastName) throws InvalidNameException {
        return employeeService.find(firstName, lastName);

    }

}
