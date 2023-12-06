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
    
    String position;
   
    String ppsN;
    String iban;
    String payFrequency;
    double grossIncome;
    double taxCredit;
    double taxOwed;
    
    boolean admin;
    private static int currentID = 1;
    
    public Staff(String firstName, String lastName, String birthDate, String email, String Address, String startDate,
            String position, String ppsN, String iban, String payFrequency, boolean admin, double grossIncome, double taxCredit, double taxOwed) {
        this.StaffID = currentID;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.Address = Address;
        this.startDate = startDate;
        //this.endDate = endDate;
        this.position = position;
        //this.status = status;
        this.ppsN = ppsN;
        this.iban = iban;
        this.admin = admin;
        this.payFrequency = payFrequency;
        this.grossIncome= grossIncome;
        this.taxCredit = taxCredit;
        this.taxOwed = taxOwed;
        currentID++;
    }

   
   
     public Staff(int StaffID, int phoneNumber, String firstName, String lastName, String birthDate, String email, String Address, String startDate,
            String position, String ppsN, String iban, String payFrequency, boolean admin, double grossIncome, double taxCredit, double taxOwed) {
        this.StaffID = currentID;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.Address = Address;
        this.startDate = startDate;
        //this.endDate = endDate;
        this.position = position;
        //this.status = status;
        this.ppsN = ppsN;
        this.iban = iban;
        this.admin = admin;
        this.payFrequency = payFrequency;
        this.grossIncome= grossIncome;
        this.taxCredit = taxCredit;
        this.taxOwed = taxOwed;
        if(currentID <= StaffID){
            currentID= StaffID + 1;
     }
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

    

    public String getPosition() {
        return position;
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
     public double getGrossIncome() {
        return grossIncome;
    }

    public double getTaxCredit() {
        return taxCredit;
    }

    public double getTaxOwed() {
        return taxOwed;
    }
    public double calculatePAYE(){
    double PAYE=0;
        return PAYE;    
    };
    public double calculateUSC(){
        double USC = 0;
        return USC;
        
        
    };
  public double calculatePRSI(){
        double PRSI= 0;

       return PRSI;
        
       
    };

    
}
