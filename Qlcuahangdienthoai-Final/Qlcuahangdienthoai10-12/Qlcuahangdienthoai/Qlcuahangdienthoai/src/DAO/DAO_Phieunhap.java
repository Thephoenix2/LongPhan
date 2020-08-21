/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;

/**
 *
 * @author Minh
 */
public class DAO_Phieunhap {

    public static ResultSet GetAllSP() {
        String cautruyvan = "Select * from SanPham";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet SearchNCC(String tukhoa) {
        String cautruyvan = "SELECT * from NhaCungCap "
                + " where TenNCC like N'%" + tukhoa + "%'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet GetAllNCC() {
        String cautruyvan = "Select * from NhaCungCap";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet GetNCCTheoMa(String MaNCC) {
        String cautruyvan = "Select * from NhaCungCap where MaNCC = N'" + MaNCC + "'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet GetSPTheoMa(String MaSP) {
        String cautruyvan = "Select * from SanPham where MaSP = N'" + MaSP + "'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet SearchTuKhoa(String tukhoa) {
        String cautruyvan = "SELECT * from SanPham "
                + "	where [MaSP] like N'%" + tukhoa + "%' "
                + "      or [TenSP] like N'%" + tukhoa + "%' "
                + "      or [GiaBan] like N'%" + tukhoa + "%'";
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

    public static ResultSet SearchTheoMaLoaiSP(String MaLoaiSP) {
        String cautruyvan = "select * from SanPham where MaLoaiSP = " + MaLoaiSP + "";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static int ThemPN(DTO.DTO_PhieuNhap PN) {
        String cautruyvan = "set dateformat dmy " +
                "INSERT INTO [dbo].[PhieuNhap] " +
"           ([SoPhieu] " +
"           ,[TenTK] " +
"           ,[MaNCC] " +
"           ,[Tongtien] " +
"           ,[Ngaylap] " +
"           ,[MoTa]) " +
"     VALUES " +
"           ('"+PN.getMaPN()+"' " +
"           ,'"+PN.getTenTK()+"' " +
"           ,N'"+PN.getMaNCC()+"' " +
"           ,"+PN.getTongTien()+" " +
"           ,'"+PN.getNgayLap()+"' " +
"           ,N'"+PN.getMoTa()+"')";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);

    }

    public static ResultSet GetBySoPhieu(String SoPhieu) {
        String cauTruyVan = "select * from PhieuNhap where SoPhieu = N'" + SoPhieu + "'";
        return DBconnection.Getdata(cauTruyVan);
    }

    public static int UpdateSLSP(int SLkho, int SLnhap, String MaSP) {
        String cautruyvan = "UPDATE [dbo].[SanPham] "
                + "   SET [TonKho] = " + (SLkho + SLnhap) + " "
                + " WHERE MaSP = N'" + MaSP + "'";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static ResultSet GetMaPNMax() {
        String cautruyvan = "Select MAX(MaPN)as MaPN from PhieuNhap ";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet getSLSP(String MaSP) {
        String cautruyvan = "Select TonKho from SanPham where MaSP = N'" + MaSP + "'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet CountSoHoaDon(String SoHoaDon) {
        String cauTruyVan = "select Count(*) from PhieuNhap where SoPhieu like N'%" + SoHoaDon + "%'";
        return DBconnection.Getdata(cauTruyVan);
    }

    public static ResultSet GetBySoHoaDon(String SoHoaDon) {
        String cauTruyVan = "select * from PhieuNhap where SoPhieu = N'" + SoHoaDon + "'";
        return DBconnection.Getdata(cauTruyVan);
    }
}
