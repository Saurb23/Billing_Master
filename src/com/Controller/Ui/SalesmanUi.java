/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller.Ui;

import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author W10
 */
public class SalesmanUi extends javax.swing.JInternalFrame {

    /**
     * Creates new form SalesmanUi
     */
    public SalesmanUi() {
        initComponents();
    }
    
    public boolean validateSalesMan(){
        if(salesNameTxt.getText()==null|salesNameTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter salesMan Name");
            return false;
        }
        if(addressTxt.getText()==null||addressTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter address");
            return false;
        }
        if(contactTxt.getText()==null||contactTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter address");
            return false;
        }
        if(idProofTxt.getText()==null||idProofTxt.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Please select ID Proof");
            return false;
        }
        if(idNoTxt.getText()==null||idNoTxt.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Please enter ID Number");
            return false;
        }
        if(designationTxt.getText()==null||designationTxt.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Please enter desgination");
            return false;
        }
        if(backHandTxt.getText()==null||!(backHandTxt.getText().matches("^[0-9]*\\.?[0-9]*$"))){
              JOptionPane.showMessageDialog(null, "Please enter correct backhand amount");
            return false;
        }
        
        if(openingBalTxt.getText()==null||openingBalTxt.getText().equals("")){
          JOptionPane.showMessageDialog(null,"Please enter opening Balance");
          return false;
      }
      if(!openingBalTxt.getText().matches("^[0-9]*\\.?[0-9]*$")){
         JOptionPane.showMessageDialog(null,"Opening Balance must be 0 or greater than 0");
         return false;
      }
      if(joiningDatePicker.getDate()==null){
           JOptionPane.showMessageDialog(null,"Please enter Joining Date");
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
        jLabel1 = new javax.swing.JLabel();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        salesNameTxt = new javax.swing.JTextField();
        idProofTxt = new javax.swing.JTextField();
        idNoTxt = new javax.swing.JTextField();
        designationTxt = new javax.swing.JTextField();
        contactTxt = new javax.swing.JTextField();
        accNoTxt = new javax.swing.JTextField();
        brnchTxt = new javax.swing.JTextField();
        backHandTxt = new javax.swing.JTextField();
        openingBalTxt = new javax.swing.JTextField();
        ifscTxt = new javax.swing.JTextField();
        bankTxt = new javax.swing.JTextField();
        photoTxt = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        browseBtn = new javax.swing.JButton();
        joiningDatePicker = new org.jdesktop.swingx.JXDatePicker();
        showImgLbl = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Salesman Creation"));

        jLabel1.setText("Name");

        jLabel3.setText("Address");

        jLabel4.setText("Id Proof");

        jLabel5.setText("Designation");

        jLabel6.setText("ID No");

        jLabel7.setText("BackHand");

        jLabel8.setText("Contact No ");

        jLabel9.setText("Joining Date");

        jLabel10.setText("Openning Balance");

        jLabel11.setText("Photo");

        jLabel12.setText("                                                                       Bank Details");

        jLabel13.setText("Bank Name");

        jLabel14.setText("IFSC Code");

        jLabel15.setText("A/C No");

        jLabel16.setText("Branch");

        salesNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesNameTxtActionPerformed(evt);
            }
        });

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        browseBtn.setText("Browse");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        joiningDatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joiningDatePickerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(Submit)
                                        .addGap(87, 87, 87)
                                        .addComponent(Clear))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(342, 342, 342)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(joiningDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(addressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                .addComponent(contactTxt)
                                                .addComponent(idProofTxt)
                                                .addComponent(idNoTxt)
                                                .addComponent(designationTxt)
                                                .addComponent(bankTxt)
                                                .addComponent(ifscTxt)
                                                .addComponent(accNoTxt)
                                                .addComponent(brnchTxt)
                                                .addComponent(backHandTxt)
                                                .addComponent(openingBalTxt)
                                                .addComponent(photoTxt)
                                                .addComponent(salesNameTxt)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(browseBtn)
                        .addGap(18, 18, 18)
                        .addComponent(showImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(360, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(salesNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idProofTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(browseBtn))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(designationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(bankTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ifscTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brnchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backHandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(openingBalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(photoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(joiningDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Submit)
                            .addComponent(Clear)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(showImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

    private void salesNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salesNameTxtActionPerformed

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser= new JFileChooser();
        chooser.showOpenDialog(null);
        File file= chooser.getSelectedFile();
       
        FileFilter imageFilter = new FileNameExtensionFilter(
        "Image Files", ImageIO.getReaderFileSuffixes());
        chooser.setFileFilter(imageFilter);
//        chooser.addChoosableFileFilter(new FileNameExtensionFilter("Image Files","jpg","png","tif","bmp"));
        
        URL url = null;
        try {
            url = file.toURI().toURL();
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(SalesmanUi.class.getName()).log(Level.SEVERE, null, ex);
        }
         String fileName =file.getAbsolutePath();
         idProofTxt.setText(fileName);
//        ImageIcon icon= new ImageIcon(url);
//        Image dimg = url.getScaledInstance(showImgLbl.getWidth(), showImgLbl.getHeight(),
//        Image.SCALE_SMOOTH);
        showImgLbl.setIcon(new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(showImgLbl.getWidth(),showImgLbl.getHeight(),Image.SCALE_SMOOTH)));
//        showImgLbl.setIcon(icon);

    }//GEN-LAST:event_browseBtnActionPerformed

    private void joiningDatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joiningDatePickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joiningDatePickerActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        
        if(!validateSalesMan()){
            return;
        }
        
    }//GEN-LAST:event_SubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField accNoTxt;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField backHandTxt;
    private javax.swing.JTextField bankTxt;
    private javax.swing.JTextField brnchTxt;
    private javax.swing.JButton browseBtn;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JTextField designationTxt;
    private javax.swing.JTextField idNoTxt;
    private javax.swing.JTextField idProofTxt;
    private javax.swing.JTextField ifscTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.swingx.JXDatePicker joiningDatePicker;
    private javax.swing.JTextField openingBalTxt;
    private javax.swing.JTextField photoTxt;
    private javax.swing.JTextField salesNameTxt;
    private javax.swing.JLabel showImgLbl;
    // End of variables declaration//GEN-END:variables
}
