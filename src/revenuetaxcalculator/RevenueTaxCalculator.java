/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revenuetaxcalculator;

import ioutils.IOUtils;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class RevenueTaxCalculator {
    
    

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    
   

   public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
    Scanner myKb = new Scanner(System.in);

<<<<<<< HEAD
//    public static void main(String[] args) 
//            //throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
//    {
=======
  //  public static void main(String[] args) 
            //throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
>>>>>>> 22c7ddbe04dfcc9a0ca6bfebdb15a6be169d9147
        

//        TaxDabaseReader dbr = new TaxDabaseReader ();
//        System.out.println(Staff.getCurrentID());
//        dbr.staffData();
////        dbr.getStaffData(1);
////        dbr.getStaffData(2);
//        System.out.println(Staff.getCurrentID());
//
//     Manager m1 = new Manager("Caroline", "Ferreira", "1994-04-29", "carool.alvesf@gmail.com", "Leo Avenue", "2023-06-12", "2023-12-05", "Manager", "Active", "2022362pw", "klsdfbdslkfbdsl", "monthly");
//        System.out.println(m1);
//        
//        TaxDatabaseWriter dbw = new TaxDatabaseWriter();
//        if(dbw.addStaff(m1)){
//            System.out.println("m1 added");
//        } else {
//            System.out.println("Database setup failed.");
//        }
    

<<<<<<< HEAD
//
//        TaxDabaseReader dbr = new TaxDabaseReader ();
//        System.out.println(Staff.getCurrentID());
//        dbr.staffData();
//
//        dbr.getStaffData(1);
//        dbr.getStaffData(2);
//
////        dbr.getStaffData(1);
////        dbr.getStaffData(2);
//
//        System.out.println(Staff.getCurrentID());

//
=======
>>>>>>> 22c7ddbe04dfcc9a0ca6bfebdb15a6be169d9147
//        TaxDabaseReader dbr = new TaxDabaseReader ();
//        System.out.println(Staff.getCurrentID());
//        dbr.staffData();


    // Get user input for details required for tax calculation
    //System.out.print("Enter gross income: ");
   // double grossIncome = myKb.nextDouble();

    System.out.print("Enter gross income: ");
double grossIncome = myKb.nextDouble();


   //double grossIncome= 0.0
    double taxOwed = 0.0;

    // Ask for marital status
    System.out.println("Enter marital status (single/married): ");
    String maritalStatus = myKb.next(); // Read the user's input for marital status

    // Calculate tax credits based on marital status
    double taxCreditAmount;
    if (maritalStatus.equalsIgnoreCase("single")) {
        taxCreditAmount = TaxCredit.calculateTaxCreditSingleMonthly();
    } else if (maritalStatus.equalsIgnoreCase("married")) {
        taxCreditAmount = TaxCredit.calculateTaxCreditMarriedMonthly();
    } else {
        System.out.println("Invalid marital status entered!");
        return; // Exit the program if the status is invalid
    }

    // Create Manager object with calculated tax credit
    Manager manager = new Manager(
            "John",
            "Doe",
            "1990-05-15",
            "john@example.com",
            "123 Main St",
            "2023-01-01",
            "Manager",
            "123456789",
            "IBAN123456789",
            "monthly",
            true,
            grossIncome,
            taxCreditAmount, // Use calculated tax credit amount
            taxOwed
    );

    // Calculate taxes using the Manager's method
    double prsi = manager.calculatePRSI();
    double usc = manager.calculateUSC(grossIncome);
    double paye = manager.calculatePAYE(grossIncome);
    double totalTaxOwed = prsi + usc + paye;
    double netSalary = grossIncome - totalTaxOwed;
    System.out.println("Calculated PRSI: " + prsi);
    System.out.println("Calculated USC: " + usc);
    System.out.println("Calculated PAYE: " + paye);
    System.out.println("Total Tax Owed: " + totalTaxOwed);
       System.out.println("Net Salary is " + netSalary);

        System.out.println(Staff.getCurrentID());


    
   }}


//IOUtils form = new IOUtils();
//
//String login;
//        
//        login = form.getUserText("Please enter your login or click in new user to be registreded");


<<<<<<< HEAD
//
//IOUtils form = new IOUtils();
//
//String login;
//        
//        login = form.getUserText("Please enter your login or click in new user to be registreded");
//
//
//
//}
}}
=======

}
>>>>>>> 22c7ddbe04dfcc9a0ca6bfebdb15a6be169d9147
