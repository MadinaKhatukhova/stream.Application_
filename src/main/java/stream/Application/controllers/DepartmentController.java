package stream.Application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import stream.Application.domain.Employee;
import stream.Application.service.DepartmentService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {this.departmentService = departmentService;}

    @GetMapping("/max-salary")
    public Optional<Employee> getEmployeeWithMaxSalaryByDepartmentId(@RequestParam int departmentId) {
        return departmentService.findEmployeeWithMaxSalary(departmentId);
    }

    @GetMapping(" min-salary")
    public Employee getEmployeeWithMinSalaryByDepartmentId (@RequestParam int departmentId) {
        return departmentService.findEmployeeWithMinSalary(departmentId);
    }

    @GetMapping ("/all")
    public Map<Integer, List<Employee>> findEmployees() {
        return departmentService.findEmployeesByDepartmentSortedByNameSurname();

    }
    
    @GetMapping(path = "/all", params = {"departmentId"})
    public Collection<Employee> findEmployees(@RequestParam int departmentId) {
        return departmentService.findEmployeesByDepartmentSortedByNameSurname(departmentId);

            }

}