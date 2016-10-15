/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DataCustomerController;

/**
 *
 * @author Irawan
 */
public class FormDataUser extends javax.swing.JInternalFrame {

    private final DataCustomerController dataCustomerController = new DataCustomerController();

    /**
     * Creates new form FormDataBarang
     */
    public FormDataUser() {
        initComponents();
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
        kodeBarangLabel = new javax.swing.JLabel();
        userIdTextField = new javax.swing.JTextField();
        namaBarangLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        simpanButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        tutupButton = new javax.swing.JButton();

        setClosable(true);
        setTitle("Form Data User");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data User"));

        kodeBarangLabel.setLabelFor(userIdTextField);
        kodeBarangLabel.setText("Username :");

        namaBarangLabel.setText("Password :");

        passwordField.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namaBarangLabel)
                    .addComponent(kodeBarangLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(passwordField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeBarangLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaBarangLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        simpanButton.setText("Simpan");
        simpanButton.setMaximumSize(new java.awt.Dimension(80, 23));
        simpanButton.setMinimumSize(new java.awt.Dimension(80, 23));
        simpanButton.setNextFocusableComponent(hapusButton);
        simpanButton.setPreferredSize(new java.awt.Dimension(80, 23));
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.setNextFocusableComponent(tutupButton);
        hapusButton.setPreferredSize(new java.awt.Dimension(80, 23));
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        tutupButton.setText("Tutup");
        tutupButton.setPreferredSize(new java.awt.Dimension(80, 23));
        tutupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutupButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(simpanButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(hapusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(tutupButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(simpanButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapusButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tutupButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getNama() {
        return userIdTextField.getText();
    }

    public void setNama(String nama) {
        userIdTextField.setText(nama);
    }

    public String getAlamat() {
        return alamatCustomerTextArea.getText();
    }

    public void setAlamat(String alamat) {
        alamatCustomerTextArea.setText(alamat);
    }

    public String getTelp() {
        return telpCustomerTextField.getText();
    }

    public void setTelp(String telp) {
        telpCustomerTextField.setText(telp);
    }

    
    private void tutupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutupButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tutupButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
dataUserController.simpan(userIdTextField, alamatCustomerTextArea, telpCustomerTextField);
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        dataCustomerController.hapus(userIdTextField);
    }//GEN-LAST:event_hapusButtonActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataUser().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapusButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kodeBarangLabel;
    private javax.swing.JLabel namaBarangLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton simpanButton;
    private javax.swing.JButton tutupButton;
    private javax.swing.JTextField userIdTextField;
    // End of variables declaration//GEN-END:variables
}
