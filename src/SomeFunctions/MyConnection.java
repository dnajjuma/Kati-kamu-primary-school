package SomeFunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class MyConnection {
   
    
    public static Connection getConnection(){
        Connection cnx = null;
                     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        cnx = DriverManager.getConnection("jdbc:mysql://localhost/login?autoReconnect=true&useSSL=false", "root", "");
    } catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    return cnx;
    
    }
}
