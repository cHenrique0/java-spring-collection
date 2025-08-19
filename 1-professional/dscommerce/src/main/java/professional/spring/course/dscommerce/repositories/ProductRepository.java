package professional.spring.course.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import professional.spring.course.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
