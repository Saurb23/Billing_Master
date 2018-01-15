/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller.Ui;
import com.model.Item;
import com.DataAccessObject.ItemDAO;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author W10
 */
public class ItemsUi extends javax.swing.JInternalFrame {

    /**
     * Creates new form ItemsUi
     */
    
    Item item=new Item();
    ItemDAO itemdao=new ItemDAO();
//        String Itemname;
//        String hsn;
//        String unit;
//        String style;
//        String color;
//        String size;
//        String group;
//        String subgroup;
//        String gstPer;
//        String gstgroup;
//        int sellingprice;
//        String barcode;
//        int purchaseprice;
//        int openingstock;
        boolean VFalg=true;
    public ItemsUi() {
        initComponents();
        DisplayData(itemdao.showProduct());
        del_btn.setVisible(false);
        Update_btn.setVisible(false);
        cancel_btn.setVisible(false);
    }
    private void DisplayData(List<Item>itemList) {
    DefaultTableModel itemModel = new DefaultTableModel() {
    //setting the jtable read only

    @Override
    public boolean isCellEditable(int row, int column) {
          return false;
    }
   };
   //setting the column name
   Object[] itemColumnNames = new Object[15];
   itemColumnNames[0] = "ID";
   itemColumnNames[1] = "itemName";
   itemColumnNames[2] = "HSN";
   itemColumnNames[3] = "unit";
   itemColumnNames[4] = "style";
   itemColumnNames[5] = "colors";
   itemColumnNames[6] = "size";
   itemColumnNames[7] = "group";
   itemColumnNames[8] = "subGroup";
   itemColumnNames[9] = "gst";
   itemColumnNames[10] = "gstgrp";
   itemColumnNames[11] = "sellPrice";
   itemColumnNames[12] = "barcode";
   itemColumnNames[13] = "buyPrice";
   itemColumnNames[14] = "openingStock";
   

   itemModel.setColumnIdentifiers(itemColumnNames);
   if (itemList == null) {
   this.item_Table.setModel(itemModel);
   return;
   }

   Object[] objects = new Object[15];
   ListIterator<Item> itemItr = itemList.listIterator();
   //populating the tablemodel
   while (itemItr.hasNext()) {
  Item i = itemItr.next();
  objects[0] = i.getId();
  objects[1] = i.getItemname();
  objects[2] = i.getHsn();
  objects[3] = i.getUnit();
  objects[4] = i.getStyle();
  objects[5] = i.getColor();
  objects[6] = i.getSize();
  objects[7] = i.getGroup();
  objects[8] = i.getSubgroup();
  objects[9] = i.getGstPer();
  objects[10] = i.getGstgroup();
  objects[11] = i.getSellingprice();
  objects[12] = i.getBarcode();
  objects[13] = i.getPurchaseprice();
  objects[14] = i.getOpeningstock();
  itemModel.addRow(objects);
  }

  //binding the jtable to the model
  this.item_Table.setModel(itemModel);
}

    private void clear(){
        itemname_txt.setText("");
        hsnCode_txt.setText("");
        unit_txt.setText("");
        color_txt.setText("");
        size_txt.setText("");
        style_txt.setText("");
        group_txt.setText("");
        subgroup_txt.setText("");
        gstGroup_combobox.setSelectedIndex(0);
        search_TextField.setText("");
        barcode_txt.setText("");
        purchaseprice_txt.setText("");
        sellingPrice_txt.setText("");
        openningStock_txt.setText("");
    }
     public static int okcancel(String theMessage) {
     int result = JOptionPane.showConfirmDialog((Component) null, theMessage,
        "alert", JOptionPane.OK_CANCEL_OPTION);
    return result;
   }
     
