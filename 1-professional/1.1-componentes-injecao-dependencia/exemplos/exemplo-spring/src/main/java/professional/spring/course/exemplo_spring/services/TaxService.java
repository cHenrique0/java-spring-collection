package professional.spring.course.exemplo_spring.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {

    private final double taxRate = 0.20;

    public double tax(double amount) {
        return amount * taxRate;
    }
}
