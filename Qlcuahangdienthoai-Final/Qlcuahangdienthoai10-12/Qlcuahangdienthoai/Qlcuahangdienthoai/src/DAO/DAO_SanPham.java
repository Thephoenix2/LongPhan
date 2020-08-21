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
public class DAO_SanPham {

    public static ResultSet GetMoTa(String MaSP) {
        String cautruyvan = "Select MoTa from SanPham where MaSP = N'" + MaSP + "' ";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet GetALL() {
        String cautruyvan = "Select * from SanPham";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static ResultSet laysptheomasp(int maloaisp) {
        String cautruyvan = "select *from LoaiSP where MaLoaiSP=" + maloaisp + "";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static int ThemSP(DTO.DTO_SanPham SanPham) {
//        System.out.println(SanPham);
        String cautruyvan = "INSERT INTO [dbo].[SanPham] "
                + "           ([MaSP] "
                + "           ,[TenSP] "
                + "           ,[MaLoaiSP] "
                + "           ,[GiaNhap] "
                + "           ,[GiaBan] "
                + "           ,[TonKho] "
                + "           ,[DonViTinh] "
                + "           ,[Hinh] "
                + "           ,[MoTa]) "
                + "     VALUES "
                + "           (N'" + SanPham.getMaSP() + "' "
                + "           ,N'" + SanPham.getTenSP() + "' "
                + "           ,N'" + SanPham.getLoaiSP() + "' "
                + "           ," + SanPham.getGiaNhap() + " "
                + "           ," + SanPham.getGiaBan() + " "
                + "           ," + SanPham.getTonKho() + " "
                + "           ,N'cai' "
                + "           ,N'" + SanPham.getHinh() + "' "
                + "           ,N'" + SanPham.getGhiChu() + "')";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static int suaSP(DTO.DTO_SanPham SanPham) {
        String cautruyvan = "UPDATE [dbo].[SanPham]  "
                + "   SET [TenSP] = N'"+SanPham.getTenSP()+"'  "
                + "      ,[MaLoaiSP] = N'"+SanPham.getLoaiSP()+"'  "
                + "      ,[GiaNhap] = "+SanPham.getGiaNhap()+"  "
                + "      ,[GiaBan] = "+SanPham.getGiaBan()+"  "
                + "      ,[TonKho] = "+SanPham.getTonKho()+"  "
                + "      ,[DonViTinh] = N'"+SanPham.getDonvitinh()+"'  "
                + "      ,[Hinh] = N'"+SanPham.getHinh()+"'  "
                + "      ,[MoTa] = N'"+SanPham.getGhiChu()+"'  "
                + " WHERE MaSP = N'"+SanPham.getMaSP()+"'";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static int XoaSP(String SanPham) {
        String cautruyvan = "DELETE FROM [dbo].[SanPham] "
                + " WHERE MaSP=N'" + SanPham + "'";

        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static ResultSet TimKiem(String TimKiem) {
        String cautruyvan = "SELECT * from SanPham "
                + " where [TenSP] like N'%" + TimKiem + "%' "
                + "      or[MaLoaiSP] like N'%" + TimKiem + "%' ";
        return DAO.DBconnection.Getdata(cautruyvan);

    }

    public static ResultSet getTheoMaSP(String MaSP) {
        String cautruyvan = "select * from SanPham where MaSP = N'" + MaSP + "'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
}
