/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database.utility;
import java.sql.*;
import static util.DBUtil.dbConnect;
import static util.DBUtil.dbDisconnect;
/**
 *
 * @author W10
 */


public class DBAccessUtility {
   private static Connection con ;
    static Statement st ;
    ResultSet rs ;
    static String db; 
    
    private static final String ODBC_DRIVER="net.ucanaccess.jdbc.UcanaccessDriver";
    
    
    public  void DBAccessUtility1 (){
    }
    
    public static void doConnection(){
        
        String path = new java.io.File("C:\\Users\\W10\\Documents\\BillingMaster.accdb").getAbsolutePath();
         db ="jdbc:ucanaccess://" +path;
        try{
            Class.forName(ODBC_DRIVER);
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
        public static void dbDisconnect() throws SQLException {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (Exception e){
           throw e;
        }
    }
    
    public static int dbExecuteUpdate(String sqlStmt) throws SQLException, ClassNotFoundException {
        //Declare statement as null
        Statement stmt = null;
        int count =0;
        try {
            //Connect to DB (Establish Oracle Connection)
            doConnection();
            System.out.println("Statement "+sqlStmt+"\n");
            //Create Statement
            stmt = con.createStatement();
            //Run executeUpdate operation with given sql statement
            count=stmt.executeUpdate(sqlStmt);
        } catch (SQLException e) {
            System.out.println("Problem occurred at executeUpdate operation : " + e);
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                //Close statement
                stmt.close();
            }
            //Close connection
            dbDisconnect();
        }
        return count;
    }
    
    //DB Execute Query Operation
    public static ResultSet dbExecuteQuery(String queryStmt) throws SQLException, ClassNotFoundException {
        //Declare statement, resultSet and CachedResultSet as null
        Statement stmt = null;
        ResultSet resultSet = null;
//        CachedRowSet crs = null;
        try {
            //Connect to DB (Establish Oracle Connection)
            doConnection();
            System.out.println("Select statement: " + queryStmt + "\n");
 
            //Create statement
            stmt = con.createStatement();
 
            //Execute select (query) operation
            resultSet = stmt.executeQuery(queryStmt);
 
            //CachedRowSet Implementation
            //In order to prevent "java.sql.SQLRecoverableException: Closed Connection: next" error
            //We are using CachedRowSet
//            crs = new CachedRowSet();
//            crs.populate(resultSet);
        } catch (SQLException e) {
            System.out.println("Problem occurred at executeQuery operation : " + e);
            e.printStackTrace();
        } 
       
        //Return CachedRowSet
        return resultSet;
    }
}
