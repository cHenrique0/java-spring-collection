package services;

import entities.Employee;

public class SalaryService {
    private final TaxService taxService = new TaxService();
    private final PensionService pensionService = new PensionService();

    public double netSalary(Employee employee) {
        double tax = taxService.tax(employee.getGrossSalary());
        double pension = pensionService.discount(employee.getGrossSalary());

        return employee.getGrossSalary() - tax - pension;
    }
}
