/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database.utility;
import java.sql.*;
/**
 *
 * @author W10
 */


public class DBAccessUtility {
    Connection con ;
    Statement st ;
    ResultSet rs ;
    String db; 
    
    public void DBAccessUtility1 (){
        try{
            String path = new java.io.File("C:\\Users\\W10\\AppData\\Roaming\\Skype\\My Skype Received Files\\BillingMaster.accdb").getAbsolutePath();
        db ="jdbc:ucanaccess://" +path;
            doConnection();
            System.out.println("Connecting............");
        } catch(NullPointerException ex){
                ex.printStackTrace();
        }  
    }
    
    public void doConnection(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(db);
            st = con.createStatement();
              System.out.println("Connecting Driver............");
//            rs = st.executeQuery("select * from Invertory");
//            while(rs.next()){
//                System.out.println(rs.getObject(1));
//            }
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex.toString());

        }

    }
}
