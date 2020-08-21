/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author admin
 */
public class DAO_Luong {

    public static ResultSet GetMaLuong() {
        String cautruyvan = "Select MAX(MaLuong)as MaLuong from Luong ";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet GetALL() {
        String cautruyvan = "Select * from Luong";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static int ThemLuong(DTO.DTO_Luong luong) {
        String cautruyvan = "Set dateformat dmy "
                + "INSERT INTO [dbo].[Luong] "
                + "           ([MaLuong] "
                + "           ,[MaNV] "
                + "           ,[Luong1Gio] "
                + "           ,[SoGioLam] "
                + "           ,[NgayLam] "
                + "           ,[LuongLamThem] "
                + "           ,[TongLuong1Ngay] "
                + "           ,[MoTa]) "
                + "     VALUES "
                + "           (" + luong.getMaLuong() + " "
                + "           ,'" + luong.getMaNV() + "' "
                + "           ," + luong.getLuong1Gio() + " "
                + "           ," + luong.getSoGioLam() + " "
                + "           ,'" + luong.getNgayLam() + "' "
                + "           ," + luong.getLuongLamThem() + " "
                + "           ," + luong.getTongLuong1Ngay() + " "
                + "           ,N'" + luong.getMoTa() + "')";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static ResultSet GetGhiChu(int MaLuong) {
        String cautruyvan = "Select MoTa from Luong where MaLuong = " + MaLuong + "";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static int Xoa(int MaLuong) {
        String cautruyvan = "delete Luong where MaLuong = " + MaLuong + "";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static int Sua(DTO.DTO_Luong luong) {
        String cautruyvan = "set dateformat dmy "
                + "UPDATE [dbo].[Luong] "
                + "   SET [MaNV] = N'" + luong.getMaNV() + "' "
                + "      ,[Luong1Gio] =" + luong.getLuong1Gio() + " "
                + "      ,[SoGioLam] = " + luong.getSoGioLam() + " "
                + "      ,[NgayLam] = '" + luong.getNgayLam() + "' "
                + "      ,[LuongLamThem] = " + luong.getLuongLamThem() + " "
                + "      ,[TongLuong1Ngay] = " + luong.getTongLuong1Ngay() + " "
                + "      ,[MoTa] = N'" + luong.getMoTa() + "' "
                + " WHERE MaLuong = " + luong.getMaLuong() + "";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static ResultSet Search(String tukhoa) {
        String cautruyvan = " Set dateformat dmy SELECT * from Luong " +
"where [MaNV] like N'%"+tukhoa+"%' " +
//"      or[Luong1Gio] like N'%"+tukhoa+"%' " +
//"      or[SoGioLam] like N'%"+tukhoa+"%' " +
"      or[NgayLam] like N'"+tukhoa+"' " +
//"      or[LuongLamThem] like N'%"+tukhoa+"%' " +
//"      or[TongLuong1Ngay] like N'%"+tukhoa+"%' " +
"      or[MoTa] like N'%"+tukhoa+"%'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet getTongLuongThang(String NgayBD, String NgayKT, String MaNV) {
        String cautruyvan = "set dateformat dmy " +
"SELECT SUM(TongLuong1Ngay) as TongLuong " +
" " +
"FROM Luong   " +
" " +
"WHERE MaNV = '"+MaNV+"' and NgayLam BETWEEN '"+NgayBD+" 00:00:00' AND '"+NgayKT+" 23:59:59'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    
}