      public boolean validateItem(){
       if(itemname_txt.getText()==null||itemname_txt.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter Customer Nane");
           return false;
       } 
       if(hsnCode_txt.getText()==null||hsnCode_txt.getText().equals("")){
           JOptionPane.showMessageDialog(this,"Please enter Address");
           
           return false;
       }
        if(unit_txt.getText()==null||unit_txt.getText().equals("")){
           JOptionPane.showMessageDialog(this,"Please enter Unit Name");
           
           return false;
       }
      
          if(gstGroup_combobox.getSelectedItem()==null||gstGroup_combobox.getSelectedItem().equals("")){
           JOptionPane.showMessageDialog(this,"Please Select GSt Group");
           
           return false;
       }
           if(gst_ComboBox.getSelectedItem()==null||gst_ComboBox.getSelectedItem().equals("")){
           JOptionPane.showMessageDialog(this,"Please enter GSt Number");
           
           return false;
       }
            if(sellingPrice_txt.getText()==null||sellingPrice_txt.getText().equals("")){
           JOptionPane.showMessageDialog(this,"Please enter Selling Price");
           
           return false;
       }
             if(purchaseprice_txt.getText()==null||purchaseprice_txt.getText().equals("")){
           JOptionPane.showMessageDialog(this,"Please enter Purchase Price");
           
           return false;
       }
          
       
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ItemName_LBL = new javax.swing.JLabel();
        hsnCode_LBL = new javax.swing.JLabel();
        unit_LBL = new javax.swing.JLabel();
        style_LBL = new javax.swing.JLabel();
        color_LBL = new javax.swing.JLabel();
        size_LBL = new javax.swing.JLabel();
        group_LBL = new javax.swing.JLabel();
        subgroup_LBL = new javax.swing.JLabel();
        gst_LBL = new javax.swing.JLabel();
        gstgroup_LBL = new javax.swing.JLabel();
        salingprice_LBL = new javax.swing.JLabel();
        barcode_LBL = new javax.swing.JLabel();
        purchaseprise_LBL = new javax.swing.JLabel();
        openningstock_LBL = new javax.swing.JLabel();
        gstGroup_combobox = new javax.swing.JComboBox<>();
        itemname_txt = new javax.swing.JTextField();
        hsnCode_txt = new javax.swing.JTextField();
        unit_txt = new javax.swing.JTextField();
        style_txt = new javax.swing.JTextField();
        size_txt = new javax.swing.JTextField();
        group_txt = new javax.swing.JTextField();
        color_txt = new javax.swing.JTextField();
        sellingPrice_txt = new javax.swing.JTextField();
        gst_ComboBox = new javax.swing.JComboBox<>();
        subgroup_txt = new javax.swing.JTextField();
        barcode_txt = new javax.swing.JTextField();
        purchaseprice_txt = new javax.swing.JTextField();
        openningStock_txt = new javax.swing.JTextField();
        Update_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        search_TextField = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        submit_btn = new javax.swing.JButton();
        del_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        item_Table = new javax.swing.JTable();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ItemName_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ItemName_LBL.setText("Item Name");
        jPanel1.add(ItemName_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        hsnCode_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        hsnCode_LBL.setText("HSN Code");
        jPanel1.add(hsnCode_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        unit_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        unit_LBL.setText("Unit");
        jPanel1.add(unit_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 48, -1));

        style_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        style_LBL.setText("Style");
        jPanel1.add(style_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 48, -1));

        color_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        color_LBL.setText("Color");
        jPanel1.add(color_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 48, -1));

