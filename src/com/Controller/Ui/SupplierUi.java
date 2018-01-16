/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller.Ui;

import com.DataAccessObject.supplierDAO;
import com.model.Item;
import com.model.Supplier;
import java.awt.Component;
import java.util.List;
import java.util.ListIterator;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author W10
 */
public class SupplierUi extends javax.swing.JInternalFrame {
     
    DefaultTableModel supplierModel;
    
    
    supplierDAO supplierDAO= new supplierDAO();
    /**
     * Creates new form SupplierUi
     */
    public SupplierUi() {
        initComponents();
        groupButoon();
        DisplayData(supplierDAO.showSupplier());
        creditBtn.setSelected(true);
        del_btn.setVisible(false);
        Update_btn.setVisible(false);
        cancel_btn.setVisible(false);
        
    }
    
    private void DisplayData(List<Supplier>supplierList) {
    supplierModel = new DefaultTableModel() {
    //setting the jtable read only

    @Override
    public boolean isCellEditable(int row, int column) {
          return false;
    }
   };
   //setting the column name
   Object[] supplierColumnNames = new Object[19];
   supplierColumnNames[0] = "ID";
   supplierColumnNames[1] = "FirmName";
   supplierColumnNames[2] = "OwnerName";
   supplierColumnNames[3] = "Address";
   supplierColumnNames[4] = "GSTIN";
   supplierColumnNames[5] = "State";
   supplierColumnNames[6] = "StateCode";
   
   supplierColumnNames[7] = "PAN";
   supplierColumnNames[8] = "Contact1";
   supplierColumnNames[9] = "Contact2";
   supplierColumnNames[10] = "Contact3";
   supplierColumnNames[11] = "Contact4";
   supplierColumnNames[12] = "BankName";
   supplierColumnNames[13] = "IFSC";
   supplierColumnNames[14] = "Acc No";
   supplierColumnNames[15] = "Branch";
   supplierColumnNames[16] = "Opening Bal";
   supplierColumnNames[17] = "Credit/Debit";
   supplierColumnNames[18] = "Company Code";

   supplierModel.setColumnIdentifiers(supplierColumnNames);
   if (supplierList == null) {
   this.supplierTable.setModel(supplierModel);
   return;
   }

   Object[] objects = new Object[19];
   ListIterator<Supplier> supplierItr = supplierList.listIterator();
   //populating the tablemodel
   while (supplierItr.hasNext()) {
  Supplier i = supplierItr.next();
  objects[0] = i.getId();
  objects[1] = i.getFirmName();
  objects[2] = i.getOwnerName();
  objects[3] = i.getAddress();
  objects[4] = i.getGstin();
  objects[5] = i.getState();
  objects[6] = i.getStateCode();
  objects[7] = i.getPanNo();
  objects[8] = i.getContact1();
  objects[9] = i.getContact2();
  objects[10] = i.getContact3();
  objects[11] = i.getContact4();
  objects[12] = i.getBankName();
  objects[13] = i.getIfsc();
  objects[14] = i.getAccNo();
  objects[15] = i.getBankBranch();
  objects[16] = i.getOpenBalance();
  objects[17] = i.getCreditDebit();
  objects[18] = i.getCompanyCode();
  
  supplierModel.addRow(objects);
  }
  //binding the jtable to the model
  this.supplierTable.setModel(supplierModel);
  
}
     public static int okcancel(String theMessage) {
     int result = JOptionPane.showConfirmDialog((Component) null, theMessage,
        "alert", JOptionPane.OK_CANCEL_OPTION);
    return result;
    }
     
     private void filter(String query){
      TableRowSorter<DefaultTableModel> rowSorter
            = new TableRowSorter<>(supplierModel);
       supplierTable.setRowSorter(rowSorter);
        
        rowSorter.setRowFilter(RowFilter.regexFilter(query));
            
    }
    public boolean validateSupplier(){
       if(firmTxt.getText()==null||firmTxt.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Please enter firm Name");
           return false;
       } 
       if(ownerTxt.getText()==null||firmTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter owner Name");
           
           return false;
       }
       if(addressTxt.getText()==null||addressTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter address");
           return false;
       }
       
       if(gstTxt.getText()!=null){
           if(gstTxt.getText().length()>15){
            JOptionPane.showMessageDialog(null,"Please enter correct 15 digit GSTIN");
           return false;
           }
       }
       
      if(panTxt.getText()==null||panTxt.getText().equals("'")){
          JOptionPane.showMessageDialog(null,"Please enter PAN No");
          return false;
      }
       
      if(openBalTxt.getText()==null||openBalTxt.getText().equals("")){
          JOptionPane.showMessageDialog(null,"Please enter opening Balance");
          return false;
      }
      if(!openBalTxt.getText().matches("^[0-9]*\\.?[0-9]*$")){
         JOptionPane.showMessageDialog(null,"Opening Balance must be 0 or greater than 0");
         return false;
      }
      if(comCodeTxt.getText()==null||comCodeTxt.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Please enter Company Code");
          return false;
      }
      
       
        return true;
    }
    
