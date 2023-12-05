/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revenuetaxcalculator;

import java.sql.SQLException;

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
        
        TaxDabaseReader dbr = new TaxDabaseReader ();
        System.out.println(Staff.getCurrentID());
        dbr.staffData();

        dbr.getStaffData(1);
        dbr.getStaffData(2);

//        dbr.getStaffData(1);
//        dbr.getStaffData(2);

        System.out.println(Staff.getCurrentID());

     Manager m1 = new Manager("Caroline", "Ferreira", "1994-04-29", "carool.alvesf@gmail.com", "Leo Avenue", "2023-06-12", "2023-12-05", "Manager", "Active", "2022362pw", "klsdfbdslkfbdsl", "monthly");
        System.out.println(m1);
        
        TaxDatabaseWriter dbw = new TaxDatabaseWriter();
        if(dbw.addStaff(m1)){
            System.out.println("m1 added");
        } else {
            System.out.println("Database setup failed.");
        }
    
    
}
}
