/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.Pnl_Qlnhanvien;
import GUI.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class BLL_NhanVien {

    public static void DoDuLieu(JTable tbl) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[12];
        ResultSet rs = DAO.DAO_NhanVien.GetALL();
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaNV");
                obj[2] = rs.getString("TenNV");
                if (rs.getBoolean("GioiTinh")) {
                    obj[3] = "Nam";
                } else {
                    obj[3] = "Nữ";
                }
                obj[4] = rs.getString("DiaChi");
                obj[5] = rs.getString("SDT");
                obj[6] = rs.getString("ChucVu");
                obj[8] = rs.getString("CMND");
                obj[9] = rs.getString("Email");
                obj[7] = BLL_ChuyenDoi.GetDate(rs.getDate("NgaySinh"));
                obj[10] = BLL_ChuyenDoi.GetDate(rs.getDate("NgayVaoLam"));
                obj[11] = rs.getString("Hinh");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }

    public static void DoDuLieu(JTable tbl, String tukhoa) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[12];
        ResultSet rs = DAO.DAO_NhanVien.Search(tukhoa);
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaNV");
                obj[2] = rs.getString("TenNV");
                if (rs.getBoolean("GioiTinh")) {
                    obj[3] = "Nam";
                } else {
                    obj[3] = "Nữ";
                }
                obj[4] = rs.getString("DiaChi");
                obj[5] = rs.getString("SDT");
                obj[6] = rs.getString("ChucVu");
                obj[8] = rs.getString("CMND");
                obj[9] = rs.getString("Email");
                obj[7] = BLL_ChuyenDoi.GetDate(rs.getDate("NgaySinh"));
                obj[10] = BLL_ChuyenDoi.GetDate(rs.getDate("NgayVaoLam"));
                obj[11] = rs.getString("Hinh");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }

    public static boolean KiemTra(DTO.DTO_NhanVien NV) {
        if (NV.getMaNV().trim().length() < 1 || NV.getMaNV().trim().length() > 10) {
            ThongBao.ThongBao("Mã nhân viên không hợp lệ", "Thông báo");
            return false;
        }
        ResultSet rs = DAO.DAO_NhanVien.GetNhanVien_TheoMa(NV.getMaNV());
        try {
            while (rs.next()) {
                ThongBao.ThongBao("Mã nhân viên đã được sử dụng", "Thông báo");
                return false;

            }
        } catch (SQLException ex) {

        }
        if (NV.getTenNV().trim().length() < 1) {
            ThongBao.ThongBao("Tên nhân viên không được để trống", "Thông báo");
            return false;
        }
        if (NV.getDiaChi().trim().length() < 1) {
            ThongBao.ThongBao("Địa chỉ không được để trống", "Thông báo");
            return false;
        }
        String KTSDT = "\\d{10}";
        if (!NV.getSDT().matches(KTSDT)) {
            ThongBao.ThongBao("SDT không hợp lệ", "Thông báo");
            return false;
        }
        if (NV.getNgaySinh()== null) {
            ThongBao.ThongBao("Ngày sinh không được để trống", "Thông báo");
            return false;
        }
        if (NV.getNgayVaoLam()== null) {
            ThongBao.ThongBao("Ngày vào làm không được để trống", "Thông báo");
            return false;
        }

        int Year = Integer.parseInt(NV.getNgaySinh().substring(NV.getNgaySinh().lastIndexOf("-") + 1));
        if (Year - 2019 >= 0) {
            ThongBao.ThongBao("Ngày sinh không hợp lệ", "Thông báo");
            return false;
        }
        String KTCMND = "\\d{9}";
        if (!NV.getCMND().matches(KTCMND)) {
            ThongBao.ThongBao("CMND không hợp lệ", "Thông báo");
            return false;
        }


        String KTEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (!NV.getEmail().matches(KTEmail)) {
            ThongBao.ThongBao("Email không hợp lệ", "Thông báo");
            return false;
        }

        return true;
    }

    public static boolean KiemTraSua(DTO.DTO_NhanVien NV) {

        if (NV.getMaNV().trim().length() < 1 || NV.getMaNV().trim().length() > 10) {
            ThongBao.ThongBao("Mã nhân viên không hợp lệ", "Thông báo");
            return false;
        }

        if (NV.getTenNV().trim().length() < 1) {
            ThongBao.ThongBao("Tên nhân viên không được để trống", "Thông báo");
            return false;
        }
        if (NV.getDiaChi().trim().length() < 1) {
            ThongBao.ThongBao("Địa chỉ không được để trống", "Thông báo");
            return false;
        }
        String KTSDT = "\\d{10}";
        if (!NV.getSDT().matches(KTSDT)) {
            ThongBao.ThongBao("SDT không hợp lệ", "Thông báo");
            return false;
        }

        int Year = Integer.parseInt(NV.getNgaySinh().substring(NV.getNgaySinh().lastIndexOf("-") + 1));
        if (Year - 2019 >= 0) {
            ThongBao.ThongBao("Ngày sinh không hợp lệ", "Thông báo");
            return false;
        }
        String KTCMND = "\\d{9}";
        if (!NV.getCMND().matches(KTCMND)) {
            ThongBao.ThongBao("CMND không hợp lệ", "Thông báo");
            return false;
        }

        String KTEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (!NV.getEmail().matches(KTEmail)) {
            ThongBao.ThongBao("Email không hợp lệ", "Thông báo");
            return false;
        }
        return true;
    }
}