    private void groupButoon(){
        ButtonGroup bg= new ButtonGroup();
        bg.add(creditBtn);
        bg.add(debitBtn);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        stateCombo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        firmTxt = new javax.swing.JTextField();
        ownerTxt = new javax.swing.JTextField();
        gstTxt = new javax.swing.JTextField();
        stateCodeTxt = new javax.swing.JTextField();
        panTxt = new javax.swing.JTextField();
        con1Txt = new javax.swing.JTextField();
        con2Txt = new javax.swing.JTextField();
        con3Txt = new javax.swing.JTextField();
        con4Txt = new javax.swing.JTextField();
        ifscTxt = new javax.swing.JTextField();
        bankTxt = new javax.swing.JTextField();
        branchTxt = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        openBalTxt = new javax.swing.JTextField();
        creditBtn = new javax.swing.JRadioButton();
        debitBtn = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        comCodeTxt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        Update_btn = new javax.swing.JButton();
        del_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        accNoTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Supplier Creation"));

        jLabel1.setText("Firm Name");

        jLabel2.setText("Owner Name");

        jLabel3.setText("Address");

        jLabel4.setText("Gst No");

        jLabel5.setText("State");

        jLabel6.setText("State Code");

        jLabel7.setText("Pan No");

        jLabel8.setText("Contact No 1");

        jLabel9.setText("Contact No 2");

        jLabel10.setText("Contact No 3");

        jLabel11.setText("Contact No 4");

        jLabel12.setText("                                             Bank Details");

        stateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboActionPerformed(evt);
            }
        });

        jLabel13.setText("Bank Name");

        jLabel14.setText("IFSC Code");

        jLabel15.setText("A/C No");

        jLabel16.setText("Branch");

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });

        firmTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmTxtActionPerformed(evt);
            }
        });

        ownerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerTxtActionPerformed(evt);
            }
        });

        gstTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gstTxtActionPerformed(evt);
            }
        });

        con3Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con3TxtActionPerformed(evt);
            }
        });

        bankTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankTxtActionPerformed(evt);
            }
        });

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jLabel17.setText("Opening Balance");

        openBalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBalTxtActionPerformed(evt);
            }
        });

        creditBtn.setText("Credit");

        debitBtn.setText("Debit");

        jLabel18.setText("Company Code");

        jLabel19.setText("Search Supplier");

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        Update_btn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Update_btn.setText("Update");
        Update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_btnActionPerformed(evt);
            }
        });

        del_btn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        del_btn.setText("Delete");
        del_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_btnActionPerformed(evt);
            }
        });

        cancel_btn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        accNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accNoTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(10, 10, 10)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(firmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addComponent(ownerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(45, 45, 45)
                        .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(52, 52, 52)
                        .addComponent(gstTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(58, 58, 58)
                        .addComponent(stateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addComponent(stateCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(50, 50, 50)
                        .addComponent(panTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(con1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(con2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(con3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(con4Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(del_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(Update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(comCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(6, 6, 6)
                            .addComponent(creditBtn)
                            .addGap(2, 2, 2)
                            .addComponent(debitBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(openBalTxt))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16))
                            .addGap(35, 35, 35)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(branchTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                .addComponent(accNoTxt))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ifscTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(33, 33, 33)
                            .addComponent(bankTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(firmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ownerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(gstTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(stateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(stateCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(panTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(con1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(con2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(con3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11))
                    .addComponent(con4Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13))
                    .addComponent(bankTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(ifscTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(accNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(branchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel17))
                    .addComponent(creditBtn)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(debitBtn)
                        .addComponent(openBalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel18))
                    .addComponent(comCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitBtn)
                    .addComponent(clearBtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(del_btn)
                            .addComponent(cancel_btn)
                            .addComponent(Update_btn))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(supplierTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openBalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBalTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openBalTxtActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:

        if(!validateSupplier()){
            return;
        }

        Supplier supplier= new Supplier();
        supplier.setFirmName(firmTxt.getText());
        supplier.setOwnerName(ownerTxt.getText());
        supplier.setAddress(addressTxt.getText());
        supplier.setGstin(gstTxt.getText());
        supplier.setState((String)stateCombo.getSelectedItem());
        supplier.setStateCode(stateCodeTxt.getText());
        supplier.setPanNo(panTxt.getText());
        supplier.setContact1(con1Txt.getText());
        supplier.setContact2(con2Txt.getText());
        supplier.setContact3(con3Txt.getText());
        supplier.setContact4(con4Txt.getText());
        supplier.setBankName(bankTxt.getText());
        supplier.setIfsc(ifscTxt.getText());
        supplier.setAccNo(accNoTxt.getText());
        supplier.setBankBranch(branchTxt.getText());
        supplier.setOpenBalance(Double.parseDouble(openBalTxt.getText()));
        if(creditBtn.isSelected()){
            supplier.setCreditDebit(creditBtn.getText());
        }else{
            supplier.setCreditDebit(debitBtn.getText());
        }
        supplier.setCompanyCode(comCodeTxt.getText());
        supplierDAO.createSupplier(supplier);
        
    }//GEN-LAST:event_submitBtnActionPerformed

    private void accNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accNoTxtActionPerformed

    private void bankTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankTxtActionPerformed

    private void con3TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con3TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_con3TxtActionPerformed

    private void gstTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gstTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gstTxtActionPerformed

    private void ownerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ownerTxtActionPerformed

    private void firmTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firmTxtActionPerformed

    private void stateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateComboActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_addressTxtActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void Update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_btnActionPerformed
//      supplier.setId(Long.parseLong(search_TextField.getText()));
        Supplier  supplier= new Supplier();
       supplier.setFirmName(firmTxt.getText());
       supplier.setOwnerName(ownerTxt.getText());
        supplier.setAddress(addressTxt.getText());
        supplier.setGstin(gstTxt.getText());
        supplier.setState((String)stateCombo.getSelectedItem());
        supplier.setStateCode(stateCodeTxt.getText());
        supplier.setPanNo(panTxt.getText());
        supplier.setContact1(con1Txt.getText());
        supplier.setContact2(con2Txt.getText());
        supplier.setContact3(con3Txt.getText());
        supplier.setContact4(con4Txt.getText());
        supplier.setBankName(bankTxt.getText());
        supplier.setIfsc(ifscTxt.getText());
        supplier.setAccNo(accNoTxt.getText());
        supplier.setBankBranch(branchTxt.getText());
        supplier.setOpenBalance(Double.parseDouble(openBalTxt.getText()));
        if(creditBtn.isSelected()){
            supplier.setCreditDebit(creditBtn.getText());
        }else{
            supplier.setCreditDebit(debitBtn.getText());
        }
        supplier.setCompanyCode(comCodeTxt.getText());
    
       
//        int i = okcancel("Are your sure ?");
//        System.out.println("ret : " + i);
//        if(i==0){
                supplierDAO.updateSupplier(supplier);
            DisplayData(supplierDAO.showSupplier());
//        }

    }//GEN-LAST:event_Update_btnActionPerformed

    private void del_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btnActionPerformed
//        int i = okcancel("Are your sure ?");
//        System.out.println("ret : " + i);
//        if(i==0){
//            boolean delfalg=itemdao.deleteItem(search_TextField.getText());
//            if(delfalg==true){
//                DisplayData(itemdao.showProduct());
////                clear();
//            }
//        }
    }//GEN-LAST:event_del_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        Update_btn.setVisible(false);
        cancel_btn.setVisible(false);
        del_btn.setVisible(false);
        submitBtn.setVisible(true);
        clearBtn.setVisible(true);
//        clear();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        // TODO add your handling code here:
        String query=searchTextField.getText().toLowerCase();
        filter(query);
    }//GEN-LAST:event_searchTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update_btn;
    private javax.swing.JTextField accNoTxt;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField bankTxt;
    private javax.swing.JTextField branchTxt;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField comCodeTxt;
    private javax.swing.JTextField con1Txt;
    private javax.swing.JTextField con2Txt;
    private javax.swing.JTextField con3Txt;
    private javax.swing.JTextField con4Txt;
    private javax.swing.JRadioButton creditBtn;
    private javax.swing.JRadioButton debitBtn;
    private javax.swing.JButton del_btn;
    private javax.swing.JTextField firmTxt;
    private javax.swing.JTextField gstTxt;
    private javax.swing.JTextField ifscTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField openBalTxt;
    private javax.swing.JTextField ownerTxt;
    private javax.swing.JTextField panTxt;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTextField stateCodeTxt;
    private javax.swing.JComboBox<String> stateCombo;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTable supplierTable;
    // End of variables declaration//GEN-END:variables
}
