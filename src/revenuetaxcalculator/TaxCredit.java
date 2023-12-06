/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revenuetaxcalculator;

/**
 *
 * @author danie
 */
public class TaxCredit extends Staff {
  
public TaxCredit(String firstName, String lastName, String birthDate, String email, String Address, String startDate, String position, String ppsN, String iban, String payFrequency, boolean admin, double grossIncome, double taxCredit, double taxOwed) {
        super(firstName, lastName, birthDate, email, Address, startDate, position, ppsN, iban, payFrequency, admin, grossIncome, taxCredit, taxOwed);
    }

    public static double calculateTaxCreditSingleMonthly() {
        double singlePersonCredit = 1775.0;
        double employeeCredit = 1775.0;
        double totalTaxCredits = singlePersonCredit + employeeCredit;
        return totalTaxCredits / 12; // Monthly tax credit amount
    }

    public static double calculateTaxCreditMarriedMonthly() {
        double marriedPersonCredit = 3550.0;
        double employeeCredit = 1775.0;
        double homeCarerCredit = 1700.0;
        double totalTaxCredits = marriedPersonCredit + employeeCredit + homeCarerCredit;
        return totalTaxCredits / 12; // Weekly tax credit amount
    }

    // Similar method for monthly tax credit for married person

   

    
}


