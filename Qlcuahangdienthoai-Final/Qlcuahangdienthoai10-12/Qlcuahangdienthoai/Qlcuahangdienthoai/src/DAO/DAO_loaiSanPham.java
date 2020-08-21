/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;

/**
 *
 * @author HuyBQ
 */

public class DAO_loaiSanPham {
    public static ResultSet GetMoTa(String MaloaiSP) {
        String cautruyvan = "Select MoTa from LoaiSP where MaLoaiSP = N'" + MaloaiSP + "' ";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
        public static ResultSet GetLoaiSP_TheoMa(String MaloaiSP){
        String cautruyvan = "Select * from LoaiSP where MaLoaiSP = N'"+MaloaiSP+"' ";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet GetALL() {
        String cautruyvan = "SELECT * FROM [dbo].[LoaiSP]";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet TimKiem(String TimKiem) {
        String cautruyvan = "SELECT * from LoaiSP " +
" where [MaLoaiSP] like N'%"+TimKiem+"%' " +
"      or[TenLoaiSP] like N'%"+TimKiem+"%' ";
        return DAO.DBconnection.Getdata(cautruyvan);
     
    }

    public static int ThemSP(DTO.DTO_LoaiSanPham LoaiSPham) {
        String cautruyvan = "INSERT INTO [dbo].[LoaiSP] "
                + "           ([MaLoaiSP] "
                + "           ,[TenLoaiSP] "
                + "           ,[MoTa]) "
                + "     VALUES "
                + "           (" + LoaiSPham.getMaSP() + " "
                + "           ,N'" + LoaiSPham.getTenSP() + "' "
                + "           ,N'" + LoaiSPham.getGhichu() + "')";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static int SuaSP(DTO.DTO_LoaiSanPham suasp) {
        String cautruyvan = "UPDATE [dbo].[LoaiSP] "
                + "   SET [MaLoaiSP] = " + suasp.getMaSP() + " "
                + "      ,[TenLoaiSP] = '" + suasp.getTenSP() + "' "
                + "      ,[MoTa] = N'" + suasp.getGhichu() + "' "
                + " WHERE MaLoaiSP =" + suasp.getMaSP() + " ";

        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static int XoaSP(String MaSP) {
        String cautruyvan = "DELETE FROM [dbo].[LoaiSP] "
                + "      WHERE MaLoaiSP=" + MaSP + "";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

}
