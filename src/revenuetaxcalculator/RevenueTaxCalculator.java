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
        System.out.println(Staff.getCurrentID());

        
       // if (SetupData.setupDB()) {

       //Manager m1 = new Manager();

        
      //  if (SetupData.setupDB()) {
       // Manager m1 = new Manager();
        //System.out.println("Database and table created");
    }// else{
        //  System.out.println("Oh no! There is a problem");
      // }
  //  }//
    
}
