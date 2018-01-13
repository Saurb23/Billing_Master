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

    public Item(String Itemname, String hsn, String unit, String style, String color, String size, String group, String subgroup, String gstPer, String gstgroup, double sellingprice, String barcode, double purchaseprice, double openingstock) {
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
    long Id;
     String hsn;
    String unit;
    String style;
    String color;
    String size;
    String group;
    String subgroup;
    String gstPer;
    String gstgroup;
    double sellingprice;
    String barcode;
    double purchaseprice;
    double openingstock;

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

    public double getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(double sellingprice) {
        this.sellingprice = sellingprice;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public double getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(double purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public double getOpeningstock() {
        return openingstock;
    }

    public void setOpeningstock(double openingstock) {
        this.openingstock = openingstock;
    }
}
