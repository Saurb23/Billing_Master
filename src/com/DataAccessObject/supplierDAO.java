/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DataAccessObject;

import com.database.utility.DBAccessUtility;
import com.model.Supplier;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author W10
 */
public class supplierDAO {
    
    public boolean createSupplier(Supplier supplier){
        boolean result=false;
       String stmt = "insert into supplier(firmName,ownerName,address,gstNo,state,stateCode,panNo,contact1,"
               + "contact2,contact3,contact4,BankName,ifsc,accNo,bankBranch,email,openingBalance,credit_debit,companyCode)"+
					" values('"+supplier.getFirmName()+"','"+supplier.getOwnerName()+"','"+supplier.getAddress()+"','"+
					supplier.getGstin()+"','"+supplier.getState()+"','"+supplier.getStateCode()+"','"+supplier.getPanNo()+"','"+
               supplier.getContact1()+"','"+supplier.getContact2()+"','"+supplier.getContact3()+"','"+supplier.getContact4()+"','"+supplier.getBankName()+"','"+
               supplier.getIfsc()+"','"+supplier.getAccNo()+"','"+supplier.getBankBranch()+"','"+supplier.getEmail()+"',"+supplier.getOpenBalance()+",'"+
               supplier.getCreditDebit()+"','"+supplier.getCompanyCode()+"')";
        try {
            DBAccessUtility.dbExecuteUpdate(stmt);
            result=true;
        } catch (SQLException ex) {
            Logger.getLogger(supplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(supplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
