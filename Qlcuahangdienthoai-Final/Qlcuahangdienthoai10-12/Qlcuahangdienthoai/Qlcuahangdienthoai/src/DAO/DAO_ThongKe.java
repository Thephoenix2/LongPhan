/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;

/**
 *
 * @author admin
 */
public class DAO_ThongKe {

    public static ResultSet getLuong(String NgayBD, String NgayKT) {
        String cautruyvan = "set dateformat dmy "
                + "SELECT * from Luong "
                + "WHERE NgayLam BETWEEN '" + NgayBD + " 00:00:00' AND '" + NgayKT + " 23:59:59'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet getHoaDon(String NgayBD, String NgayKT) {
        String cautruyvan = "set dateformat dmy "
                + "select ChiTietHoaDon.MaHD,ChiTietHoaDon.MaSP,SoLuong,ThanhTien from HoaDon, ChiTietHoaDon where HoaDon.MaHD = ChiTietHoaDon.MaHD "
                + "and NgayLap between  '" + NgayBD + " 00:00:00' and '" + NgayKT + " 23:59:59'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet getCTHD(int MaHD) {
        String cautruyvan = "Select * from ChiTietHoaDon "
                + "where MaHD = " + MaHD + "";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet getSP(String MaSP) {
        String cautruyvan = "select * from SanPham where MaSP = N'" + MaSP + "'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet getPN(String NgayBD, String NgayKT) {
        String cautruyvan = "set dateformat dmy  "
                + "select ChiTietPhieuNhap.MaPN,MaSP,SoLuong,ChiTietPhieuNhap.TongTien from PhieuNhap, ChiTietPhieuNhap where PhieuNhap.MaPN = ChiTietPhieuNhap.MaPN  "
                + "and NgayLap between  '" + NgayBD + " 00:00:00' and '" + NgayKT + " 23:59:59'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet getCTPN(int MaPN) {
        String cautruyvan = "select * from ChiTietPhieuNhap where MaPN = " + MaPN + "";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet getTongTienBan(String NgayBD, String NgayKT) {
        String cautruyvan = "Set dateformat dmy SELECT SUM(TongTien) as TongTienBan"
                + " "
                + "FROM HoaDon "
                + " "
                + "WHERE NgayLap BETWEEN '" + NgayBD + " 00:00:00' AND '" + NgayKT + " 23:59:59'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet getTongTienNhap(String NgayBD, String NgayKT) {
        String cautruyvan = "set dateformat dmy SELECT SUM(Tongtien) as TongTienNhap "
                + " "
                + "FROM PhieuNhap "
                + " "
                + "WHERE Ngaylap BETWEEN '" + NgayBD + " 00:00:00' AND '" + NgayKT + " 23:59:59'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet getTongLuong(String NgayBD, String NgayKT) {
        String cautruyvan = "set dateformat dmy "
                + "SELECT SUM(TongLuong1Ngay) as TongLuong "
                + " "
                + "FROM Luong "
                + " "
                + "WHERE NgayLam BETWEEN '" + NgayBD + "' AND '" + NgayKT + "'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet getTongTienGiamGia(String NgayBD, String NgayKT) {
        String cautruyvan = "set dateformat dmy  "
                + "select SUM(GiamGia) as TongTienGiamGia from HoaDon where NgayLap between '" + NgayBD + " 00:00:00' and '" + NgayKT + " 23:59:59'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

}
