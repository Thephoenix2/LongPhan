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
public class BLL_HoaDon {

    public static void DoDuLieuTbSP(JTable tbl, ResultSet rs) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        Object obj[] = new Object[5];
        try {
            while (rs.next()) {
                obj[0] = rs.getString("MaSP");
                obj[1] = rs.getString("TenSP");
                obj[2] = rs.getString("TonKho");
                obj[3] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("GiaBan"));
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }

    public static void DoDuLieuTbDanhSachHD(JTable tbl) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        ResultSet rs = DAO.DAO_HoaDon.GetAllHoaDon();
        Object obj[] = new Object[10];
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getInt("MaHD");
                obj[2] = rs.getString("SoHoaDon");
                obj[3] = rs.getString("MaKH");
                String MaKH = rs.getString("MaKH");
                ResultSet rs1 = DAO.DAO_HoaDon.GetKHTheoMa(MaKH);
                while (rs1.next()) {
                    obj[4] = rs1.getString("TenKH");
                }
                String TenTK = rs.getString("TenTK");
                ResultSet rs2 = DAO.DAO_User.GetUserTheoMaUS(TenTK);
                while (rs2.next()) {
                    String MaNV = rs2.getString("MaNV");
                    ResultSet rs3 = DAO.DAO_NhanVien.GetNhanVien_TheoMa(MaNV);
                    while (rs3.next()) {
                        obj[5] = rs3.getString("TenNV");
                    }
                }
                obj[6] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("GiamGia"));
                obj[7] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("TongTien"));
                obj[8] = BLL_ChuyenDoi.GetDate(rs.getDate("NgayLap"));
                obj[9] = rs.getString("MoTa");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }
    public static void DoDuLieuTbDanhSachHD(JTable tbl, String tukhoa) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0);
        ResultSet rs = DAO.DAO_HoaDon.SearchHD(tukhoa);
        Object obj[] = new Object[10];
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getInt("MaHD");
                obj[2] = rs.getString("SoHoaDon");
                obj[3] = rs.getString("MaKH");
                String MaKH = rs.getString("MaKH");
                ResultSet rs1 = DAO.DAO_HoaDon.GetKHTheoMa(MaKH);
                while (rs1.next()) {
                    obj[4] = rs1.getString("TenKH");
                }
                String TenTK = rs.getString("TenTK");
                ResultSet rs2 = DAO.DAO_User.GetUserTheoMaUS(TenTK);
                while (rs2.next()) {
                    String MaNV = rs2.getString("MaNV");
                    ResultSet rs3 = DAO.DAO_NhanVien.GetNhanVien_TheoMa(MaNV);
                    while (rs3.next()) {
                        obj[5] = rs3.getString("TenNV");
                    }
                }
                obj[6] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("GiamGia"));
                obj[7] = BLL_ChuyenDoi.DinhDangSo(rs.getDouble("TongTien"));
                obj[8] = BLL_ChuyenDoi.GetDate(rs.getDate("NgayLap"));
                obj[9] = rs.getString("MoTa");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu sql", "Thông báo");
        }
    }

    public static void DoDuLieuVaoCBBKhachHang(JComboBox cbb, String keyword) {
        cbb.removeAllItems();
        try {
            ResultSet rs = DAO.DAO_HoaDon.SearchKH(keyword);

            DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbb.getModel();

            while (rs.next()) {
                My_CBB mb = new My_CBB(rs.getString("MaKH"),
                        rs.getString("TenKH"));
                cbbModel.addElement(mb);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Thông báo", "Lỗi truy vấn dữ liệu.");
        }
    }

    public static void DuDuLieucbbKH(JComboBox cbb) {
        cbb.removeAllItems();
        ResultSet rs = DAO.DAO_HoaDon.GetAllKH();
        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbb.getModel();
        try {
            while (rs.next()) {
                My_CBB mb = new My_CBB(rs.getString("MaKH"), rs.getString("TenKH"));
                cbbModel.addElement(mb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_HoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void DoDuLieuVaoCBBKSP(JComboBox cbb, String tukhoa, String maloai) {
        cbb.removeAllItems();
        try {
            ResultSet rs = DAO.DAO_HoaDon.SearchSP(tukhoa, maloai);

            DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbb.getModel();

            while (rs.next()) {
                My_CBB mb = new My_CBB(rs.getString("TenSP"),
                        rs.getString("MaSP"));
                cbbModel.addElement(mb);
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Thông báo", "Lỗi truy vấn dữ liệu.");
        }
    }

}
