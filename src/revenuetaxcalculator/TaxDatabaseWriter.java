/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revenuetaxcalculator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author danie
 */
public class TaxDatabaseWriter extends DataBaseTax {
    
    public boolean addPatient (Staff staff) throws SQLException{
         try(
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement stmt = conn.createStatement();
            ){
             String sql = String.format("INSERT INTO " + TABLE_NAME + " VALUES ("
                     + "'%s', '%s', '%s', %d);",
                    staff.getStaffID(), staff.getPhoneNumber(), staff.getFirstName(), staff.getLastName(), staff.getBirthDate(), staff.getEmail(), staff.getAddress(), staff.getStartDate(), staff.getEndDate(), staff.getPosition(), staff.getStatus(), staff.getPpsN(), staff.getIban(), staff.getPayFrequency());
                     stmt.execute(sql);
                     return true;
                           
         }
    }
    public boolean addallStaff(List<Staff> allStaff){
        return true;
    }
}
