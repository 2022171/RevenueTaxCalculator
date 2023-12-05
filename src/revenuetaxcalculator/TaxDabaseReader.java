/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revenuetaxcalculator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class TaxDabaseReader extends DataBaseTax {
     public ArrayList<Staff> staffData() {
        ArrayList<Staff> allStaff = new ArrayList<>();
        
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery(String.format("SELECT * FROM %s;", TABLE_NAME));
        ) {
            while (results.next()) {
                
               // int phoneNumber = results.getInt("phoneNumber");
              String firstName= results.getString("firstName");
              String lastName = results.getString("lastName");
              String birthDate = results.getString("birthDate");
              String email = results.getString("email");
              String Address = results.getString("Address");
              String startDate = results.getString("startDate");
              String endDate = results.getString("endDate");
              String position = results.getString("position");
              String status = results.getString("status");
              String ppsN = results.getString("ppsN");
              String iban = results.getString("iban");
              String payFrequency = results.getString("payFrequency");
              //boolean admin = results.getBoolean("admin");
                
                
                Manager mg1 = new Manager(firstName, lastName, birthDate,  email, Address, startDate, endDate,
                 position, status,  ppsN,  iban, payFrequency);
                allStaff.add(mg1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return allStaff;
    }
    public Staff getStaffData(int StaffID){
          // we are going to get only the row of a particular id  
          try(
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
         Statement stmt = conn.createStatement();
        ){
             ResultSet results = stmt.executeQuery(String.format(
                     "SELECT * FROM %s WHERE id=%d;",
                     TABLE_NAME, StaffID));
             
           //  results.last();
           //  System.out.println(results.getRow());
           
           results.next();
          
              //  int phoneNumber = results.getInt("phoneNumber");
              String firstName= results.getString("firstName");
              String lastName = results.getString("lastName");
              String birthDate = results.getString("birthDate");
              String email = results.getString("email");
              String Address = results.getString("Address");
              String startDate = results.getString("startDate");
              String endDate = results.getString("endDate");
              String position = results.getString("position");
              String status = results.getString("status");
              String ppsN = results.getString("ppsN");
              String iban = results.getString("iban");
              String payFrequency = results.getString("payFrequency");
           
           int id = results.getInt("id");
           Manager m1 = new Manager(firstName, lastName, birthDate,  email, Address, startDate, endDate,
                 position, status,  ppsN,  iban, payFrequency);     
           return m1;    

      } catch (Exception e){
          e.printStackTrace();
          return null;
      }
      }
}
      

