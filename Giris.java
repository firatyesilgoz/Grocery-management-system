

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Firat
 */
public class Giris extends javax.swing.JFrame {

    /**
     * Creates new form Giris
     */
    Object[] dugme ={"Tamam"};
    public Giris() {
        initComponents();
        Connect();
        setIconImage();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void Connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/manawotmsyn","root","");
            
            //try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/manawotmsyn", "root", "")) {
            // use con here
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(anapr.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) { 
            Logger.getLogger(anapr.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        kullaniciadi = new javax.swing.JTextField();
        giris = new javax.swing.JButton();
        cikis = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sifre = new javax.swing.JPasswordField();
        cikis1 = new javax.swing.JButton();
        cikis2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(74, 31, 41));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vegetables-155616_640.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("MANAV MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(186, 79, 84));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kullaniciadi.setBackground(new java.awt.Color(186, 79, 84));
        kullaniciadi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kullaniciadi.setForeground(new java.awt.Color(204, 204, 204));
        kullaniciadi.setText("KullanıcıAdı");
        kullaniciadi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        kullaniciadi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kullaniciadiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kullaniciadiFocusLost(evt);
            }
        });
        kullaniciadi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullaniciadiMouseClicked(evt);
            }
        });
        kullaniciadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciadiActionPerformed(evt);
            }
        });
        kullaniciadi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kullaniciadiKeyPressed(evt);
            }
        });
        jPanel3.add(kullaniciadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 130, -1));

        giris.setBackground(new java.awt.Color(186, 79, 84));
        giris.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        giris.setForeground(new java.awt.Color(204, 204, 204));
        giris.setText("Giriş");
        giris.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisActionPerformed(evt);
            }
        });
        jPanel3.add(giris, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 60, 30));

        cikis.setBackground(new java.awt.Color(186, 79, 84));
        cikis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cikis.setForeground(new java.awt.Color(204, 204, 204));
        cikis.setText("Çıkış");
        cikis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikisMouseClicked(evt);
            }
        });
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });
        jPanel3.add(cikis, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 60, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 130, 50));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 130, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/47.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/37.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 50, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/01.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 90, 80));

        sifre.setBackground(new java.awt.Color(186, 79, 84));
        sifre.setForeground(new java.awt.Color(204, 204, 204));
        sifre.setText("Şifre");
        sifre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        sifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreActionPerformed(evt);
            }
        });
        jPanel3.add(sifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 130, 20));

        cikis1.setBackground(new java.awt.Color(186, 79, 84));
        cikis1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cikis1.setForeground(new java.awt.Color(204, 204, 204));
        cikis1.setText("Temizle");
        cikis1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cikis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikis1MouseClicked(evt);
            }
        });
        cikis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis1ActionPerformed(evt);
            }
        });
        jPanel3.add(cikis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 60, 30));

        cikis2.setBackground(new java.awt.Color(186, 79, 84));
        cikis2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cikis2.setForeground(new java.awt.Color(204, 204, 204));
        cikis2.setText("Yeni Kayıt ?");
        cikis2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cikis2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikis2MouseClicked(evt);
            }
        });
        cikis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis2ActionPerformed(evt);
            }
        });
        jPanel3.add(cikis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 120, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cikisActionPerformed

    private void cikisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikisMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cikisMouseClicked

    private void girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisActionPerformed
        // TODO add your handling code here:
        
        try{
            String kullanicia=kullaniciadi.getText();
            String sifree=sifre.getText().toString();
            String sql="SELECT * FROM `kayit` where kad=? and ksifre=?";
            pst=(PreparedStatement) con.prepareStatement(sql);
            pst.setString(1,kullanicia);
            pst.setString(2,sifree);
            rs=pst.executeQuery();
            if(kullanicia.equals("")){
                JOptionPane.showOptionDialog(rootPane, "Kullanıcı adı alanı boş girilemez.", "Boş", WIDTH, WIDTH, null, dugme, rootPane);
            return;
            }
            if(sifree.equals("")){
                   JOptionPane.showOptionDialog(rootPane, "Sifre alanı boş girilemez.", "Boş", WIDTH, WIDTH, null, dugme, rootPane);
            return;
        }
            if(rs.next()==true){
                JOptionPane.showMessageDialog(null,"Giriş tamamlandı");
                this.setVisible(false); //giris ekranını gizle
                anapr a = new anapr(); //anapanel jframe nesne tanımla
                a.setVisible(true);// anapanel i göster
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Giriş Yanlışş");
                kullaniciadi.setText("");
                sifre.setText("");
            }
            
            
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null ,e  );
                }
        
        
        
        
        
        /**String kullanici=kullaniciadi.getText();
        String sifree=sifre.getText().toString();
        
        if(kullanici.trim().equals("")){
                JOptionPane.showOptionDialog(rootPane, "Kullanıcı adı alanı boş girilemez.", "Boş", WIDTH, WIDTH, null, dugme, rootPane);
        return;
        }
        if(sifree.trim().equals("")){
               JOptionPane.showOptionDialog(rootPane, "Sifre alanı boş girilemez.", "Boş", WIDTH, WIDTH, null, dugme, rootPane);
        return;
        }
        if(kullanici.equals("fırat") && sifree.equals("1234")){
            JOptionPane.showOptionDialog(rootPane, "Kullanıcı adı ve parolası doğrulandı.", "Girişiniz Onaylandı", WIDTH, WIDTH, null, dugme, rootPane);
            this.setVisible(false); //giris ekranını gizle
            anapr a = new anapr(); //anapanel jframe nesne tanımla
            a.setVisible(true);// anapanel i göster
        }else{
        JOptionPane.showOptionDialog(rootPane, "Kullanıcı adı ve parolası yanlış.", "Girişiniz Onaylanamadı", WIDTH, WIDTH, null, dugme, rootPane);
        }
        */
        
    }//GEN-LAST:event_girisActionPerformed
                                      

    private void kullaniciadiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kullaniciadiFocusLost
        
        
        String kullaniciadi1=kullaniciadi.getText().trim().toLowerCase();
        
        if(kullaniciadi1.equals("KullanıcıAdı")||kullaniciadi1.equals("")){
            kullaniciadi.setText("KullanıcıAdı");
            kullaniciadi.setForeground(new Color(153,153,153));
        }
         
    }//GEN-LAST:event_kullaniciadiFocusLost
    
    private void kullaniciadiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kullaniciadiFocusGained
         
    }//GEN-LAST:event_kullaniciadiFocusGained
    
    private void kullaniciadiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullaniciadiMouseClicked
        String kullaniciadi1=kullaniciadi.getText().trim().toLowerCase();

            if(kullaniciadi1.equals("KullanıcıAdı")){
                kullaniciadi.setText("");
                kullaniciadi.setForeground(Color.black);
            }
    }//GEN-LAST:event_kullaniciadiMouseClicked

    private void cikis1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikis1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cikis1MouseClicked

    private void cikis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis1ActionPerformed
        // TODO add your handling code here:
        kullaniciadi.setText("");
        sifre.setText("");
    }//GEN-LAST:event_cikis1ActionPerformed

    private void kullaniciadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullaniciadiActionPerformed

    private void sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifreActionPerformed

    private void cikis2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikis2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cikis2MouseClicked

    private void cikis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis2ActionPerformed
            kkayit a = new kkayit(); //anapanel jframe nesne tanımla
            a.setVisible(true);        
    }//GEN-LAST:event_cikis2ActionPerformed

    private void kullaniciadiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kullaniciadiKeyPressed
        // TODO add your handling code here:
        String kullaniciadi1=kullaniciadi.getText().trim().toLowerCase();
        
        if(kullaniciadi1.equals("KullanıcıAdı")||kullaniciadi1.equals("")){
            kullaniciadi.setText("");
            kullaniciadi.setForeground(new Color(153,153,153));
        }
         
    }//GEN-LAST:event_kullaniciadiKeyPressed
    
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
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikis;
    private javax.swing.JButton cikis1;
    private javax.swing.JButton cikis2;
    private javax.swing.JButton giris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField kullaniciadi;
    private javax.swing.JPasswordField sifre;
    // End of variables declaration//GEN-END:variables
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons8-apple-94.png")));
    }
}
