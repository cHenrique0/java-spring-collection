package services;

public class TaxService {

    private final double taxRate = 0.20;

    public double tax(double amount) {
        return amount * taxRate;
    }
}
