/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revenuetaxcalculator;

/**
 *
 * @author caroo
 */
public class TeamLeader extends Staff{
    
    public TeamLeader(String firstName, String lastName, String birthDate, String email, String Address, String startDate,String position,String ppsN, String iban, String payFrequency, boolean admin, double grossIncome, double taxCredit, double taxOwed) {
        super(firstName, lastName, birthDate, email, Address, startDate, position, ppsN, iban, payFrequency, admin, grossIncome, taxCredit, taxOwed);
    }
    
     public void modifyOwnProfile(String newFirstName, String newLastName) {
        setFirstName(newFirstName);
        setLastName(newLastName);
    
}
}