/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DataAccessObject;

import com.database.utility.DBAccessUtility;
import com.model.Customer;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author W10
 */
public class CustomerDAO {
   
    
    public boolean createCustomer(Customer customer){
        boolean result=false;
       String stmt = "insert into Customer(custName,adress,cityName,areaCode,state,stateCode,contactNo1,contactNo2,"
               + "contactNo3,gstin,email,dob,annivarsaryDate,profession,pincode,bankName,ifsc,AccNo,BankBranch,openingBalance)"+
					" values('"+customer.getCustName()+"','"+customer.getAdress()+"','"+customer.getCityName()+"','"+
					customer.getAreaCode()+"','"+customer.getState()+"','"+customer.getStateCode()+"','"+customer.getContactNo1()+"','"+
               customer.getContactNo2()+"','"+customer.getContactNo3()+"','"+customer.getGstin()+"','"+customer.getEmail()+"','"+customer.getDob()+"','"+
               customer.getAnnivarsaryDate()+"','"+customer.getProfession()+"',"+customer.getPincode()+",'"+customer.getBankName()+"',"+customer.getIfsc()+",'"+
               customer.getAccNo()+"','"+customer.getBankBranch()+"',,"+customer.getOpeningBalance()+")";
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