        size_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        size_LBL.setText("Size");
        jPanel1.add(size_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 48, -1));

        group_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        group_LBL.setText("Group");
        jPanel1.add(group_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 48, -1));

        subgroup_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        subgroup_LBL.setText("Sub Group");
        jPanel1.add(subgroup_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        gst_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        gst_LBL.setText("Gst %");
        jPanel1.add(gst_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 50, -1));

        gstgroup_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        gstgroup_LBL.setText("Gst Group");
        jPanel1.add(gstgroup_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        salingprice_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        salingprice_LBL.setText("Salling Price ");
        jPanel1.add(salingprice_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        barcode_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        barcode_LBL.setText("Barcode ");
        jPanel1.add(barcode_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        purchaseprise_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        purchaseprise_LBL.setText("Purchase Price");
        jPanel1.add(purchaseprise_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        openningstock_LBL.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        openningstock_LBL.setText("Openning Stock");
        jPanel1.add(openningstock_LBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        gstGroup_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dfggg" }));
        jPanel1.add(gstGroup_combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 270, -1));
        jPanel1.add(itemname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 274, -1));

        hsnCode_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hsnCode_txtActionPerformed(evt);
            }
        });
        jPanel1.add(hsnCode_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 274, -1));
        jPanel1.add(unit_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 274, -1));
        jPanel1.add(style_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 274, -1));
        jPanel1.add(size_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 270, -1));
        jPanel1.add(group_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 270, -1));
        jPanel1.add(color_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 270, -1));
        jPanel1.add(sellingPrice_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 270, -1));

        gst_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "12", "18", "28" }));
        jPanel1.add(gst_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 270, -1));
        jPanel1.add(subgroup_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 270, -1));
        jPanel1.add(barcode_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 270, -1));

        purchaseprice_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseprice_txtActionPerformed(evt);
            }
        });
        jPanel1.add(purchaseprice_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 270, -1));
        jPanel1.add(openningStock_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 270, -1));

        Update_btn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Update_btn.setText("Update");
        Update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 70, -1));

        cancel_btn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });
        jPanel1.add(cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 70, -1));

        jLabel1.setText("Search Supplier");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel1.add(search_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 190, -1));

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        clear_btn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        clear_btn.setText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });
        jPanel1.add(clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 70, -1));

        submit_btn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });
        jPanel1.add(submit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 70, -1));

        del_btn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        del_btn.setText("Delete");
        del_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_btnActionPerformed(evt);
            }
        });
        jPanel1.add(del_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 70, -1));

        item_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(item_Table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hsnCode_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hsnCode_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hsnCode_txtActionPerformed

    private void purchaseprice_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseprice_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseprice_txtActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        if(!validateItem()){
            return;
        }
        int i = okcancel("Are your sure?");
        System.out.println("ret : " + i);
      if(i==0){
        try {
            SubmitItemEntry();
            DisplayData(itemdao.showProduct());
        } catch (SQLException ex) {
            Logger.getLogger(ItemsUi.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }//GEN-LAST:event_submit_btnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

         submit_btn.setVisible(false);
         clear_btn.setVisible(false);
         del_btn.setVisible(true);
         Update_btn.setVisible(true);
         cancel_btn.setVisible(true);
        // List<Item> uptlist=new ArrayList<>();
         item=itemdao.getItemList(search_TextField.getText());
        // for(Item i:uptlist){
             itemname_txt.setText(item.getItemname());
             hsnCode_txt.setText(item.getHsn());
             unit_txt.setText(item.getUnit());
             style_txt.setText(item.getStyle());
             color_txt.setText(item.getColor());
             size_txt.setText(item.getSize());
             group_txt.setText(item.getGroup());
             subgroup_txt.setText(item.getSubgroup());
             gst_ComboBox.setSelectedItem(item.getGstPer());
             gstGroup_combobox.setSelectedItem(item.getGstgroup());
             sellingPrice_txt.setText(String.valueOf(item.getSellingprice()));
             barcode_txt.setText(item.getBarcode());
             purchaseprice_txt.setText(String.valueOf(item.getPurchaseprice()));
             openningStock_txt.setText(String.valueOf(item.getOpeningstock()));      
        // }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
         Update_btn.setVisible(false);
         cancel_btn.setVisible(false);
         del_btn.setVisible(false);
         submit_btn.setVisible(true);
         clear_btn.setVisible(true);
         clear();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void Update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_btnActionPerformed
         item.setId(Long.parseLong(search_TextField.getText()));
         item.setItemname(itemname_txt.getText());
         item.setHsn(hsnCode_txt.getText());
         item.setUnit(unit_txt.getText());
         item.setStyle(style_txt.getText());
         item.setColor(color_txt.getText());
         item.setSize(size_txt.getText());
         item.setGroup(group_txt.getText());
         item.setSubgroup(subgroup_txt.getText());
         item.setGstPer(Integer.parseInt((String)gst_ComboBox.getSelectedItem()));
         item.setGstgroup((String)gstGroup_combobox.getSelectedItem());
         item.setSellingprice(Double.parseDouble(sellingPrice_txt.getText()));
         item.setBarcode(barcode_txt.getText());
         item.setPurchaseprice(Double.parseDouble(purchaseprice_txt.getText()));
         item.setOpeningstock(Double.parseDouble(openningStock_txt.getText()));
         int i = okcancel("Are your sure ?");
         System.out.println("ret : " + i);
         if(i==0){
         itemdao.updateItem(item);
         DisplayData(itemdao.showProduct());
      }
         
    }//GEN-LAST:event_Update_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
             clear() ;       
    }//GEN-LAST:event_clear_btnActionPerformed

    private void del_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btnActionPerformed
        int i = okcancel("Are your sure ?");
        System.out.println("ret : " + i);
      if(i==0){
            boolean delfalg=itemdao.deleteItem(search_TextField.getText());
        if(delfalg==true){
                DisplayData(itemdao.showProduct());
                clear();
             }
      }
    }//GEN-LAST:event_del_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ItemName_LBL;
    private javax.swing.JButton Update_btn;
    private javax.swing.JLabel barcode_LBL;
    private javax.swing.JTextField barcode_txt;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JLabel color_LBL;
    private javax.swing.JTextField color_txt;
    private javax.swing.JButton del_btn;
    private javax.swing.JLabel group_LBL;
    private javax.swing.JTextField group_txt;
    private javax.swing.JComboBox<String> gstGroup_combobox;
    private javax.swing.JComboBox<String> gst_ComboBox;
    private javax.swing.JLabel gst_LBL;
    private javax.swing.JLabel gstgroup_LBL;
    private javax.swing.JLabel hsnCode_LBL;
    private javax.swing.JTextField hsnCode_txt;
    private javax.swing.JTable item_Table;
    private javax.swing.JTextField itemname_txt;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField openningStock_txt;
    private javax.swing.JLabel openningstock_LBL;
    private javax.swing.JTextField purchaseprice_txt;
    private javax.swing.JLabel purchaseprise_LBL;
    private javax.swing.JLabel salingprice_LBL;
    private javax.swing.JTextField search_TextField;
    private javax.swing.JTextField sellingPrice_txt;
    private javax.swing.JLabel size_LBL;
    private javax.swing.JTextField size_txt;
    private javax.swing.JLabel style_LBL;
    private javax.swing.JTextField style_txt;
    private javax.swing.JLabel subgroup_LBL;
    private javax.swing.JTextField subgroup_txt;
    private javax.swing.JButton submit_btn;
    private javax.swing.JLabel unit_LBL;
    private javax.swing.JTextField unit_txt;
    // End of variables declaration//GEN-END:variables

    
    private boolean validatItemForm() {

        return VFalg;
    }
    private void SubmitItemEntry() throws SQLException {
        if(!validatItemForm()){
            return;
        }
        item.setItemname(itemname_txt.getText());
        item.setHsn(hsnCode_txt.getText());
        item.setUnit(unit_txt.getText());
        item.setStyle(style_txt.getText());
        item.setColor(color_txt.getText());
        item.setSize(size_txt.getText());
        item.setGroup(group_txt.getText());
        item.setSubgroup(subgroup_txt.getText());
        item.setGstPer(Integer.valueOf((String)gst_ComboBox.getSelectedItem()));
        item.setGstgroup((String)gstGroup_combobox.getSelectedItem());
        item.setSellingprice(Double.parseDouble(sellingPrice_txt.getText()));
        item.setBarcode(barcode_txt.getText());
        item.setPurchaseprice(Double.parseDouble(purchaseprice_txt.getText()));
        item.setOpeningstock(Double.parseDouble(openningStock_txt.getText()));
        itemdao.addProduct(item);
    

    } 
}
