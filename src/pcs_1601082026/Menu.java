/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs_1601082026;

import laporan.FormLaporanAnggota;
import laporan.FormLaporanAnggotaJekel;
import laporan.FormLaporanBuku;
import laporan.FormLaporanPeminjamanAnggota;
import laporan.FormLaporanPeminjaman_perbulan;

/**
 *
 * @author LABP2KOMP14
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        submenuanggota = new javax.swing.JMenuItem();
        submenubuku = new javax.swing.JMenuItem();
        menutransaksi = new javax.swing.JMenu();
        submenupeminjaman = new javax.swing.JMenuItem();
        submenupengembalian = new javax.swing.JMenuItem();
        menulaporan = new javax.swing.JMenu();
        submenulaporananggota = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        peminjamanPerBulan = new javax.swing.JMenuItem();
        Peminjaman = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        menuFile.setText("File");

        submenuanggota.setText("Anggota");
        menuFile.add(submenuanggota);

        submenubuku.setText("jMenuItem1");
        menuFile.add(submenubuku);

        jMenuBar1.add(menuFile);

        menutransaksi.setText("Transaksi");

        submenupeminjaman.setText("Peminjaman");
        menutransaksi.add(submenupeminjaman);

        submenupengembalian.setText("Pengembalian");
        menutransaksi.add(submenupengembalian);

        jMenuBar1.add(menutransaksi);

        menulaporan.setText("Laporan");

        submenulaporananggota.setText("Anggota");
        submenulaporananggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenulaporananggotaActionPerformed(evt);
            }
        });
        menulaporan.add(submenulaporananggota);

        jMenuItem1.setText("Anggota Per Jenis Kelamin");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menulaporan.add(jMenuItem1);

        jMenuItem2.setText("Buku");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menulaporan.add(jMenuItem2);

        jMenuItem3.setText("Buku Per Tahun Terbit");
        menulaporan.add(jMenuItem3);

        jMenuItem4.setText("Peminjaman Per Anggota");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menulaporan.add(jMenuItem4);

        peminjamanPerBulan.setText("PeminjamanPerBulan");
        peminjamanPerBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peminjamanPerBulanActionPerformed(evt);
            }
        });
        menulaporan.add(peminjamanPerBulan);
        menulaporan.add(Peminjaman);

        jMenuBar1.add(menulaporan);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submenulaporananggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenulaporananggotaActionPerformed
        // TODO add your handling code here:
        FormLaporanAnggota f = new FormLaporanAnggota();
        f.setVisible(true);
        jDesktopPane1.add(f);
    }//GEN-LAST:event_submenulaporananggotaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         FormLaporanAnggotaJekel f = new FormLaporanAnggotaJekel();
        f.setVisible(true);
        jDesktopPane1.add(f);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void peminjamanPerBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peminjamanPerBulanActionPerformed
        // TODO add your handling code here:
        FormLaporanPeminjaman_perbulan f = new FormLaporanPeminjaman_perbulan();
        f.setVisible(true);
        jDesktopPane1.add(f);
    }//GEN-LAST:event_peminjamanPerBulanActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        FormLaporanPeminjamanAnggota f = new FormLaporanPeminjamanAnggota();
        f.setVisible(true);
        jDesktopPane1.add(f);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        FormLaporanBuku f = new FormLaporanBuku();
        f.setVisible(true);
        jDesktopPane1.add(f);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Peminjaman;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menulaporan;
    private javax.swing.JMenu menutransaksi;
    private javax.swing.JMenuItem peminjamanPerBulan;
    private javax.swing.JMenuItem submenuanggota;
    private javax.swing.JMenuItem submenubuku;
    private javax.swing.JMenuItem submenulaporananggota;
    private javax.swing.JMenuItem submenupeminjaman;
    private javax.swing.JMenuItem submenupengembalian;
    // End of variables declaration//GEN-END:variables
}
