package professional.spring.course.exemplo_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import professional.spring.course.exemplo_spring.entities.Employee;
import professional.spring.course.exemplo_spring.services.SalaryService;

@SpringBootApplication
public class ExemploSpringApplication implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;

	public static void main(String[] args) {
		SpringApplication.run(ExemploSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("John Doe", 5000.00);
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Gross Salary: " + employee.getGrossSalary());
		System.out.println("Net Salary: " + salaryService.netSalary(employee));
	}
}
