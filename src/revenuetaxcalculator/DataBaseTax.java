/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revenuetaxcalculator;

/**
 *
 * @author caroo
 */
public abstract class DataBaseTax {
    
    protected final static String DB_BASE_URL = "jdbc:mysql://localhost"; // to communicate with MySQL DataBase
    protected final static String USER = "ooc2023";
    protected final static String PASSWORD = "ooc2023";
    protected final static String DB_NAME = "taxcalculator";
    protected final static String TABLE_NAME = "staffData";
    
    protected final static String DB_URL = DB_BASE_URL + "/" + DB_NAME;
    
}
