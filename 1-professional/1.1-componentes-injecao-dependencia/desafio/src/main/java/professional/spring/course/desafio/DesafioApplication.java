package professional.spring.course.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import professional.spring.course.desafio.entities.Order;
import professional.spring.course.desafio.services.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1034, 150.0, 20.0);

		Double totalOrder = orderService.total(order);

		System.out.printf("%nPedido código %d%nValor total: R$ %.2f%n", order.getCode(), totalOrder);
	}
}
