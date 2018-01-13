/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DataAccessObject;

import com.database.utility.DBAccessUtility;
import com.model.Item;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author W10
 */
public class ItemDAO {
	public boolean addProduct(Item item) {
        boolean result=false;
	String stmt1 = "insert into itemMaster(itemName,HSN,unit,style,colors,size,group,subGroup,gst,gstgrp,sellPrice,barcode,buyPrice,openingStock) values('"+item.getItemname()+"','"+ item.getHsn() + "','"+item.getUnit()+"','"+item.getStyle()+"','"+item.getColor()+"','"+item.getSize()+"','"+item.getGroup()+"','"+item.getSubgroup()+"','"+item.getGstPer()+"','"+item.getGstgroup()+"',"+item.getSellingprice()+",'"+item.getBarcode()+"',"+item.getPurchaseprice()+","+item.getOpeningstock()+")";
                 try {
            DBAccessUtility.dbExecuteUpdate(stmt1);
            result=true;
        } catch (SQLException ex) {
            Logger.getLogger(supplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(supplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
	}
}
