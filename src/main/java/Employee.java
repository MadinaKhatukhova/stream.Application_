
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


    public Employee(String lastName, String firstName, String middleName, int department, float salary) {
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
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getDepartment() == employee.getDepartment() && Float.compare(employee.getSalary(), getSalary()) == 0 && getId() == employee.getId() && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName) && Objects.equals(getFullName(), employee.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, getFullName(), getDepartment(), getSalary(), getId());
    }

    @Override
    public String toString() {

        return "Сотрудник №"  + id + '\n' +
                "ФИО: " + fullName + '\n' +
                "Отдел: " + department + '\n' +
                "Зарплата: " + salary + '\n';
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    public void getDepartmentId(){

        return;
    }
}



