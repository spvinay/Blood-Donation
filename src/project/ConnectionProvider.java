/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author sweety
 */
public class ConnectionProvider {
    
    public static Connection getCon() throws ClassNotFoundException
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nayana","na");
            System.out.println("Connected");
            return con;
            
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}
