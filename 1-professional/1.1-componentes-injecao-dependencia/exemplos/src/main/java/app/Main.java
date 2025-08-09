package app;

import entities.Employee;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

public class Main {
    public static void main(String[] args) {
        /**
         * Problema: Salário Líquido
         * Descrição: O problema proposto é desenvolver um programa que leia os dados de um funcionário (nome e
         *            salário bruto) e depois calcule e mostre o salário líquido, considerando desconto de impostos
         *            e previdência. As regras para os cálculos são as seguintes:
         *                  1. Imposto é 20%
         *                  2. Previdência é 10%
         * Exemplo:
         *         Nome: Maria
         *         Salário bruto: 4000.00
         *         Salário líquido = 2800.00
         *
         */

        Employee employee = new Employee("Maria", 4000.00);
        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();
        SalaryService salaryService = new SalaryService(taxService, pensionService);
        double netSalary = salaryService.netSalary(employee);
        System.out.printf("Nome: %s%n", employee.getName());
        System.out.printf("Salário bruto: %.2f%n", employee.getGrossSalary());
        System.out.printf("Salário líquido: %.2f%n", netSalary);
    }
}
