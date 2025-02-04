/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.DTO_User;
import static GUI.Pnl_Qlnhanvien.tblNhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Minh
 */
public class Pnl_User extends javax.swing.JPanel {

    /**
     * Creates new form Pnl_Sanpham1
     */
    public Pnl_User() {
        initComponents();
        LoaDataCBBQuyen();
        LoadDaTaCBBNhanVien();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        pnlKhungchinh = new javax.swing.JPanel();
        pnlTacvu = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        lblTimkiem = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        pnlThongtinuser = new javax.swing.JPanel();
        lblTentk = new javax.swing.JLabel();
        lblMatkhau = new javax.swing.JLabel();
        txtTenTK = new javax.swing.JTextField();
        txtMK = new javax.swing.JTextField();
        lblQuyen = new javax.swing.JLabel();
        cbbQuyen = new javax.swing.JComboBox<>();
        lblNhanvien = new javax.swing.JLabel();
        lblGhichu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        cbbNV = new javax.swing.JComboBox<>();
        lblManv = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        pnlTable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel6.setText("Quyền");

        setBackground(new java.awt.Color(204, 204, 255));

        pnlKhungchinh.setBackground(new java.awt.Color(255, 255, 255));

        pnlTacvu.setBackground(new java.awt.Color(204, 204, 255));
        pnlTacvu.setBorder(javax.swing.BorderFactory.createTitledBorder("Tác vụ "));

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Add.png"))); // NOI18N
        btnThem.setText(" THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Edit.png"))); // NOI18N
        btnSua.setText(" SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Delete.png"))); // NOI18N
        btnXoa.setText(" XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Refresh.png"))); // NOI18N
        btnMoi.setText(" MỚI");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        lblTimkiem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTimkiem.setText("TÌM KIẾM");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlTacvuLayout = new javax.swing.GroupLayout(pnlTacvu);
        pnlTacvu.setLayout(pnlTacvuLayout);
        pnlTacvuLayout.setHorizontalGroup(
            pnlTacvuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTacvuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTacvuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTacvuLayout.setVerticalGroup(
            pnlTacvuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTacvuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTimkiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlThongtinuser.setBackground(new java.awt.Color(204, 204, 255));
        pnlThongtinuser.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin User"));

        lblTentk.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblTentk.setText("Tên tài khoản");

        lblMatkhau.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblMatkhau.setText("Mật khẩu");

        lblQuyen.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblQuyen.setText("Quyền");

        lblNhanvien.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblNhanvien.setText("Nhân viên ");

        lblGhichu.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblGhichu.setText("Ghi chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane1.setViewportView(txtGhiChu);

        cbbNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNVActionPerformed(evt);
            }
        });

        lblManv.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblManv.setText("Mã NV");

        txtMaNV.setEnabled(false);

        javax.swing.GroupLayout pnlThongtinuserLayout = new javax.swing.GroupLayout(pnlThongtinuser);
        pnlThongtinuser.setLayout(pnlThongtinuserLayout);
        pnlThongtinuserLayout.setHorizontalGroup(
            pnlThongtinuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongtinuserLayout.createSequentialGroup()
                .addGroup(pnlThongtinuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlThongtinuserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlThongtinuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblManv)
                            .addComponent(lblMatkhau)
                            .addComponent(lblNhanvien)
                            .addComponent(lblTentk))
                        .addGap(18, 18, 18)
                        .addGroup(pnlThongtinuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTenTK)
                            .addComponent(txtMK)
                            .addComponent(cbbNV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlThongtinuserLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pnlThongtinuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGhichu)
                            .addComponent(lblQuyen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlThongtinuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(cbbQuyen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlThongtinuserLayout.setVerticalGroup(
            pnlThongtinuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongtinuserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongtinuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTentk)
                    .addComponent(txtTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlThongtinuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatkhau))
                .addGap(20, 20, 20)
                .addGroup(pnlThongtinuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNhanvien))
                .addGap(20, 20, 20)
                .addGroup(pnlThongtinuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManv))
                .addGap(20, 20, 20)
                .addGroup(pnlThongtinuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuyen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(pnlThongtinuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGhichu)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlTable.setBackground(new java.awt.Color(204, 204, 255));
        pnlTable.setBorder(javax.swing.BorderFactory.createTitledBorder("  "));

        jScrollPane3.setBackground(new java.awt.Color(204, 204, 255));

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên tài khoản", "Mật khẩu", "Mã nhân viên", "Quyền", "Mô tả"
            }
        ));
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblUser);
        if (tblUser.getColumnModel().getColumnCount() > 0) {
            tblUser.getColumnModel().getColumn(0).setMinWidth(30);
            tblUser.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        javax.swing.GroupLayout pnlTableLayout = new javax.swing.GroupLayout(pnlTable);
        pnlTable.setLayout(pnlTableLayout);
        pnlTableLayout.setHorizontalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTableLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTableLayout.setVerticalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlKhungchinhLayout = new javax.swing.GroupLayout(pnlKhungchinh);
        pnlKhungchinh.setLayout(pnlKhungchinhLayout);
        pnlKhungchinhLayout.setHorizontalGroup(
            pnlKhungchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKhungchinhLayout.createSequentialGroup()
                .addComponent(pnlThongtinuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlTacvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKhungchinhLayout.setVerticalGroup(
            pnlKhungchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTacvu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlKhungchinhLayout.createSequentialGroup()
                .addComponent(pnlThongtinuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlKhungchinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlKhungchinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public static int slNV;
    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        LamMoi();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        DTO.DTO_User us = new DTO_User();
        us.setTenTK(txtTenTK.getText());
        My_CBB mb = (My_CBB) cbbQuyen.getSelectedItem();
        us.setMaQuyen((Integer.parseInt(mb.value.toString())));
        us.setMatKhau(txtMK.getText());
        us.setMoTa(txtGhiChu.getText());
        My_CBB mb1 = (My_CBB) cbbNV.getSelectedItem();
        us.setMaNV(mb1.value.toString());
        boolean kq = BLL.BLL_User.KiemTra(us);
        if (kq) {
            DAO.DAO_User.ThemUser(us);
            BLL.BLL_User.DoDuLieu(tblUser);
            LamMoi();

        }
    }//GEN-LAST:event_btnThemActionPerformed
    private void LoadDaTaCBBNhanVien() {
        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbbNV.getModel();
        cbbModel.removeAllElements();
        ResultSet rs = DAO.DAO_User.LoadCBB();
        try {
            while (rs.next()) {
                Object tenNV = rs.getString("TenNV");
                Object maNV = rs.getString("MaNV");
                My_CBB mb = new My_CBB(maNV, tenNV);
                cbbModel.addElement(mb);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu", "Thông báo");
        }
    }
    private void tblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClicked
        try {
            int vitri = tblUser.getSelectedRow();
            DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbbQuyen.getModel();
            for (int i = 0; i < cbbQuyen.getItemCount(); i++) {
                My_CBB mb = (My_CBB) cbbModel.getElementAt(i);
                String quyen = mb.text.toString();
                if (quyen.equals((tblUser.getValueAt(vitri, 4)))) {
                    cbbQuyen.setSelectedIndex(i);
                }
            }
            txtTenTK.setText(tblUser.getValueAt(vitri, 1).toString());
            txtMK.setText(tblUser.getValueAt(vitri, 2).toString());

            DefaultComboBoxModel cbbModel1 = (DefaultComboBoxModel) cbbNV.getModel();
            cbbModel1.removeAllElements();
            ResultSet rs = DAO.DAO_NhanVien.GetNhanVien_TheoMa(tblUser.getValueAt(vitri, 3).toString());
            try {
                while (rs.next()) {
                    Object tenNV = rs.getString("TenNV");
                    Object maNV = rs.getString("MaNV");
                    My_CBB mb = new My_CBB(maNV, tenNV);
                    cbbModel1.addElement(mb);
                    txtMaNV.setText(rs.getString("MaNV"));
                }
            } catch (SQLException ex) {
                ThongBao.ThongBao("Lỗi lấy dữ liệu", "Thông báo");
            }

            txtGhiChu.setText(tblUser.getValueAt(vitri, 5).toString());

            txtTenTK.setFocusable(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblUserMouseClicked
    private void LamMoi() {
        txtMK.setText("");
        txtTenTK.setText("");
        txtTenTK.setFocusable(true);
        cbbQuyen.setSelectedIndex(0);
        txtGhiChu.setText("");
        LoadDaTaCBBNhanVien();
    }
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (tblUser.getSelectedRowCount() != 1) {
            ThongBao.ThongBao("Bạn chưa chọn dòng để xóa", "Thông báo");
            return;
        } else {
            int kq = JOptionPane.showConfirmDialog(new JFrame(), "Bạn có chắc chắn muốn xóa không",
                    "Thông báo", JOptionPane.YES_NO_OPTION);
            if (kq == JOptionPane.YES_OPTION) {
                int cacdong[] = tblUser.getSelectedRows();
                for (int i = 0; i < cacdong.length; i++) {
                    String ID = tblUser.getValueAt(cacdong[i], 1).toString();
                    DAO.DAO_User.XoaUser(ID);
                }
            }
            BLL.BLL_User.DoDuLieu(tblUser);
            LamMoi();
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int sodongduocchon = tblUser.getSelectedRowCount();
        if (sodongduocchon != 1) {
            ThongBao.ThongBao("Bạn cần chọn 1 dòng để sửa", "Thông báo");
            return;
        }
        DTO.DTO_User us = new DTO_User();
        us.setTenTK(txtTenTK.getText());
        us.setMatKhau(txtMK.getText());
        My_CBB mb = (My_CBB) cbbQuyen.getSelectedItem();
        us.setMaQuyen(Integer.parseInt(mb.value.toString()));
        us.setMoTa(txtGhiChu.getText());
        boolean kq = BLL.BLL_User.KiemTraSua(us);
        if (kq) {
            ThongBao.ThongBao("Sửa thành công", "Thông báo");
            DAO.DAO_User.SuaUser(us);
            BLL.BLL_User.DoDuLieu(tblUser);
            LamMoi();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        BLL.BLL_User.DoDuLieu(tblUser, txtSearch.getText());
    }//GEN-LAST:event_txtSearchKeyReleased

    private void cbbNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNVActionPerformed
        try {
            My_CBB mb = (My_CBB) cbbNV.getSelectedItem();
            String maNV = mb.value.toString();
            txtMaNV.setText(maNV);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbbNVActionPerformed
    public void LoaDataCBBQuyen() {
        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbbQuyen.getModel();
        cbbModel.removeAllElements();
        ResultSet rs = DAO.DAO_Quyen.GetAll();
        try {
            while (rs.next()) {
                Object tenQuyen = rs.getString("TenQuyen");
                Object maQuyen = rs.getString("MaQuyen");
                My_CBB mb = new My_CBB(maQuyen, tenQuyen);
                cbbModel.addElement(mb);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu", "Thông báo");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbNV;
    private javax.swing.JComboBox<String> cbbQuyen;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblGhichu;
    private javax.swing.JLabel lblManv;
    private javax.swing.JLabel lblMatkhau;
    private javax.swing.JLabel lblNhanvien;
    private javax.swing.JLabel lblQuyen;
    private javax.swing.JLabel lblTentk;
    private javax.swing.JLabel lblTimkiem;
    private javax.swing.JPanel pnlKhungchinh;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JPanel pnlTacvu;
    private javax.swing.JPanel pnlThongtinuser;
    public static javax.swing.JTable tblUser;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenTK;
    // End of variables declaration//GEN-END:variables
}
