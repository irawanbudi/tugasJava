/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PenjualanController;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Irawan
 */
public class FormLaporanPenjualan extends javax.swing.JInternalFrame {

    private final PenjualanController penjualanController = new PenjualanController();

    /**
     * Creates new form FormLaporanPenjualan
     */
    public FormLaporanPenjualan() {
        initComponents();
        setMnemonic();
        aktifasi();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kodeLabel = new javax.swing.JLabel();
        tanggalLabel = new javax.swing.JLabel();
        kodeComboBox = new javax.swing.JComboBox();
        cetakButton = new javax.swing.JButton();
        tutupButton = new javax.swing.JButton();
        awalSpinner = new javax.swing.JSpinner();
        tipeComboBox = new javax.swing.JComboBox<>();
        akhirSpinner = new javax.swing.JSpinner();
        sdLabel = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Laporan Penjualan");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        kodeLabel.setLabelFor(kodeComboBox);
        kodeLabel.setText("Kode Penjualan");

        tanggalLabel.setText("Tanggal");

        kodeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        kodeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeComboBoxActionPerformed(evt);
            }
        });

        cetakButton.setText("Cetak");
        cetakButton.setNextFocusableComponent(tutupButton);
        cetakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakButtonActionPerformed(evt);
            }
        });

        tutupButton.setText("Tutup");
        tutupButton.setNextFocusableComponent(kodeComboBox);
        tutupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutupButtonActionPerformed(evt);
            }
        });

        awalSpinner.setModel(new javax.swing.SpinnerDateModel());
        awalSpinner.setEditor(new javax.swing.JSpinner.DateEditor(awalSpinner, "dd/MM/yyyy"));

        tipeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Penjualan", "Tanggal Penjualan" }));
        tipeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipeComboBoxActionPerformed(evt);
            }
        });

        akhirSpinner.setModel(new javax.swing.SpinnerDateModel());
        akhirSpinner.setEditor(new javax.swing.JSpinner.DateEditor(akhirSpinner, "dd/MM/yyyy"));

        sdLabel.setText("s/d");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kodeLabel)
                            .addComponent(tanggalLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kodeComboBox, 0, 196, Short.MAX_VALUE)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(awalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sdLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(akhirSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(tutupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tipeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(cetakButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cetakButton)
                    .addComponent(tipeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tutupButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kodeLabel)
                            .addComponent(kodeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(awalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(akhirSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sdLabel))
                            .addComponent(tanggalLabel))))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tampilkanData(Object[][] items) {

        kodeComboBox.removeAllItems();
        if ((items != null) && (items.length > 0)) {
            kodeComboBox.addItem("Semua");
            kodeComboBox.addItem(items[0][0]);
            int j = 1;

            for (int i = 2; i < items.length; i++) {
                kodeComboBox.setSelectedIndex(j);
                if (!(kodeComboBox.getSelectedItem().equals(items[i][0]))) {
                    kodeComboBox.addItem(items[i][0]);
                    j++;
                }
            }
        }
        kodeComboBox.setSelectedIndex(0);
    }

    private void setMnemonic() {
        tanggalLabel.setDisplayedMnemonic('T');
        kodeLabel.setDisplayedMnemonic('K');
        cetakButton.setMnemonic('C');
        tutupButton.setMnemonic('U');
    }

    private void aktifasi() {
        if (tipeComboBox.getSelectedIndex() == 0) {
            kodeComboBox.setEnabled(true);
            awalSpinner.setEnabled(false);
            akhirSpinner.setEnabled(false);

        } else if (tipeComboBox.getSelectedIndex() == 1) {
            kodeComboBox.setEnabled(false);
            awalSpinner.setEnabled(true);
            akhirSpinner.setEnabled(true);

        }
    }
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:

        tipeComboBox.removeAllItems();
        tipeComboBox.addItem("Kode Penjualan");
        tipeComboBox.addItem("Tanggal");

        kodeComboBox.removeAllItems();
        kodeComboBox.addItem("Semua");
        penjualanController.tampilkanDaftar();
        //setKodeComboBoxItem(items);


    }//GEN-LAST:event_formInternalFrameActivated

    private void tutupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutupButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tutupButtonActionPerformed

    private void cetakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakButtonActionPerformed
        // TODO add your handling code here:
        penjualanController.cetakLaporan(tipeComboBox, kodeComboBox, awalSpinner, akhirSpinner);
    }//GEN-LAST:event_cetakButtonActionPerformed

    private void tipeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipeComboBoxActionPerformed
        // TODO add your handling code here:
        aktifasi();
    }//GEN-LAST:event_tipeComboBoxActionPerformed

    private void kodeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeComboBoxActionPerformed
        // TODO add your handling code here:
        aktifasi();
    }//GEN-LAST:event_kodeComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner akhirSpinner;
    private javax.swing.JSpinner awalSpinner;
    private javax.swing.JButton cetakButton;
    private javax.swing.JComboBox kodeComboBox;
    private javax.swing.JLabel kodeLabel;
    private javax.swing.JLabel sdLabel;
    private javax.swing.JLabel tanggalLabel;
    private javax.swing.JComboBox<String> tipeComboBox;
    private javax.swing.JButton tutupButton;
    // End of variables declaration//GEN-END:variables
}
