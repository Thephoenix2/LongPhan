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
 * @author admin
 */
public class BLL_Luong {
    public static void DoDuLieu(JTable tbl){
        DefaultTableModel tbModel = (DefaultTableModel)tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[9];
        ResultSet rs = DAO.DAO_Luong.GetALL();
        try {
            while(rs.next()){
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getInt("MaLuong");
                String MaNV = rs.getString("MaNV");               
                ResultSet rs1 = DAO.DAO_NhanVien.GetNhanVien_TheoMa(MaNV);
                if (rs1.next()) {
                    obj[2] = rs1.getString("TenNV");
                }
                
                obj[3] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("Luong1Gio"));
                obj[4] = rs.getInt("SoGioLam");
                obj[5] = BLL_ChuyenDoi.GetDate(rs.getDate("NgayLam"));
                obj[6] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("LuongLamThem"));
                obj[7] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("TongLuong1Ngay"));
                obj[8] = rs.getString("MoTa");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu", "Thông báo");
        }
    }
    public static void DoDuLieu(JTable tbl, String tukhoa){
        DefaultTableModel tbModel = (DefaultTableModel)tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[9];
        ResultSet rs = DAO.DAO_Luong.Search(tukhoa);
        try {
            while(rs.next()){
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getInt("MaLuong");
                String MaNV = rs.getString("MaNV");               
                ResultSet rs1 = DAO.DAO_NhanVien.GetNhanVien_TheoMa(MaNV);
                if (rs1.next()) {
                    obj[2] = rs1.getString("TenNV");
                }
                
                obj[3] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("Luong1Gio"));
                obj[4] = rs.getInt("SoGioLam");
                obj[5] = BLL_ChuyenDoi.GetDate(rs.getDate("NgayLam"));
                obj[6] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("LuongLamThem"));
                obj[7] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("TongLuong1Ngay"));
                obj[8] = rs.getString("MoTa");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
//            ThongBao.ThongBao("Lỗi lấy dữ liệu", "Thông báo");
        }
    }
    public static void DoDuLieuVaoCBBNhanVien(JComboBox cbb, String keyword) {
        cbb.removeAllItems();
        try {
            ResultSet rs = DAO.DAO_NhanVien.Search(keyword);

            DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbb.getModel();

            while (rs.next()) {
                My_CBB mb = new My_CBB(rs.getString("MaNV"),
                        rs.getString("TenNV"));
                cbbModel.addElement(mb);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Thông báo", "Lỗi truy vấn dữ liệu.");
        }
    }
    public static boolean KiemTra(DTO.DTO_Luong luong){
        String setNgay = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        if (!luong.getNgayLam().matches(setNgay)) {
            ThongBao.ThongBao("Ngày sinh không hợp lệ", "Thông báo");
            return false;
        }
        if (luong.getLuong1Gio()== 0) {
            ThongBao.ThongBao("Lương không hợp lệ", "Thông báo");
            return false;
        }
        if (luong.getTongLuong1Ngay() == 0) {
            ThongBao.ThongBao("Lương không hợp lệ", "Thông báo");
            return false;
        }
        
        return true;
    }
}
