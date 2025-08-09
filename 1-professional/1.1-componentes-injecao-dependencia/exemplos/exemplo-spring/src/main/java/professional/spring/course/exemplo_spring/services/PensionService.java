package professional.spring.course.exemplo_spring.services;

import org.springframework.stereotype.Service;

@Service
public class PensionService {

    private final double pensionRate = 0.10;

    public double discount(double amount) {
        return amount * pensionRate;
    }
}
