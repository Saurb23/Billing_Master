/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author W10
 */
public class Item {

    public Item(String Itemname, String hsn, String unit, String style, String color, String size, String group, String subgroup, String gstPer, String gstgroup, int sellingprice, String barcode, int purchaseprice, int openingstock) {
        this.Itemname = Itemname;
        this.hsn = hsn;
        this.unit = unit;
        this.style = style;
        this.color = color;
        this.size = size;
        this.group = group;
        this.subgroup = subgroup;
        this.gstPer = gstPer;
        this.gstgroup = gstgroup;
        this.sellingprice = sellingprice;
        this.barcode = barcode;
        this.purchaseprice = purchaseprice;
        this.openingstock = openingstock;
    }
    String Itemname;

    public Item() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getItemname() {
        return Itemname;
    }

    public void setItemname(String Itemname) {
        this.Itemname = Itemname;
    }
     String hsn;
    String unit;
    String style;
    String color;
    String size;
    String group;
    String subgroup;
    String gstPer;
    String gstgroup;
    int sellingprice;
    String barcode;
    int purchaseprice;
    int openingstock;

    public String getHsn() {
        return hsn;
    }

    public void setHsn(String hsn) {
        this.hsn = hsn;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

    public String getGstPer() {
        return gstPer;
    }

    public void setGstPer(String gstPer) {
        this.gstPer = gstPer;
    }

    public String getGstgroup() {
        return gstgroup;
    }

    public void setGstgroup(String gstgroup) {
        this.gstgroup = gstgroup;
    }

    public int getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(int sellingprice) {
        this.sellingprice = sellingprice;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(int purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public int getOpeningstock() {
        return openingstock;
    }

    public void setOpeningstock(int openingstock) {
        this.openingstock = openingstock;
    }
}
