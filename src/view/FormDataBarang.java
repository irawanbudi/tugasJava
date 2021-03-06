/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DataBarangController;

/**
 *
 * @author Irawan
 */
public class FormDataBarang extends javax.swing.JInternalFrame {

    private final DataBarangController dataBarangController = new DataBarangController();
    private String[] satuan={"pcs","Kg","L","box"};

    /**
     * Creates new form FormDataBarang
     */
    public FormDataBarang() {
        initComponents();
        isiSatuanComboBox();
        setMnemoniccc();
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
        lihatButton = new javax.swing.JButton();
        kodeBarangLabel = new javax.swing.JLabel();
        kodeBarangTextField = new javax.swing.JTextField();
        namaBarangLabel = new javax.swing.JLabel();
        namaBarangTextField = new javax.swing.JTextField();
        satuanBarangLabel = new javax.swing.JLabel();
        hargaBarangLabel = new javax.swing.JLabel();
        stokbarangLabel = new javax.swing.JLabel();
        stokSpinner = new javax.swing.JSpinner();
        hargaBarangSpinner = new javax.swing.JSpinner();
        satuanComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        simpanButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        tutupButton = new javax.swing.JButton();

        setClosable(true);
        setTitle("Form Data Barang");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Barang"));

        lihatButton.setLabel("Lihat");
        lihatButton.setNextFocusableComponent(kodeBarangTextField);
        lihatButton.setPreferredSize(new java.awt.Dimension(73, 23));
        lihatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatButtonActionPerformed(evt);
            }
        });

        kodeBarangLabel.setLabelFor(kodeBarangTextField);
        kodeBarangLabel.setText("Kode barang :");

        kodeBarangTextField.setNextFocusableComponent(namaBarangTextField);

        namaBarangLabel.setLabelFor(namaBarangTextField);
        namaBarangLabel.setText("Nama barang :");

        namaBarangTextField.setNextFocusableComponent(hargaBarangSpinner);

        satuanBarangLabel.setLabelFor(satuanComboBox);
        satuanBarangLabel.setText("Satuan :");

        hargaBarangLabel.setLabelFor(hargaBarangSpinner);
        hargaBarangLabel.setText("Harga Rp:");

        stokbarangLabel.setLabelFor(stokSpinner);
        stokbarangLabel.setText("Stok:");

        hargaBarangSpinner.setModel(new javax.swing.SpinnerNumberModel(0L, 0L, null, 1L));
        hargaBarangSpinner.setNextFocusableComponent(stokSpinner);

        satuanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stokbarangLabel)
                    .addComponent(hargaBarangLabel)
                    .addComponent(kodeBarangLabel)
                    .addComponent(namaBarangLabel)
                    .addComponent(satuanBarangLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kodeBarangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lihatButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(namaBarangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stokSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaBarangSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satuanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodeBarangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lihatButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeBarangLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaBarangLabel)
                    .addComponent(namaBarangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaBarangSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaBarangLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stokSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stokbarangLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(satuanBarangLabel)
                    .addComponent(satuanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
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
        tutupButton.setNextFocusableComponent(lihatButton);
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setMnemoniccc(){
        lihatButton.setMnemonic('L');
        simpanButton.setMnemonic('S');
        hapusButton.setMnemonic('H');
        tutupButton.setMnemonic('T');
        
        kodeBarangLabel.setDisplayedMnemonic('K');
        namaBarangLabel.setDisplayedMnemonic('N');
        hargaBarangLabel.setDisplayedMnemonic('A');
        stokbarangLabel.setDisplayedMnemonic('O');
        satuanBarangLabel.setDisplayedMnemonic('U');
        
        
    }
    private void isiSatuanComboBox(){
        satuanComboBox.removeAllItems();
        for(int i=0;i<satuan.length;i++){
            satuanComboBox.addItem(satuan[i]);
        }
    }
    public String getKode() {
        return kodeBarangTextField.getText();
    }

    public void setKode(String kode) {
        kodeBarangTextField.setText(kode);
    }

    public String getNama() {
        return namaBarangTextField.getText();
    }

    public void setNama(String nama) {
        namaBarangTextField.setText(nama);
    }

    public String getSatuan() {
        return satuanComboBox.getSelectedItem().toString();
    }

    public void setSatuan(String satuan) {
        satuanComboBox.setSelectedItem(satuan);
    }

    public double getHarga() {
        return (double) hargaBarangSpinner.getValue();
    }

    public void setHarga(long harga) {
        hargaBarangSpinner.setValue(harga);
    }

    public int getStok() {
        return (int) stokSpinner.getValue();
    }

    public void setStok(int stok) {
        stokSpinner.setValue(stok);
    }

    private void tutupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutupButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tutupButtonActionPerformed

    private void lihatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatButtonActionPerformed
        // TODO add your handling code here:
        dataBarangController.tampilkanDaftar();
    }//GEN-LAST:event_lihatButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        dataBarangController.simpan(kodeBarangTextField, namaBarangTextField, hargaBarangSpinner, stokSpinner, satuanComboBox);
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        dataBarangController.hapus(kodeBarangTextField);
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
            java.util.logging.Logger.getLogger(FormDataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataBarang().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel hargaBarangLabel;
    private javax.swing.JSpinner hargaBarangSpinner;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kodeBarangLabel;
    private javax.swing.JTextField kodeBarangTextField;
    private javax.swing.JButton lihatButton;
    private javax.swing.JLabel namaBarangLabel;
    private javax.swing.JTextField namaBarangTextField;
    private javax.swing.JLabel satuanBarangLabel;
    private javax.swing.JComboBox<String> satuanComboBox;
    private javax.swing.JButton simpanButton;
    private javax.swing.JSpinner stokSpinner;
    private javax.swing.JLabel stokbarangLabel;
    private javax.swing.JButton tutupButton;
    // End of variables declaration//GEN-END:variables
}
