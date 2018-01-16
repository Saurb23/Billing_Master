/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DataAccessObject;

import com.database.utility.DBAccessUtility;
import com.model.Supplier;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author W10
 */
public class supplierDAO {
    
    ResultSet rs=null;
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
    
    public List<Supplier> showSupplier(){
        List<Supplier> supplierList= new ArrayList<>();
        String stmt="select * from Supplier";
        try {
            rs=DBAccessUtility.dbExecuteQuery(stmt);
            while(rs.next()){
                Supplier supplier = new Supplier();
                supplier.setId(rs.getLong("id"));
                supplier.setFirmName(rs.getString("firmname"));
                supplier.setOwnerName(rs.getString("ownerName"));
                supplier.setAddress(rs.getString("address"));
                supplier.setContact1(rs.getString("contact1"));
                supplier.setContact2(rs.getString("contact2"));
                supplier.setContact3(rs.getString("contact3"));
                supplier.setContact4(rs.getString("contact4"));
                supplier.setPanNo(rs.getString("PANno"));
                supplier.setGstin(rs.getString("gstNo"));
                supplier.setState(rs.getString("state"));
                supplier.setStateCode(rs.getString("statecode"));
                supplier.setBankName(rs.getString("bankname"));
                supplier.setBankBranch(rs.getString("bankbranch"));
                supplier.setAccNo(rs.getString("accno"));
                supplier.setIfsc(rs.getString("ifsc"));
                supplier.setEmail(rs.getString("email"));
                supplier.setOpenBalance(rs.getDouble("openingBalance"));
                supplier.setCreditDebit(rs.getString("credit_debit"));
                supplier.setCompanyCode(rs.getString("companycode"));
                supplierList.add(supplier);
            }
        } catch (SQLException ex) {
            Logger.getLogger(supplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(supplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return supplierList;
    }
    
    public boolean updateSupplier(Supplier supplier){
        boolean result=false;
        String stmt="update supplier set firmName='"+supplier.getFirmName()+"',ownerName='"+supplier.getOwnerName()+"',address='"+supplier.getAddress()+"',gstNo='"+supplier.getGstin()+
                "',state"+supplier.getState()+"',statecode='"+supplier.getStateCode()+"',panNo='"+supplier.getPanNo()+"',contact1="+supplier.getContact1()+"',contact2='"+supplier.getContact2()+
                "',contact3='"+supplier.getContact3()+"',contact4='"+supplier.getContact4()+"'BankName='"+supplier.getBankName()+"',ifsc='"+supplier.getIfsc()+
                "',AccNo='"+supplier.getAccNo()+"',bankBranch='"+supplier.getBankBranch()+"',email='"+supplier.getEmail()+"',openingBalance="+supplier.getOpenBalance()+",credit_debit='"+supplier.getCreditDebit()+
                "',companyCode='"+supplier.getCompanyCode()+"' where id="+supplier.getId()+"";
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
