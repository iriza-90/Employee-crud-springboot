package rw.ac.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rw.ac.app.model.Employee;
import rw.ac.app.repo.EmployeeRepo;
import java.util.*;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(EmployeeRepo employeeRepo){
		return args -> {
			Employee emp1 = new Employee("Iriza","Joella","RCA","DBA");
			Employee emp2 = new Employee("Ineza","Bebe","RRA","Network Admin");
			Employee emp3 = new Employee("Umulisa","Ornella","K lab","Senior dev");
			Employee emp4 = new Employee("Nganji","Elton","RDB","Junior DBA");
			Employee emp5 = new Employee("Gisa","Hygues","RCA","Manager");

			List<Employee> employees = new ArrayList<>();
			employees.add(emp1);
			employees.add(emp2);
			employees.add(emp3);
			employees.add(emp4);
			employees.add(emp5);

			for (Employee employee : employeeRepo.saveAll(employees)) {

			}


		};
	}

}
