/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Conection {
        private static  Connection conection;
        public static Connection koneksiDB() throws SQLException{
            String url = "jdbc:mysql://localhost/mahasiswa";
            String user = "root";
            String pass = "";
            
            try { 
                conection = DriverManager.getConnection(url, user, pass);
            }catch ( SQLException e )
            {JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            return conection;
        }

    
}
