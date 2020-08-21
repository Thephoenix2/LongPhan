/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HuyBQ
 */
public class BLL_SanPham {

    public static void DoDuLieu(JTable tbl) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[8];
        ResultSet rs = DAO.DAO_SanPham.GetALL();
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaSP");
                obj[2] = rs.getString("TenSP");
                obj[3] = rs.getString("MaLoaiSP");
                obj[4] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("GiaNhap"));
                obj[5] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("GiaBan"));
                obj[6] = rs.getString("TonKho");
                obj[7] = rs.getString("Hinh");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }

    public static void DoDuLieu(JTable tbl, String Tukhoa) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[8];
        ResultSet rs = DAO.DAO_SanPham.TimKiem(Tukhoa);
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaSP");
                obj[2] = rs.getString("TenSP");
                obj[3] = rs.getString("MaLoaiSP");
                obj[4] = rs.getString("GiaNhap");
                obj[5] = rs.getString("GiaBan");
                obj[6] = rs.getString("TonKho");
                obj[7] = rs.getString("MoTa");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }

    public static boolean KiemTra(DTO.DTO_SanPham sp) {
        if (sp.getMaSP().trim().length() < 1 || sp.getMaSP().trim().length() > 10) {
            ThongBao.ThongBao("Mã sản phẩm không hợp lệ", "Thông báo");
            return false;
        }
               ResultSet rs = DAO.DAO_SanPham.getTheoMaSP(sp.getMaSP());
        try {
            while (rs.next()) {
                ThongBao.ThongBao("Mã sản phẩm đã được sử dụng", "loi");
                    return false;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi lấy mã sẵn phẩm");
        }
        
        if (sp.getTenSP().trim().length() < 1) {
            ThongBao.ThongBao("Tên sản phẩm không được để trống", "Thông báo");
            return false;
        }
        if (sp.getGiaNhap() == 0) {
            ThongBao.ThongBao("Giá nhập không được để trống", "Thông báo");
            return false;
        }
        if (sp.getGiaBan() == 0) {
            ThongBao.ThongBao("Giá bán không được để trống", "Thông báo");
            return false;
        }

 
        return true;
    }

}
