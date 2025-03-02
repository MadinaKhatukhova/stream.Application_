package stream.application.service;
import org.springframework.stereotype.Service;
import stream.application.domain.Employee;

import java.util.*;

@Service
public interface DepartmentService {

   Optional<Employee> findEmployeeWithMaxSalary(int departmentId);

   Employee findEmployeeWithMinSalary(int departmentId);

    Map<Integer, List<Employee>> findEmployeesByDepartmentSortedByNameSurname();

    Collection<Employee> findEmployeesByDepartmentSortedByNameSurname(int departmentId);

    List<String> usFlatMapTest();


}


