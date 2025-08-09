package professional.spring.course.exemplo_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemploSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExemploSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("TESTE");
	}
}
