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
      
        
        if (SetupData.setupDB()) {
        
        System.out.println("Database and table created");
    } else{
           System.out.println("Oh no! There is a problem");
       }
    }
    
}
