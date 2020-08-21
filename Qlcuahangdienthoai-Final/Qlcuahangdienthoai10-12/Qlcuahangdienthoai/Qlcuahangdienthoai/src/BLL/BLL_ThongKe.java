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
public class BLL_ThongKe {
    public static void DoDuLieuTKLuong(JTable tbl, String NgayBD, String NgayKT) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[10];
        ResultSet rs = DAO.DAO_ThongKe.getLuong(NgayBD, NgayKT);
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaLuong");
                obj[2] = rs.getString("MaNV");
                String MaNV = rs.getString("MaNV");
                ResultSet rs1 = DAO.DAO_NhanVien.GetNhanVien_TheoMa(MaNV);
                while(rs1.next()){
                    obj[3] = rs1.getString("TenNV");
                }
                obj[4] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("Luong1Gio"));
                obj[5] = rs.getInt("SoGioLam");
                obj[6] = BLL_ChuyenDoi.GetDate(rs.getDate("NgayLam"));
                obj[7] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("LuongLamThem"));
                obj[8] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("TongLuong1Ngay"));
                obj[9] = rs.getString("MoTa");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void DoDuLieuTKSP(JTable tbl, String NgayBD, String NgayKT) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[6];
        ResultSet rs = DAO.DAO_ThongKe.getHoaDon(NgayBD, NgayKT);
        try {
            while (rs.next()) {                                
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getInt("MaHD");
                obj[2] = rs.getString("MaSP");
                String MaSP = rs.getString("MaSP");
                ResultSet rs1 = DAO.DAO_SanPham.getTheoMaSP(MaSP);
                while(rs1.next()){
                    obj[3] = rs1.getString("TenSP");
                }
                obj[4] = rs.getInt("SoLuong");
                obj[5] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("ThanhTien"));
               tbModel.addRow(obj); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void DoDuLieuTKSPNhap(JTable tbl, String NgayBD, String NgayKT) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[6];
        ResultSet rs = DAO.DAO_ThongKe.getPN(NgayBD, NgayKT);
        try {
            while (rs.next()) {                                
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getInt("MaPN");
                obj[2] = rs.getString("MaSP");
                String MaSP = rs.getString("MaSP");
                ResultSet rs1 = DAO.DAO_SanPham.getTheoMaSP(MaSP);
                while(rs1.next()){
                    obj[3] = rs1.getString("TenSP");
                }
                obj[4] = rs.getInt("SoLuong");
                obj[5] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("TongTien"));
               tbModel.addRow(obj); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
