/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Minh
 */
public class DAO_CTPN {

    public static int ThemCTPN(DTO.DTO_CTPN CTPN) {
        String cautruyvan = "INSERT INTO [dbo].[ChiTietPhieuNhap] " +
"           ([MaPN] " +
"           ,[MaSP] " +
"           ,[SoLuong] " +
"           ,[TongTien] " +
"           ,[MoTa]) " +
"     VALUES " +
"           ("+CTPN.getMaPN()+" " +
"           ,N'"+CTPN.getMaSP()+"' " +
"           ,"+CTPN.getSoLuong()+" " +
"           ,"+CTPN.getThanhTien()+" " +
"           ,N'"+CTPN.getMoTa()+"')";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }
}
