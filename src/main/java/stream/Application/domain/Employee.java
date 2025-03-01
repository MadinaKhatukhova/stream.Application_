
package stream.Application.domain;

import java.util.Arrays;
import java.util.Objects;

public class Employee {


    String firstName;
    String middleName;
    String lastName;
    String fullName;
    int department;
    float salary;
    static int counter;
    int id;


    public Employee(String lastName, String firstName, int department, float salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.fullName = lastName + " " + firstName + " " + middleName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Float.compare(salary, employee.salary) == 0 && id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName) && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return (int) salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public int getDepartmentId() {
        return 0;
    }

    public Arrays getAvatarLinks() {
        return null;
    }
}
