import java.util.Objects;

public class Employee {
    String firstName;
    // String middleName;
    String lastName;
    String fullName;
    int department;
    float salary;
    static int counter;
    int id;
    private Object middleName;

    public Employee(String lastName, String firstName, int department, float salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        // this.middleName = middleName;
        this.fullName = lastName + " " + firstName + " " + salary;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public Employee(String иван, String иванов, String number, String number1) {
    }

    public Employee(String александров, String александр, String александрович, int i, int i1) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        Object middleName = null;
        return getDepartment() == employee.getDepartment() && Float.compare(employee.getSalary(), getSalary()) == 0 && getId() == employee.getId() && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName) && Objects.equals(getFullName(), employee.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, getFullName(), getDepartment(), getSalary(), getId());
    }

    @Override
    public String toString() {

        return "Сотрудник №" + id + '\n' +
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

    public String getFirstName() {
        return "";
    }

    public String getLastName() {
        return "";
    }
}