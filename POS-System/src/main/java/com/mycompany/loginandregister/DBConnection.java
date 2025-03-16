
package com.mycompany.loginandregister;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Damian kenny
 */
public class DBConnection {
    
    public static Connection getConnection() {
        try {
            // Update these parameters based on your setup
            String url = "jdbc:mysql://localhost:3306/Grocery";
            String user = "root";
            String password = "Progaproga12";
            
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
