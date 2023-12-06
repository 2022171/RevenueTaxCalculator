/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revenuetaxcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author caroo
 */
public class Manager extends Staff implements taxCalculation {
  // double taxCredit;
   public Manager(String firstName, String lastName, String birthDate, String email, String Address, String startDate, String position, String ppsN, String iban, String payFrequency, boolean admin, double grossIncome, double taxCredit, double taxOwed) {
        super(firstName, lastName, birthDate, email, Address, startDate, position, ppsN, iban, payFrequency, admin, grossIncome, taxCredit, taxOwed);
       // this.taxCredit=0;
   }
    public void modifyOwnProfile(String newFirstName, String newLastName) {
        // Modifying own profile details
        setFirstName(newFirstName);
        setLastName(newLastName);
        
        // Any other attributes you want to modify
    }

    // Method to access a list of all other users in the system
    public List<Staff> getAllUsers(List<Staff> allStaff) {
        List<Staff> otherUsers = new ArrayList<>(allStaff);
        otherUsers.remove(this); // Remove the manager from the list
        return otherUsers;
    }

    // Method to remove other users from the system
    public void removeUser(List<Staff> allStaff, Staff userToRemove) {
        if (allStaff.contains(userToRemove)) {
            allStaff.remove(userToRemove);
            System.out.println(userToRemove.getFirstName() + " " + userToRemove.getLastName() + " removed from the system.");
        } else {
            System.out.println("User not found in the system.");
        }
    }

    // Method to review the operations performed by other users
    public void reviewUserOperations(Staff user) {
        // Implement logic to review operations performed by a specific user
        // This could involve accessing logs, database entries, etc.
        // For example:
        // user.getOperationsPerformed();
        System.out.println("Reviewing operations performed by " + user.getFirstName() + " " + user.getLastName());
    }
    
    
    @Override
    public double calculatePRSI() {
    double prsiAmount = calculatePRSI(getGrossIncome()); // Use the gross income stored in the object
    
    return prsiAmount;
}

// Modify calculatePRSI to use the stored grossIncome
private double calculatePRSI(double grossIncome) {
    double prsi;
    
    if (grossIncome <= 398) {
        prsi = grossIncome * 0.005; // 0.5% PRSI rate for income up to €398
    } else {
        double remainingIncome = grossIncome - 398;
        prsi = (398 * 0.005) + (remainingIncome * 0.02); // 0.5% up to €398, 2% above that
    }

    return prsi;
}
  

    
     

    public double calculateUSC(double grossIncome) {
   // double grossIncome = inputSalary // Assign the method parameter to a local variable

    // Remove the Scanner object (myKb) from the method as it's not needed here
    
    double rate1 = 0.005;
    double rate2 = 0.02;
    double rate3 = 0.045;

    double band1 = 12012.00;
    double band2 = 19068.00;

    double USC;
    
    if (grossIncome <= band1) {
        USC = grossIncome * rate1;
    } else if (grossIncome <= band2) {
        USC = (band1 * rate1) + ((grossIncome - band1) * rate2);
    } else {
        USC = (band1 * rate1) + ((band2 - band1) * rate2) + ((grossIncome - band2) * rate3);
    }
    
    return USC;
}






    
  
   public double calculatePAYE(double salary) {
        double PAYE ;
        double taxRate20 = 0.2; // 20% tax rate
        double taxRate40 = 0.4; // 40% tax rate
        double maxAmount = 36800.00; // Income threshold
        
        if (salary <= maxAmount) {
            PAYE = salary * taxRate20;
        } else {
            double remainingIncome = salary - maxAmount;
            double taxUpToThreshold = maxAmount * taxRate20;
            PAYE = taxUpToThreshold + (remainingIncome * taxRate40);
        }
        
        return PAYE;
    }
}
