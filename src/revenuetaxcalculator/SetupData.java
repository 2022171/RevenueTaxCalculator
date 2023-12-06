/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revenuetaxcalculator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author caroo
 */
public class SetupData extends DataBaseTax {
    
//    final static String DB_BASE_URL = "jdbc:mysql://localhost"; // to communicate with MySQL DataBase
//    final static String USER = "ooc2023";
//    final static String PASSWORD = "ooc2023";
    
     public static boolean setupDB() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        
        try(
                Connection conn = DriverManager.getConnection(DB_BASE_URL, USER, PASSWORD);
                Statement stmt = conn.createStatement();
            ){
            stmt.execute("CREATE DATABASE IF NOT EXISTS " + DB_NAME + ";");
            stmt.execute("USE taxcalculator;");
            String sql =
                    "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " ( "
                    + "StaffID INT(10),"
                    + "phoneNumber INT(10),"
                    + "firstName VARCHAR(255),"
                    + "lastName VARCHAR(255),"
                    + "birthDate DATE,"
                    + "email VARCHAR(255),"
                    + "Address VARCHAR(255),"
                    + "startDate DATE,"
                    + "position ENUM ('Manager', 'Supervisor', 'Assistant', 'TeamLeader'),"
                    + "ppsN VARCHAR(255),"
                    + "iban VARCHAR(255),"
                    + "payFrequency ENUM ('weekly', 'monthly')"
                    + "grossIncome INT(10)"
                    + "taxCredit INT(10)"
                    + "taxOwed INT(10)"
                    + ");";
            
            stmt.execute(sql);
            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
}}






