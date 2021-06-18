package layer1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class TRPBO {
private static Connection conn;
public static Connection Koneksi() {
String host = "jdbc:mysql://localhost/test",
user = "root",
pass = "";
try {
conn = (Connection) DriverManager.getConnection(host, user, pass);
} catch (SQLException err) {
JOptionPane.showMessageDialog(null, err.getMessage());
}
return conn;
}         
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    }
    
}
