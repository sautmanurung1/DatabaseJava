/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author NITRO
 */
public class Handphone extends javax.swing.JFrame {
private DefaultTableModel DftTabMode1;
    /**
     * Creates new form Handphone
     */
    public Handphone() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMerek = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kodeBarang = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("KODE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("MEREK");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("JUMLAH");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("HARGA JUAL");

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TOKO HANDPHONE RAJAWALI");
        jLabel1.setOpaque(true);

        kodeBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        kodeBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kodeBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kodeBarang);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnTambah)
                                .addGap(22, 22, 22)
                                .addComponent(btnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btnBatal)
                                .addGap(29, 29, 29)
                                .addComponent(btnHapus)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnBatal)
                    .addComponent(btnHapus))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        if(txtKode.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nomor Masih kosong!\n" + "Silahkan diisi terlebih dahulu");
            txtKode.requestFocus();
        } else if(txtMerek.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Jurusan Masih kosong!\n" + "Silahkan diisi terlebih dahulu");
            txtMerek.requestFocus();
        } else if(txtJumlah.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nomor Masih kosong!\n" + "Silahkan diisi terlebih dahulu");
            txtJumlah.requestFocus();
        } else if(txtHarga.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nomor Masih kosong!\n" + "Silahkan diisi terlebih dahulu");
            txtHarga.requestFocus();
        } else {
            try{
                Connection Koneksi = new Koneksi().Connect();
                String sql = "insert into stock_barang(kode_hp, merek_hp, jumlah_hp, harga_hp)"
                        + "values(?,?,?,?)";
                java.sql.PreparedStatement stmt = Koneksi.prepareStatement(sql);
            try{
                stmt.setString(1,txtKode.getText());
                stmt.setString(2,txtMerek.getText());
                stmt.setString(3,txtJumlah.getText());
                stmt.setString(4,txtHarga.getText());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data berhasil disimpan!");
                //bersihkan teks
            } 
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Data Gagal disimpan ! " + "\nDengan Pesan : " + e.getMessage());
            }
            stmt.close();
            } catch(Exception e){}
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        java.sql.Connection koneksi = new Koneksi().Connect();

        String sql="update stock_barang set merek_hp = ?, jumlah_hp = ?, harga_hp = ? where kode_hp = '" 
                + txtKode.getText()+"'";
        java.sql.PreparedStatement stmt = null;
        try {
            stmt = koneksi.prepareStatement(sql);
        } catch (SQLException ex) {}

        try{
            stmt.setString(1,txtMerek.getText());
            stmt.setString(2,txtJumlah.getText());
            stmt.setString(3,txtHarga.getText());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil diubah!");
            reset();
            loadTable();
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null,"Data gagal diubah!"
                + "\nTerjadi error dengan pesan : " + se.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
         int ok=JOptionPane.showConfirmDialog(null,
                "Apakah Anda yakin?","Konfirmasi",JOptionPane.YES_NO_OPTION);

        if(ok==0){
            try{
                //panggil method koneksi
                java.sql.Connection koneksi = new Koneksi().Connect();

                String sql="delete from stock_barang where kode_hp = '" 
                        + txtKode.getText()+"'";
                java.sql.PreparedStatement stmt=koneksi.prepareStatement(sql);
                stmt.executeUpdate();
                //bersihkan teks
                JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
                reset();

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Data Gagal dihapus!"
                    + "\nDengan pesan error : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void kodeBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kodeBarangMouseClicked
        // TODO add your handling code here:
        tampilData();
    }//GEN-LAST:event_kodeBarangMouseClicked

    private void reset(){
        txtKode.setText(null);
        txtMerek.setText(null);
        txtJumlah.setText(null);
        txtHarga.setText(null);
        txtKode.requestFocus();
    }
     private void loadTable(){
        Object[] Baris = {"kode_hp","merek_hp","jumlah_hp","harga_hp"};
           DftTabMode1 = new DefaultTableModel(null, Baris);
           kodeBarang.setModel(DftTabMode1);

           //panggil method koneksi
           java.sql.Connection koneksi = new Koneksi().Connect();

           //untuk menampilkan di table
           try{
               String sql="Select * from stock_barang order by kode_hp asc";
               java.sql.Statement stmt=koneksi.createStatement();
               java.sql.ResultSet rslt=stmt.executeQuery(sql);
               while(rslt.next()){
                   String kode_hp = rslt.getString("kode_hp");
                   String merek_hp = rslt.getString("merek_hp");
                   String jumlah_hp = rslt.getString("jumlah_hp");
                   String harga_hp = rslt.getString("harga_hp");

                   String[] dataField={kode_hp, merek_hp, jumlah_hp, harga_hp};
                   DftTabMode1.addRow(dataField);
               }
           }catch(Exception ex){}
    }
     
    private void tampilData(){
    int baris = kodeBarang.getSelectedRow();
        String kode_hp = DftTabMode1.getValueAt(baris, 0).toString();
        String merek_hp = DftTabMode1.getValueAt(baris, 1).toString();
        String jumlah_hp = DftTabMode1.getValueAt(baris, 2).toString();
        String harga_hp = DftTabMode1.getValueAt(baris, 3).toString();

        txtKode.setText(kode_hp);
        txtMerek.setText(merek_hp);
        txtJumlah.setText(jumlah_hp);
        txtHarga.setText(harga_hp);
    }
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
            java.util.logging.Logger.getLogger(Handphone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Handphone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Handphone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Handphone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Handphone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable kodeBarang;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtMerek;
    // End of variables declaration//GEN-END:variables
}
