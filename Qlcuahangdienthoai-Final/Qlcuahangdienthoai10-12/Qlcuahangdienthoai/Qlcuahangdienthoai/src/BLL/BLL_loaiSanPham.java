/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HuyBQ
 */
public class BLL_loaiSanPham {

    public static void DoDuLieu(JTable tbl) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[4];
        ResultSet rs = DAO.DAO_loaiSanPham.GetALL();
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaLoaiSP");
                obj[2] = rs.getString("TenLoaiSP");
                obj[3] = rs.getString("MoTa");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }

    public static void DoDuLieu(JTable tbl, String Tukhoa) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[4];
        ResultSet rs = DAO.DAO_loaiSanPham.TimKiem(Tukhoa);
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaLoaiSP");
                obj[2] = rs.getString("TenLoaiSP");
                obj[3] = rs.getString("MoTa");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }

    public static boolean KiemTra(DTO.DTO_LoaiSanPham loaisanpham) {
        if (loaisanpham.getMaSP().trim().length() < 1 || loaisanpham.getMaSP().trim().length() > 10) {
            ThongBao.ThongBao("Mã sản phẩm không hợp lệ", "Thông báo");
            return false;
        }
        ResultSet rs = DAO.DAO_loaiSanPham.GetLoaiSP_TheoMa(loaisanpham.getMaSP());
        try {
            while (rs.next()) {
                ThongBao.ThongBao("Mã loại sản phẩm đã được sử dụng", "Thông báo");
                return false;

            }
        } catch (SQLException ex) {

        }
        if (loaisanpham.getTenSP().trim().length() < 1) {
            ThongBao.ThongBao("Tên sản phẩm không được để trống", "Thông báo");
            return false;
        }
        return true;
    }
}
