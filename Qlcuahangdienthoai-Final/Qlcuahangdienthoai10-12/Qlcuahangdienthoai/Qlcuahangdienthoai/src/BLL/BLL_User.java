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
 * @author admin
 */
public class BLL_User {
    public static void DoDuLieu(JTable tbl){
        DefaultTableModel tbModel = (DefaultTableModel)tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[6];
        ResultSet rs = DAO.DAO_User.GetALL();
        try {
            while(rs.next()){
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("TenTK");
                obj[2] = rs.getString("MatKhau");
                obj[3] = rs.getString("MaNV");
                String MaQuyen = rs.getString("MaQuyen");               
                ResultSet rsQuyen = DAO.DAO_Quyen.GetTheoMa(MaQuyen);
                if (rsQuyen.next()) {
                    obj[4] = rsQuyen.getString("TenQuyen");
                }
                
                obj[5] = rs.getString("MoTa");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu", "Thông báo");
        }
    }
    public static void DoDuLieu(JTable tbl, String tukhoa){
        DefaultTableModel tbModel = (DefaultTableModel)tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[6];
        ResultSet rs = DAO.DAO_User.Search(tukhoa);
        try {
            while(rs.next()){
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("TenTK");
                obj[2] = rs.getString("MatKhau");
                obj[3] = rs.getString("MaNV");
                String MaQuyen = rs.getString("MaQuyen");               
                ResultSet rsQuyen = DAO.DAO_Quyen.GetTheoMa(MaQuyen);
                if (rsQuyen.next()) {
                    obj[4] = rsQuyen.getString("TenQuyen");
                }
                obj[5] = rs.getString("MoTa");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu", "Thông báo");
        }
    }
    public static boolean KiemTra(DTO.DTO_User us){
        if (us.getTenTK().trim().length() < 1) {
            ThongBao.ThongBao("Tên tài khoản không được để trống", "Thông báo");
            return false;
        }
        if (us.getMatKhau().trim().length() < 6) {
            ThongBao.ThongBao("Mật khẩu tối thiểu 5 kí tự", "Thông báo");
            return false;
        }
        ResultSet rs = DAO.DAO_NhanVien.GetNhanVien_TheoMa(us.getMaNV());
        ResultSet rs1 = DAO.DAO_User.GetUserTheoMa(us.getMaNV());
        ResultSet rs2 = DAO.DAO_User.GetALL();
        try {  
            if(!rs.next()){
                ThongBao.ThongBao("Mã nhân viên không tồn tại", "Thông báo");
                return false; 
            }
            if(rs1.next()){
                ThongBao.ThongBao("Mã nhân viên đã được sử dụng", "Thông báo");
                return false;
            }
            while(rs2.next()){
                if (rs2.getString("TenTK").equals(us.getTenTK())) {
                ThongBao.ThongBao("Tên tài khoản đã được sử dụng", "Thông báo");
                return false;
            }
            }
            
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dự liệu sql", "Thông báo");
        }
        return true;
    }
    public static boolean KiemTraSua(DTO.DTO_User us){
        if (us.getMatKhau().trim().length() < 6) {
            ThongBao.ThongBao("Mật khẩu tối thiểu 5 kí tự", "Thông báo");
            return false;
        }
        return true;
    }
}
