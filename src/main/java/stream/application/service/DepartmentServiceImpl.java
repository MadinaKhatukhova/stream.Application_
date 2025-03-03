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



}
