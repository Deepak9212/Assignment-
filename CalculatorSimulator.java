package Lab23March;

import java.util.Scanner;

public class CalculatorSimulator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();
        System.out.print("Is employee an Indian citizen (true/false): ");
        boolean isIndian = scanner.nextBoolean();
        System.out.print("Enter employee salary: ");
        double empSal = scanner.nextDouble();

        TaxCalculator taxCalculator = new TaxCalculator();
        try {
            double taxAmount = taxCalculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + taxAmount);
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
            e.printStackTrace();
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
            e.printStackTrace();
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
