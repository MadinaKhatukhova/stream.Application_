import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


	public class Main {
		public static Employee[] employees() {
			Employee[] employee = new Employee[10];
			employee[0] = new Employee("Иванов", "Иван", "Иванович", 1, 115000);
			employee[1] = new Employee("Александров", "Александр", "Александрович", 2, 155000);
			return employee;
		}

		static Employee[] employee = employees();

		public static void listOfAllEmployees() {
			System.out.println("Список сотрудников:");
			for (Employee list : employee) {
				if (list == null) {
					break;
				}
				System.out.println(list);
			}
		}

		public static void salaryExpensesPerMonth() {
			float sum = 0;
			for (Employee i : employee) {
				if (i == null) {
					continue;
				}
				sum += i.getSalary();
			}
			System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
		}

		public static void minimumSalaryEmployee() {
			float minSalary = 1_000_000;
			String fullName = null;
			int department = 0;
			int id = 0;
			for (Employee i : employee) {
				if (i == null) {
					break;
				} else if (i.getSalary() < minSalary) {
					minSalary = i.getSalary();
					fullName = i.fullName;
					department = i.getDepartment();
					id = i.getId();
				}
			}
			System.out.println('\n' + "Минимальная зарплата у сотрудника №" + id + '\n' + "ФИО: " +
					fullName + '\n' + "Отдел: " + department + '\n' + "Зарплата: " + minSalary);

		}

		public static void main(String[] args) {
			listOfAllEmployees();
			salaryExpensesPerMonth();
			minimumSalaryEmployee();
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
