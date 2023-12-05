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
    
    public TeamLeader( String firstName, String lastName, String birthDate, String email, String Address, String startDate, String endDate, String position, String status, String ppsN, String iban, String payFrequency, boolean admin) {
        super(firstName, lastName, birthDate, email, Address, startDate, endDate, position, status, ppsN, iban, payFrequency, false);
    }
    
}
