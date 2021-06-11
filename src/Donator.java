
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sweety
 */
public class Donator {
    public static int bloodbankid;
    public static String  donarid;
    public static String bloodgroup;
    public static String s1;
    public static String s2;
    public Donator(String donarid,int bloodbankid,String bloodgroup) throws ClassNotFoundException, SQLException{
        this.donarid = donarid;
        this.bloodbankid = bloodbankid;
        this.bloodgroup = bloodgroup;
        insert();
        
    }
    public static void bring1() throws SQLException{
        try{
            System.out.println("i m bring1");
            Connection con=project.ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery("select count(stock_id)+1 as stocks from STOCK");
            if(rs.next())
                s2 = rs.getString("stocks");
            System.out.println(s2);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Donator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void bring3() throws ClassNotFoundException{
        try {
            Connection con=project.ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs2 =st.executeQuery("insert into STOCK values('"+s2+"','"+bloodgroup+"','"+bloodbankid+"')");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Donator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insert() throws SQLException{
        try{
            System.out.println("i m main");
            bring1();
            bring3();
        }
        catch(Exception e){
            
        }
    }
    
}
