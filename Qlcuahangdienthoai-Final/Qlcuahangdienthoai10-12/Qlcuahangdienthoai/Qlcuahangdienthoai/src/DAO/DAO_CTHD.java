/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author admin
 */
public class DAO_CTHD {
    public static int ThemCTHD(DTO.DTO_CTHD CTHD){
        String cautruyvan = "INSERT INTO [dbo].[ChiTietHoaDon] " +
"           ([MaHD] " +
"           ,[MaSP] " +
"           ,[SoLuong] " +
"           ,[ThanhTien] " +
"           ,[MoTa]) " +
"     VALUES " +
"           ('"+CTHD.getMaHD()+"' " +
"		   ,N'"+CTHD.getMaSP()+"' " +
"           ,"+CTHD.getSoLuong()+" " +
"           ,"+CTHD.getThanhTien()+" " +
"           ,N'"+CTHD.getMoTa()+"')";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }
}
