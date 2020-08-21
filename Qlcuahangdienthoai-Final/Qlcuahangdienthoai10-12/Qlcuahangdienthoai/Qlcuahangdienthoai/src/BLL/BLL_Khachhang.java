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
public class BLL_Khachhang {

    public static void DoDuLieu(JTable tbl) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[10];
        ResultSet rs = DAO.DAO_Khachhang.GetALL();
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaKH");
                obj[2] = rs.getString("TenKH");
                if (rs.getBoolean("GioiTinh")) {
                    obj[3] = "Nam";
                } else {
                    obj[3] = "Nữ";
                }
                obj[4] = rs.getString("DiaChi");
                obj[5] = rs.getString("SDT");
                obj[6] = rs.getString("Email");
                obj[7] = BLL.BLL_ChuyenDoi.GetDate(rs.getDate("Ngaysinh"));
                obj[8] = rs.getString("Loaikhachhang");
                obj[9] = rs.getString("Hinh");

                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }

    public static void DoDuLieu(JTable tbl, String tukhoa) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[9];
        ResultSet rs = DAO.DAO_Khachhang.Search(tukhoa);

        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaKH");
                obj[2] = rs.getString("TenKH");
                if (rs.getBoolean("GioiTinh")) {
                    obj[3] = "Nam";
                } else {
                    obj[3] = "Nữ";
                }
                obj[4] = rs.getString("DiaChi");
                obj[5] = rs.getString("SDT");
                obj[6] = rs.getString("Email");
                obj[7] = rs.getString("Hinh");

                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }

    public static boolean KiemTraThem(DTO.DTO_Khachhang KH) {
        if (KH.getMaKH().trim().length() < 1 || KH.getMaKH().trim().length() > 10) {
            ThongBao.ThongBao("Mã khách hàng không hợp lệ", "Thông báo");
            return false;
        }
           ResultSet rs = DAO.DAO_Khachhang.getTheoMa(KH.getMaKH());
        try {
            while (rs.next()) {
                    ThongBao.ThongBao("Mã khách hàng đã được sử dụng", "Thông báo");
                    return false;
              
            }
        } catch (SQLException ex) {

        }
        if (KH.getTenKH().trim().length() < 1) {
            ThongBao.ThongBao("Tên khách hàng không được để trống", "Thông báo");
            return false;
        }
        if (KH.getDiachi().trim().length() < 1) {
            ThongBao.ThongBao("Địa chỉ không được để trống", "Thông báo");
            return false;
        }
        if (KH.getNgaysinh() == null) {
            ThongBao.ThongBao("Ngày sinh không được để trống", "Thông báo");
            return false;
        }

        String KTSDT = "\\d{10}";
        if (!KH.getSdt().matches(KTSDT)) {
            ThongBao.ThongBao("SDT không hợp lệ", "Thông báo");
            return false;
        }

        String KTEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (!KH.getEmail().matches(KTEmail)) {
            ThongBao.ThongBao("Email không hợp lệ", "Thông báo");
            return false;
        }
        return true;
    }

    public static boolean KiemTraSua(DTO.DTO_Khachhang KH) {
        if (KH.getMaKH().trim().length() < 1 || KH.getMaKH().trim().length() > 10) {
            ThongBao.ThongBao("Mã khách hàng không hợp lệ", "Thông báo");
            return false;
        }

        if (KH.getTenKH().trim().length() < 1) {
            ThongBao.ThongBao("Tên nhân viên không được để trống", "Thông báo");
            return false;
        }
        if (KH.getDiachi().trim().length() < 1) {
            ThongBao.ThongBao("Địa chỉ không được để trống", "Thông báo");
            return false;
        }

        String KTSDT = "\\d{10}";
        if (!KH.getSdt().matches(KTSDT)) {
            ThongBao.ThongBao("SDT không hợp lệ", "Thông báo");
            return false;
        }

        String KTEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (!KH.getEmail().matches(KTEmail)) {
            ThongBao.ThongBao("Email không hợp lệ", "Thông báo");
            return false;
        }
        return true;
    }
}
