/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.My_CBB;
import GUI.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Minh
 */
public class BLL_Phieunhap {

    public static void DoDuLieuTbSP(JTable tbl, ResultSet rs) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[5];
        try {
            while (rs.next()) {
                obj[0] = rs.getString("MaSP");
                obj[1] = rs.getString("TenSP");
                obj[2] = rs.getString("TonKho");
                obj[3] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("GiaNhap"));
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }

    public static void DoDuLieuVaoCBBNCC(JComboBox cbb, String keyword) {
        cbb.removeAllItems();
        try {
            ResultSet rs = DAO.DAO_Phieunhap.SearchNCC(keyword);

            DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbb.getModel();

            while (rs.next()) {
                My_CBB mb = new My_CBB(rs.getString("MaNCC"),
                        rs.getString("TenNCC"));
                cbbModel.addElement(mb);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Thông báo", "Lỗi truy vấn dữ liệu.");
        }
    }
        public static void DoDuLieuVaoCBBSP(JComboBox cbb, String keyword, String maloai) {
        cbb.removeAllItems();
        try {
            ResultSet rs = DAO.DAO_Phieunhap.SearchSP(keyword, maloai);

            DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbb.getModel();

            while (rs.next()) {
                My_CBB mb = new My_CBB(rs.getString("MaSP"),
                        rs.getString("TenSP"));
                cbbModel.addElement(mb);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Thông báo", "Lỗi truy vấn dữ liệu.");
        }
    }

    public static void DoDuLieucbbNCC(JComboBox cbb) {
        cbb.removeAllItems();
        ResultSet rs = DAO.DAO_Phieunhap.GetAllNCC();
        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbb.getModel();
        try {
            while (rs.next()) {
                My_CBB mb = new My_CBB(rs.getString("MaNCC"), rs.getString("TenNCC"));
                cbbModel.addElement(mb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Phieunhap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static void DoDuLieucbbSP(JComboBox cbb) {
        cbb.removeAllItems();
        ResultSet rs = DAO.DAO_Phieunhap.GetAllSP();
        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbb.getModel();
        try {
            while (rs.next()) {
                My_CBB mb = new My_CBB(rs.getString("MaSP"), rs.getString("TenSP"));
                cbbModel.addElement(mb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Phieunhap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static void DoDuLieucbbSP(JComboBox cbb, String tukhoa) {
        cbb.removeAllItems();
                            ResultSet rs = DAO.DAO_Phieunhap.SearchTuKhoa(tukhoa);
        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbb.getModel();
        try {
            while (rs.next()) {
                My_CBB mb = new My_CBB(rs.getString("MaSP"), rs.getString("TenSP"));
                cbbModel.addElement(mb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Phieunhap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
