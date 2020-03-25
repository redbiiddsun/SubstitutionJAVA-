package Substitution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DBconnection {
    
    
    public static Connection con = null;
    public static int ID;
    
    
     public static Connection getConnection(){
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/substitution", "root", "");
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Database Connection Failure, Please try again later,", "Alert",JOptionPane.WARNING_MESSAGE);
            System.exit(0);

        }
        
        return con;
    }
     

   
}
