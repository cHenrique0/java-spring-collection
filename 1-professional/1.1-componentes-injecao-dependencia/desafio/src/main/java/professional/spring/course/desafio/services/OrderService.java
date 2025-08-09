package professional.spring.course.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import professional.spring.course.desafio.entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double orderValue = order.getBasic();
        double discountPercent = 1 - (order.getDiscount() / 100.0);
        double shippingValue = shippingService.shipment(order);

        return (orderValue * discountPercent) + shippingValue;
    }
}
