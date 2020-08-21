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
public class DAO_User {
    public static ResultSet GetALL(){
        String cautruyvan = "Select * from TaiKhoan";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static int ThemUser(DTO.DTO_User US){
        String cautruyvan = "INSERT INTO [dbo].[TaiKhoan] " +
"           ([TenTK] " +
"           ,[MatKhau] " +
"           ,[MaNV] " +
"           ,[MaQuyen] " +
"           ,[MoTa]) " +
"     VALUES " +
"           (N'"+US.getTenTK()+"' " +
"           ,N'"+US.getMatKhau()+"' " +
"           ,N'"+US.getMaNV()+"' " +
"           ,"+US.getMaQuyen()+" " +
"           ,N'"+US.getMoTa()+"')";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }
    public static int XoaUser(String ID){
        String cautruyvan = "delete TaiKhoan where TenTK = N'"+ID+"' ";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }
    public static int SuaUser(DTO.DTO_User us){
        String cautruyvan = "UPDATE [dbo].[TaiKhoan] " +
"   SET [MatKhau] = N'"+us.getMatKhau()+"' " +
"      ,[MaQuyen] = "+us.getMaQuyen()+" " +
"      ,[MoTa] = N'"+us.getMoTa()+"' " +
" WHERE TenTK = N'"+us.getTenTK()+"'";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }
    public static ResultSet Search(String tukhoa){
        String cautruyvan = "SELECT * from TaiKhoan " +
"where  [TenTK] like N'%"+tukhoa+"%' " +
"     or [MaNV] like N'%"+tukhoa+"%'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet GetUserTheoMa(String MaNV){
        String cautruyvan = "select * from TaiKhoan where MaNV = N'"+MaNV+"' ";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet GetUserTheoMaUS(String MaUS){
        String cautruyvan = "select * from TaiKhoan where TenTK = N'"+MaUS+"'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet LoadCBB(){
        String cautruyvan = "SELECT * FROM NhanVien    " +
"WHERE MaNV NOT IN (SELECT MaNV FROM TaiKhoan)";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet getSLNV(){
        String cautruyvan = "select COUNT(MaNV) as SLNV from NhanVien";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
}
