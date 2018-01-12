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

/**
 *
 * @author W10
 */
public class ItemDAO {
    ResultSet rs = null;
    DBAccessUtility accDb=new DBAccessUtility();
	public boolean addProduct(Item item) throws ClassNotFoundException {
		boolean result=false;
		String stmt = "insert into itemMaster(itemName,HSN,unit,style,colors,size,group,subGroup,gst,gstgrp,sellPrice,barcode,buyPrice,openingStock) values('"+item.getItemname()+"','"+ item.getHsn() + "','"+item.getUnit()+"',"+item.getStyle()+","+item.getColor()+",'','',"+item.getSize()+","+item.getGroup()+","+item.getSubgroup()+","+item.getGstPer()+","+item.getGstgroup()+","+item.getSellingprice()+","+item.getBarcode()+","+item.getPurchaseprice()+","+item.getOpeningstock()+")";
                // DBUtil.dbConnect();
                accDb.DBAccessUtility1();
                accDb.doConnection(stmt);
                result=true;
		return result;
	}
}
