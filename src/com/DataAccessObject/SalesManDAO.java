/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DataAccessObject;

import com.database.utility.DBAccessUtility;
import com.model.SalesMan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author W10
 */
public class SalesManDAO {
    
    public boolean createSalesMan(SalesMan salesMan){
        boolean result=false;
       String stmt="insert into salesman(salesmanName,address,contactNo,idNo,idProof,designation,bankName,ifsc,AccNO,bankBranch,backHand,openingBalance,credit_debit,"
               + "photo,joiningDate,dob) values('"+salesMan.getSalesManName()+"','"+salesMan.getAddress()+"','"+salesMan.getContactNo()+"','"+salesMan.getIdNo()+"','"+
               salesMan.getIdProof()+"','"+salesMan.getDesgination()+"','"+salesMan.getBankName()+"','"+salesMan.getIfsc()+"','"+salesMan.getAccNO()+"','"+salesMan.getBankBranch()+"',"+
               salesMan.getBackHand()+","+salesMan.getOpeningBalance()+",'"+salesMan.getCredit_debit()+"','"+salesMan.getPhoto()+"',#"+salesMan.getJoiningDate()+"#,#"+salesMan.getDob()+"#)";
	
        try {
            DBAccessUtility.dbExecuteUpdate(stmt);
        } catch (SQLException |ClassNotFoundException ex) {
            result=false;
            Logger.getLogger(SalesManDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return result;					
    }
}
