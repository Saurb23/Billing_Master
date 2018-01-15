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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author W10
 */
public class ItemDAO {
    ResultSet rs = null;
	public boolean addProduct(Item item) {
        boolean result=false;
	String stmt1 = "insert into itemMaster(itemName,HSN,unit,style,colors,size,group,subGroup,gst,gstgrp,sellPrice,barcode,buyPrice,openingStock) values('"+item.getItemname()+"','"+ item.getHsn() + "','"+item.getUnit()+"','"+item.getStyle()+"','"+item.getColor()+"','"+item.getSize()+"','"+item.getGroup()+"','"+item.getSubgroup()+"',"+item.getGstPer()+",'"+item.getGstgroup()+"',"+item.getSellingprice()+",'"+item.getBarcode()+"',"+item.getPurchaseprice()+","+item.getOpeningstock()+")";
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
        
        public boolean updateItem(Item item) {
		boolean result=false;
		String stmt ="update itemMaster set itemName='"+item.getItemname()+"',HSN='"+item.getHsn()+"',unit='"+item.getUnit()+"',style='"+item.getStyle()+"',colors='"+item.getColor()+"'"
				+",size='"+item.getSize()+"',group='"+item.getGroup()+"',subGroup='"+item.getSubgroup()+"',gst="+item.getGstPer()+",gstgrp='"+item.getGstgroup()+"',sellPrice="+item.getSellingprice()+",barcode='"+item.getBarcode()+"',buyPrice="+item.getPurchaseprice()+",openingStock="+item.getOpeningstock()+" "
				+ " where id="+item.getId()+"";
		try {
			DBAccessUtility.dbExecuteUpdate(stmt);
			result=true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {

				DBAccessUtility.dbDisconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
        }     
                public List<Item> showProduct() {
		String stmt = "select * from itemMaster";
		ArrayList<Item> itemList = new ArrayList<Item>();
		try {
			rs = DBAccessUtility.dbExecuteQuery(stmt);
			while (rs.next()) {

				Item item = new Item();
				item.setId(rs.getLong("ID"));
				item.setItemname(rs.getString("itemName"));
				item.setHsn(rs.getString("HSN"));
				item.setUnit(rs.getString("unit"));
				item.setStyle(rs.getString("style"));
				item.setColor(rs.getString("colors"));
				item.setSize(rs.getString("size"));
				item.setGroup(rs.getString("group"));
				item.setSubgroup(rs.getString("subGroup"));
				item.setGstPer(rs.getInt("gst"));
                                item.setGstgroup(rs.getString("gstgrp"));
                                item.setSellingprice(rs.getDouble("sellPrice"));
                                item.setBarcode(rs.getString("barcode"));
                                item.setPurchaseprice(rs.getDouble("buyPrice"));
                                item.setOpeningstock(rs.getDouble("openingStock"));
				itemList.add(item);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				DBAccessUtility.dbDisconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return itemList;
	}
                
                public Item getItemList(String id){
		String stmt = "select * from itemMaster where ID="+id;
		List<Item> itemList= new ArrayList<Item>();
                Item item = new Item();
		ResultSet rs=null;
		try {
			rs = DBAccessUtility.dbExecuteQuery(stmt);
			while(rs.next()){
				
				//item.setId(rs.getLong("id"));
				item.setItemname(rs.getString("itemName"));
				item.setHsn(rs.getString("HSN"));
				item.setUnit(rs.getString("unit"));
				item.setStyle(rs.getString("style"));
                                item.setColor(rs.getString("colors"));
				item.setSize(rs.getString("size"));
				item.setGroup(rs.getString("group"));
                                item.setSubgroup(rs.getString("subGroup"));
				item.setGstPer(rs.getInt("gst"));
				item.setGstgroup(rs.getString("gstgrp"));
                                item.setSellingprice(rs.getDouble("sellPrice"));
                                item.setBarcode(rs.getString("barcode"));
				item.setPurchaseprice(rs.getDouble("buyPrice"));
				item.setOpeningstock(rs.getDouble("openingStock"));
				//itemList.add(item);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				DBAccessUtility.dbDisconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return item;
		
	}
                
                public boolean deleteItem(String id) {
		boolean result=false;
		String stmt="delete from itemMaster where id="+id;
		try {
			DBAccessUtility.dbExecuteUpdate(stmt);
			result=true;

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {

				DBAccessUtility.dbDisconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
                }
}
