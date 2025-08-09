package professional.spring.course.exemplo_spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import professional.spring.course.exemplo_spring.entities.Employee;

@Service
public class SalaryService {
    @Autowired
    private TaxService taxService;
    @Autowired
    private PensionService pensionService;

    public double netSalary(Employee employee) {
        double tax = taxService.tax(employee.getGrossSalary());
        double pension = pensionService.discount(employee.getGrossSalary());

        return employee.getGrossSalary() - tax - pension;
    }
}
