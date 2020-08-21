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
public class DAO_Khachhang {

    public static ResultSet GetMoTa(String MaKH) {
        String cautruyvan = "Select MoTa from KhachHang where MaKH = N'" + MaKH + "' ";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet GetALL() {
        String cautruyvan = "Select * from KhachHang";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet GetMaKH() {
        String cautruyvan = "Select MaKH from KhachHang";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static int ThemKH(DTO.DTO_Khachhang KH) {
        String cautruyvan = "set dateformat dmy "
                + "INSERT INTO [dbo].[KhachHang]  "
                + "           ([MaKH]  "
                + "           ,[TenKH]  "
                + "           ,[GioiTinh]  "
                + "           ,[SDT]  "
                + "           ,[Email]  "
                + "           ,[DiaChi]  "
                + "           ,[Ngaysinh]  "
                + "           ,[Loaikhachhang]  "
                + "           ,[Hinh]  "
                + "           ,[Mota])  "
                + "     VALUES  "
                + "           ('" + KH.getMaKH() + "'  "
                + "           ,N'" + KH.getTenKH() + "'  "
                + "           ,'" + KH.isGioitinh() + "'  "
                + "           ,'" + KH.getSdt() + "'  "
                + "           ,N'" + KH.getEmail() + "'  "
                + "           ,N'" + KH.getDiachi() + "'  "
                + "           ,'" + KH.getNgaysinh() + "'  "
                + "           ,N'" + KH.getLoaiKh() + "'  "
                + "           ,N'" + KH.getHinh() + "'  "
                + "           ,N'" + KH.getMota() + "')";
        return DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static int SuaKH(DTO.DTO_Khachhang KH) {
        String cautruyvan = 
                "set dateformat dmy "
                +"UPDATE [dbo].[KhachHang]  "
                + "   SET   "
                + "      [TenKH] = N'"+KH.getTenKH()+"'  "
                + "      ,[GioiTinh] = '"+KH.isGioitinh()+"'  "
                + "      ,[SDT] = '"+KH.getSdt()+"'  "
                + "      ,[Email] = N'"+KH.getEmail()+"'  "
                + "      ,[DiaChi] = N'"+KH.getDiachi()+"'  "
                + "      ,[Ngaysinh] = '"+KH.getNgaysinh()+"'  "
                + "      ,[Loaikhachhang] = N'"+KH.getLoaiKh()+"'  "
                + "      ,[Hinh] = N'"+KH.getHinh()+"'  "
                + "      ,[Mota] = N'"+KH.getMota()+"'  "
                + " WHERE [MaKH] ='"+KH.getMaKH()+"'";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static int XoaKH(String MaKH) {
        String cautruyvan = "Delete KhachHang where MaKH = N'" + MaKH + "' ";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static ResultSet Search(String tukhoa) {
        String cautruyvan = "SELECT * from KhachHang "
                + " where [MaKH] like N'%" + tukhoa + "%' "
                + "      or[TenKH] like N'%" + tukhoa + "%' "
                + "      or[DiaChi] like N'%" + tukhoa + "%' "
                + "      or [SDT] like N'%" + tukhoa + "%' "
                + "      or [Email] like N'%" + tukhoa + "%' "
                + "      or [MoTa] like N'%" + tukhoa + "%'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet getTheoMa(String MaKH){
        String cautruyvan = "select * from KhachHang where MaKH = '"+MaKH+"'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
}
