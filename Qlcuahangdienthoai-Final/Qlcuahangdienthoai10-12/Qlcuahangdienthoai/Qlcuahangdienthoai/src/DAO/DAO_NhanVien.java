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
public class DAO_NhanVien {
    public static ResultSet GetALL(){
        String cautruyvan = "Select * from NhanVien";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet GetNhanVien_TheoMa(String MaNV){
        String cautruyvan = "Select * from NhanVien where MaNV = N'"+MaNV+"' ";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet GetMaNV(){
        String cautruyvan = "Select MaNV from NhanVien";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet GetMoTa(String MaNV){
        String cautruyvan = "Select MoTa from NhanVien where MaNV = N'"+MaNV+"' ";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static int ThemNV(DTO.DTO_NhanVien NV){
        String cautruyvan = "set dateformat dmy  " +
"INSERT INTO [dbo].[NhanVien]  " +
"           ([MaNV]  " +
"           ,[TenNV]  " +
"           ,[GioiTinh]  " +
"           ,[DiaChi]  " +
"           ,[SDT]  " +
"           ,[CMND]  " +
"           ,[Email]  " +
"           ,[NgaySinh]  " +
"           ,[ChucVu]  " +
"           ,[NgayVaoLam]  " +
"           ,[Hinh]  " +
"           ,[MoTa])  " +
"     VALUES  " +
"           (N'"+NV.getMaNV()+"'  " +
"           ,N'"+NV.getTenNV()+"'  " +
"           ,'"+NV.isGioiTinh()+"'  " +
"           ,N'"+NV.getDiaChi()+"'  " +
"           ,N'"+NV.getSDT()+"'  " +
"           ,N'"+NV.getCMND()+"'  " +
"           ,N'"+NV.getEmail()+"'  " +
"           ,'"+NV.getNgaySinh()+"'  " +
"           ,N'"+NV.getChucVu()+"'  " +
"           ,'"+NV.getNgayVaoLam()+"'  " +
"           ,N'"+NV.getHinh()+"'  " +
"           ,N'"+NV.getMoTa()+"')";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }
    public static int XoaNV(String MaNV){
        String cautruyvan = "Delete NhanVien where MaNV = N'"+MaNV+"' ";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }
    public static int SuaNV(DTO.DTO_NhanVien NV){
        String cautruyvan = "set dateformat dmy UPDATE [dbo].[NhanVien]  " +
"     set TenNV = N'"+NV.getTenNV()+"' " +
"      ,[GioiTinh] = '"+NV.isGioiTinh()+"' " +
"      ,[DiaChi] = N'"+NV.getDiaChi()+"' " +
"      ,[SDT] = N'"+NV.getSDT()+"' " +
"      ,[CMND] = N'"+NV.getCMND()+"' " +
"      ,[Email] = N'"+NV.getEmail()+"' " +
"      ,[NgaySinh] = '"+NV.getNgaySinh()+"' " +
"      ,[ChucVu] = N'"+NV.getChucVu()+"' " +
"      ,[NgayVaoLam] = '"+NV.getNgayVaoLam()+"' " +
"      ,[Hinh] = N'"+NV.getHinh()+"' " +
"      ,[MoTa] = N'"+NV.getMoTa()+"' " +
" WHERE MaNV = N'"+NV.getMaNV()+"'";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }
    public static ResultSet Search(String tukhoa){
        String cautruyvan = "SELECT * from NhanVien " +
" where [MaNV] like N'%"+tukhoa+"%' " +
"      or[TenNV] like N'%"+tukhoa+"%' " +
"      or[DiaChi] like N'%"+tukhoa+"%' " +
"      or [SDT] like N'%"+tukhoa+"%' " +
"      or [CMND] like N'%"+tukhoa+"%' " +
"      or [Email] like N'%"+tukhoa+"%'       " +
"      or [NgayVaoLam] like N'%"+tukhoa+"%' " +
"      or [MoTa] like N'%"+tukhoa+"%'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
}
