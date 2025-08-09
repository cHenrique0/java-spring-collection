package services;

import entities.Employee;

public class SalaryService {
    private final TaxService taxService;
    private final PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee employee) {
        double tax = taxService.tax(employee.getGrossSalary());
        double pension = pensionService.discount(employee.getGrossSalary());

        return employee.getGrossSalary() - tax - pension;
    }
}
