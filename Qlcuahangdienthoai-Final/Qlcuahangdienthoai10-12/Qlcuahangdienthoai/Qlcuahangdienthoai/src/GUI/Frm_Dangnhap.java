/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.DBconnection;
import java.awt.Color;

/**
 *
 * @author Minh
 */
public class Frm_Dangnhap extends javax.swing.JFrame {
public static DAO.DBconnection conn= new DBconnection();
    public static String quyen;
    public static String us;
    public static String pass;
    public static String HoTen;
    public static String ChucVu;
    /**
     * Creates new form Frm_Dangnhap
     */
    public Frm_Dangnhap() {
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

        jButton2 = new javax.swing.JButton();
        pnlKhung = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        lblTaiKhoan = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        txtTenDN = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        pnlDangnhap = new javax.swing.JPanel();
        lblDangnhap = new javax.swing.JLabel();
        pnlTrangtri = new javax.swing.JPanel();
        pnlThoat = new javax.swing.JPanel();
        lblThoat = new javax.swing.JLabel();

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton2.setText("ĐĂNG NHẬP");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlKhung.setBackground(new java.awt.Color(255, 255, 255));
        pnlKhung.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/phong-vu.jpeg"))); // NOI18N

        lblTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTaiKhoan.setText("TÀI KHOẢN");

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMatKhau.setText("MẬT KHẨU");

        txtTenDN.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtTenDN.setText("admin");

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtMatKhau.setText("admin");

        pnlDangnhap.setBackground(new java.awt.Color(41, 22, 112));
        pnlDangnhap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDangnhap.setBackground(new java.awt.Color(255, 255, 255));
        lblDangnhap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDangnhap.setForeground(new java.awt.Color(255, 255, 255));
        lblDangnhap.setText("  ĐĂNG NHẬP");
        lblDangnhap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDangnhap.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblDangnhapMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblDangnhapMouseMoved(evt);
            }
        });
        lblDangnhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangnhapMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDangnhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDangnhapMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlDangnhapLayout = new javax.swing.GroupLayout(pnlDangnhap);
        pnlDangnhap.setLayout(pnlDangnhapLayout);
        pnlDangnhapLayout.setHorizontalGroup(
            pnlDangnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangnhapLayout.createSequentialGroup()
                .addComponent(lblDangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlDangnhapLayout.setVerticalGroup(
            pnlDangnhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDangnhapLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlTrangtri.setBackground(new java.awt.Color(41, 22, 112));

        javax.swing.GroupLayout pnlTrangtriLayout = new javax.swing.GroupLayout(pnlTrangtri);
        pnlTrangtri.setLayout(pnlTrangtriLayout);
        pnlTrangtriLayout.setHorizontalGroup(
            pnlTrangtriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlTrangtriLayout.setVerticalGroup(
            pnlTrangtriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        pnlThoat.setBackground(new java.awt.Color(41, 22, 112));
        pnlThoat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblThoat.setBackground(new java.awt.Color(255, 255, 255));
        lblThoat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblThoat.setForeground(new java.awt.Color(255, 255, 255));
        lblThoat.setText("      THOÁT");
        lblThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblThoat.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblThoatMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblThoatMouseMoved(evt);
            }
        });
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThoatMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlThoatLayout = new javax.swing.GroupLayout(pnlThoat);
        pnlThoat.setLayout(pnlThoatLayout);
        pnlThoatLayout.setHorizontalGroup(
            pnlThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThoatLayout.createSequentialGroup()
                .addComponent(lblThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlThoatLayout.setVerticalGroup(
            pnlThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThoatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlKhungLayout = new javax.swing.GroupLayout(pnlKhung);
        pnlKhung.setLayout(pnlKhungLayout);
        pnlKhungLayout.setHorizontalGroup(
            pnlKhungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKhungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlTrangtri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlKhungLayout.createSequentialGroup()
                        .addComponent(lblImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlKhungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatKhau)
                            .addGroup(pnlKhungLayout.createSequentialGroup()
                                .addGroup(pnlKhungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTaiKhoan)
                                    .addComponent(lblMatKhau)
                                    .addGroup(pnlKhungLayout.createSequentialGroup()
                                        .addComponent(pnlDangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pnlThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTenDN))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKhungLayout.setVerticalGroup(
            pnlKhungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlKhungLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlKhungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlKhungLayout.createSequentialGroup()
                        .addComponent(lblTaiKhoan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlKhungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlKhungLayout.createSequentialGroup()
                                .addComponent(lblMatKhau)
                                .addGap(11, 11, 11)
                                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnlDangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTrangtri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlKhung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlKhung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblDangnhapMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangnhapMouseDragged

    }//GEN-LAST:event_lblDangnhapMouseDragged

    private void lblDangnhapMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangnhapMouseMoved

    }//GEN-LAST:event_lblDangnhapMouseMoved

    private void lblDangnhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangnhapMouseClicked
       String TenDN = txtTenDN.getText();
        String MatKhau = String.valueOf(txtMatKhau.getPassword());
        //Truyền thông tin qua tầng xử lí
        boolean kq = BLL.BLL_DangNhap.KiemTra(TenDN, MatKhau);
        if (kq) {
            us=TenDN;
            pass=MatKhau;
            this.dispose();
            GUI.Frm_Main frm=new Frm_Main();
            frm.setVisible(true);
        }
    }//GEN-LAST:event_lblDangnhapMouseClicked

    private void lblDangnhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangnhapMouseEntered

        pnlDangnhap.setBackground(new Color(41,22,50));
        lblDangnhap.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblDangnhapMouseEntered

    private void lblDangnhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangnhapMouseExited

       pnlDangnhap.setBackground(new Color(41,22,112));
        lblDangnhap.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblDangnhapMouseExited

    private void lblThoatMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThoatMouseDragged

    private void lblThoatMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThoatMouseMoved

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
       this.dispose();
    }//GEN-LAST:event_lblThoatMouseClicked

    private void lblThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseEntered
         pnlThoat.setBackground(new Color(41,22,50));
        lblThoat.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblThoatMouseEntered

    private void lblThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseExited
        
       pnlThoat.setBackground(new Color(41,22,112));
        lblThoat.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblThoatMouseExited
    
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
            java.util.logging.Logger.getLogger(Frm_Dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Dangnhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblDangnhap;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JPanel pnlDangnhap;
    private javax.swing.JPanel pnlKhung;
    private javax.swing.JPanel pnlThoat;
    private javax.swing.JPanel pnlTrangtri;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDN;
    // End of variables declaration//GEN-END:variables
}
