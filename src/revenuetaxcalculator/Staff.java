/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revenuetaxcalculator;

/**
 *
 * @author danie
 */
public abstract class Staff {
    int StaffID;
    int phoneNumber;
    String firstName;
    String lastName;
    String birthDate;
    String email;
    String Address;
    String startDate;
    String endDate;
    String position;
    String status;
    String ppsN;
    String iban;
    String payFrequency;
    boolean admin;
    private static int currentID = 1;
    
    public Staff(int StaffID, int phoneNumber, String firstName, String lastName, String birthDate, String email, String Address, String startDate, String endDate, 
            String position, String status, String ppsN, String iban, String payFrequency, boolean admin) {
        this.StaffID = currentID;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.Address = Address;
        this.startDate = startDate;
        this.endDate = endDate;
        this.position = position;
        this.status = status;
        this.ppsN = ppsN;
        this.iban = iban;
        this.admin = admin;
        this.payFrequency = payFrequency;
        currentID++;
    }
   
    

    public int getStaffID() {
        return StaffID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return Address;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getPosition() {
        return position;
    }

    public String getStatus() {
        return status;
    }

    public String getPpsN() {
        return ppsN;
    }

    public String getIban() {
        return iban;
    }

    public String getPayFrequency() {
        return payFrequency;
    }

    public static int getCurrentID() {
        return currentID;
    }
    
    public void setStaffID(int StaffID) {
        this.StaffID = StaffID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    

    
}
