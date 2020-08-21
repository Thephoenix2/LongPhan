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
public class DAO_HoaDon {
    public static ResultSet GetAllHoaDon(){
        String cautruyvan = "Select * from HoaDon";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet SearchHD(String tukhoa){
        String cautruyvan = "SELECT * from HoaDon " +
" where [MaHD] like N'%"+tukhoa+"%' " +
"      or[SoHoaDon] like N'%"+tukhoa+"%' " +
"      or [MaKH] like N'%"+tukhoa+"%' " +
"      or [NgayLap] like N'%"+tukhoa+"%' " +
"      or [MoTa] like N'%"+tukhoa+"%'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet CountSoHoaDon(String SoHoaDon) {
        String cauTruyVan = "select Count(*) from hoadon where SoHoaDon like N'%" + SoHoaDon + "%'";
        return DBconnection.Getdata(cauTruyVan);
    }

    //7 Hàm lấy theo SoHoaDon
    public static ResultSet GetBySoHoaDon(String SoHoaDon) {
        String cauTruyVan = "select * from hoadon where SoHoaDon = N'" + SoHoaDon + "'";
        return DBconnection.Getdata(cauTruyVan);
    }

    public static ResultSet GetAllSP() {
        String cautruyvan = "Select * from SanPham";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet GetAllLoaiSP() {
        String cautruyvan = "Select * from LoaiSP";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet SearchSP(String tukhoa, String maloai) {
        String cautruyvan = "SELECT * from SanPham "
                + "	where [MaSP] like N'%" + tukhoa + "%' "
                + "      or [TenSP] like N'%" + tukhoa + "%' "
                + "      and [MaLoaiSP] = " + maloai + " "
                + "      or [GiaBan] like N'%" + tukhoa + "%'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet SearchTuKhoa(String tukhoa) {
        String cautruyvan = "SELECT * from SanPham "
                + "	where [MaSP] like N'%" + tukhoa + "%' "
                + "      or [TenSP] like N'%" + tukhoa + "%' "
                + "      or [GiaBan] like N'%" + tukhoa + "%'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet SearchTheoMaLoaiSP(String MaLoaiSP) {
        String cautruyvan = "select * from SanPham where MaLoaiSP = " + MaLoaiSP + "";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet GetAllKH() {
        String cautruyvan = "Select * from KhachHang";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet SearchKH(String tukhoa) {
        String cautruyvan = "SELECT * from KhachHang "
                + " where TenKH like N'%" + tukhoa + "%'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet GetKHTheoMa(String MaKH) {
        String cautruyvan = "Select * from KhachHang where MaKH = N'" + MaKH + "'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet GetMaHDMax() {
        String cautruyvan = "Select MAX(MaHD)as MaHD from HoaDon ";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static int ThemHD(DTO.DTO_HoaDon HD) {
        String cautruyvan = "set dateformat dmy "
                + "INSERT INTO [dbo].[HoaDon] "
                + "           ([SoHoaDon] "
                + "           ,[MaKH] "
                + "           ,[TenTK] "
                + "           ,[GiamGia] "
                + "           ,[TongTien] "
                + "           ,[NgayLap] "
                + "           ,[MoTa]) "
                + "     VALUES "
                + "           ('" + HD.getMaHD() + "' "
                + "           ," + HD.getMaKH() + " "
                + "           ,N'" + HD.getTenTK() + "' "
                + "           ," + HD.getGiamGia() + " "
                + "           ," + HD.getTongTien() + " "
                + "           ,'" + HD.getNgayLap() + "' "
                + "           ,N'" + HD.getMoTa() + "')";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static int UpdateSLSP(int SLkho, int SLban, String MaSP) {
        String cautruyvan = "UPDATE [dbo].[SanPham] "
                + "   SET [TonKho] = " + (SLkho - SLban) + " "
                + " WHERE MaSP = N'" + MaSP + "'";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static ResultSet getSLSP(String MaSP) {
        String cautruyvan = "Select TonKho from SanPham where MaSP = N'" + MaSP + "'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet getTongTientheoMaKH(String MaKH) {
        String cautruyvan = "SELECT SUM(TongTien) "
                + "as TongTien "
                + "FROM HoaDon  "
                + "WHERE MaKH = N'" + MaKH + "'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static int UpdateLoaiKH(String MaKH, String LoaiKH){
        String cautruyvan = "UPDATE [dbo].[KhachHang] " +
"   SET [LoaiKhachHang] = N'"+LoaiKH+"' " +
" WHERE MaKH = N'"+MaKH+"'";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }
    
}
