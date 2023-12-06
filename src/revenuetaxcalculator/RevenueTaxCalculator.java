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
    
   

   public static void main(String[] args){
       int optionNum = system();

        if (optionNum == 1) {
            login();
        } else if (optionNum == 2) {
            register();
        } else {
            System.out.println("Opção inválida.");
        }
    }
   
    
    
    public static int system() {
        
      Scanner userInput = new Scanner(System.in);
    
      System.out.println("WELCOME TO YOUR REVENUE TAX CALCULATION! "
               + "CHOOSE AN OPTION: "
               + "1: LOGIN "
               + "2: SIGN UP");
      
      return userInput.nextInt();


   }
    
    public static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String username = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String password = scanner.nextLine();
       
        
    }
    
        public static void register() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o novo nome de usuário: ");
        String newUsername = scanner.nextLine();

        System.out.print("Digite a nova senha: ");
        String newPassword = scanner.nextLine();

        }
}

//    public static void main(String[] args) 
//            //throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
//    {

  //  public static void main(String[] args) 
            //throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    //{

        

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

//        TaxDabaseReader dbr = new TaxDabaseReader ();
//        System.out.println(Staff.getCurrentID());
//        dbr.staffData();


    // Get user input for details required for tax calculation
    //System.out.print("Enter gross income: ");
   // double grossIncome = myKb.nextDouble();

//    System.out.print("Enter gross income: ");
//double grossIncome = myKb.nextDouble();
//
//
//   //double grossIncome= 0.0
//    double taxOwed = 0.0;
//
//    // Ask for marital status
//    System.out.println("Enter marital status (single/married): ");
//    //String maritalStatus = myKb.next(); // Read the user's input for marital status

    // Calculate tax credits based on marital status
//    double taxCreditAmount;
//    if (maritalStatus.equalsIgnoreCase("single")) {
//        taxCreditAmount = TaxCredit.calculateTaxCreditSingleMonthly();
//    } else if (maritalStatus.equalsIgnoreCase("married")) {
//        taxCreditAmount = TaxCredit.calculateTaxCreditMarriedMonthly();
//    } else {
//        System.out.println("Invalid marital status entered!");
//        return; // Exit the program if the status is invalid
//    }
//
//    // Create Manager object with calculated tax credit
//    Manager manager = new Manager(
//            "John",
//            "Doe",
//            "1990-05-15",
//            "john@example.com",
//            "123 Main St",
//            "2023-01-01",
//            "Manager",
//            "123456789",
//            "IBAN123456789",
//            "monthly",
//            true,
//            grossIncome,
//            taxCreditAmount, // Use calculated tax credit amount
//            taxOwed
//    );
//
//    // Calculate taxes using the Manager's method
//    double prsi = manager.calculatePRSI();
//    double usc = manager.calculateUSC(grossIncome);
//    double paye = manager.calculatePAYE(grossIncome);
//    double totalTaxOwed = prsi + usc + paye;
//    double netSalary = grossIncome - totalTaxOwed;
//    System.out.println("Calculated PRSI: " + prsi);
//    System.out.println("Calculated USC: " + usc);
//    System.out.println("Calculated PAYE: " + paye);
//    System.out.println("Total Tax Owed: " + totalTaxOwed);
//       System.out.println("Net Salary is " + netSalary);
//
//        System.out.println(Staff.getCurrentID());
//
//
//    
//   }}



//
//
//
//}
//}
