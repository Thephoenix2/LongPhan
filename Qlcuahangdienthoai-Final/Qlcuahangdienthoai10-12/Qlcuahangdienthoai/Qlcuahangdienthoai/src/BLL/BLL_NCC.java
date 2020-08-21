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
 * @author Minh
 */
public class BLL_NCC {

    public static void DoDuLieu(JTable tbl) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[6];
        ResultSet rs = DAO.DAO_NCC.GetALL();
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaNCC");
                obj[2] = rs.getString("TenNCC");
                obj[3] = rs.getString("SDT");
                obj[4] = rs.getString("Email");
                obj[5] = rs.getString("DiaChi");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }

    public static void DoDuLieu(JTable tbl, String tukhoa) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[6];
        ResultSet rs = DAO.DAO_NCC.Search(tukhoa);
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaNCC");
                obj[2] = rs.getString("TenNCC");
                obj[3] = rs.getString("SDT");
                obj[4] = rs.getString("Email");
                obj[5] = rs.getString("DiaChi");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }

    public static boolean KiemTraThem(DTO.DTO_NCC NCC) {
        if (NCC.getMaNCC().trim().length() < 1 || NCC.getMaNCC().trim().length() > 10) {
            ThongBao.ThongBao("Mã nhà cung cấp không hợp lệ", "Thông báo");
            return false;
        }
//        System.out.println(NCC.getMaNCC());
        ResultSet rs = DAO.DAO_NCC.GetNCC_TheoMa(NCC.getMaNCC());
        try {
            while (rs.next()) {
                ThongBao.ThongBao("Mã nhà cung cấp đã được sử dụng", "Thông báo");
                return false;

            }
        } catch (SQLException ex) {

        }
        if (NCC.getTenNCC().trim().length() < 1) {
            ThongBao.ThongBao("Tên nhà cung cấp không được để trống", "Thông báo");
            return false;
        }
        if (NCC.getDiachi().trim().length() < 1) {
            ThongBao.ThongBao("Địa chỉ không được để trống", "Thông báo");
            return false;
        }

        String KTSDT = "\\d{10}";
        if (!NCC.getSdt().matches(KTSDT)) {
            ThongBao.ThongBao("SDT không hợp lệ", "Thông báo");
            return false;
        }

        String KTEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (!NCC.getEmail().matches(KTEmail)) {
            ThongBao.ThongBao("Email không hợp lệ", "Thông báo");
            return false;
        }
        return true;
    }
     public static boolean KiemTraSua(DTO.DTO_NCC NCC) {
        if (NCC.getMaNCC().trim().length() < 1 || NCC.getMaNCC().trim().length() > 10) {
            ThongBao.ThongBao("Mã nhà cung cấp không hợp lệ", "Thông báo");
            return false;
        } 
        if (NCC.getTenNCC().trim().length() < 1) {
            ThongBao.ThongBao("Tên nhà cung cấp không được để trống", "Thông báo");
            return false;
        }
        if (NCC.getDiachi().trim().length() < 1) {
            ThongBao.ThongBao("Địa chỉ không được để trống", "Thông báo");
            return false;
        }

        String KTSDT = "\\d{10}";
        if (!NCC.getSdt().matches(KTSDT)) {
            ThongBao.ThongBao("SDT không hợp lệ", "Thông báo");
            return false;
        }

        String KTEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (!NCC.getEmail().matches(KTEmail)) {
            ThongBao.ThongBao("Email không hợp lệ", "Thông báo");
            return false;
        }
        return true;
    }
}
