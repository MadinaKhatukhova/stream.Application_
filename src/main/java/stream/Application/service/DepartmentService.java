package stream.Application.service;
import stream.Application.domain.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public interface DepartmentService {

    Optional<Employee> findEmployeeWithMaxSalary(int departmentId);

    Employee findEmployeeWithMinSalary(int departmentId);

    Map<Integer, List<Employee>> findEmployeesByDepartmentSortedByNameSurname();

    Collection<Employee> findEmployeesByDepartmentSortedByNameSurname(int departmentId);

    List<String> usFlatMapTest();

}


