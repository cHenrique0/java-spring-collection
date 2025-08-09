package services;

public class PensionService {

    private final double pensionRate = 0.10;

    public double discount(double amount) {
        return amount * pensionRate;
    }
}
