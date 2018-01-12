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
    
    public DBAccessUtility (){
        try{
            String path = new java.io.File("Invertory.mdb").getAbsolutePath();
        db ="JDBC:ODBC:Driver=Microsoft Access Driver (*.mdb, *.accdb); DBQ="+path;
            doConnection();
        } catch(NullPointerException ex){
                ex.printStackTrace();
        }  
    }
    
    public void doConnection(){
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection(db);
            st = con.createStatement();
//            rs = st.executeQuery("select * from Invertory");
//            while(rs.next()){
//                System.out.println(rs.getObject(1));
//            }
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex.toString());

        }

    }
}
