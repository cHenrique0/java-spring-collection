package professional.spring.course.desafio.services;

import org.springframework.stereotype.Service;
import professional.spring.course.desafio.entities.Order;

@Service
public class ShippingService {
    public double shipment(Order order) {
        double orderValue = order.getBasic();

        if (orderValue < 100.0) {
            return 20.0;
        } else if (orderValue < 200.0) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}
