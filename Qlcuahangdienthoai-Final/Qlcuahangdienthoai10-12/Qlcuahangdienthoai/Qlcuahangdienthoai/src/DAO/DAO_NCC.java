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
public class DAO_NCC {
    public static ResultSet GetNCC_TheoMa(String MaNCC){
        String cautruyvan = "Select * from NhaCungCap where MaNCC = N'"+MaNCC+"' ";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet GetALL() {
        String cautruyvan = "Select * from NhaCungCap";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet GetMaNCC() {
        String cautruyvan = "Select MaNCC from NhaCungCap";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static int ThemNCC(DTO.DTO_NCC NCC) {
        String cautruyvan = "INSERT INTO [dbo].[NhaCungCap]  "
                + "           ([MaNCC]  "
                + "           ,[TenNCC]  "
                + "           ,[SDT]  "
                + "           ,[Email]  "
                + "           ,[DiaChi]  "
                + "           ,[MoTa])  "
                + "     VALUES  "
                + "           ('" + NCC.getMaNCC() + "'  "
                + "           ,N'" + NCC.getTenNCC() + "'  "
                + "           ,'" + NCC.getSdt() + "'  "
                + "           ,'" + NCC.getEmail() + "'  "
                + "           ,N'" + NCC.getDiachi() + "'  "
                + "           ,N'" + NCC.getGhichu() + "')";
        return DBconnection.ExecuteTruyVan(cautruyvan);
    }

    public static ResultSet GetMoTa(String MaNCC) {
        String cautruyvan = "Select MoTa from NhaCungCap where MaNCC = N'" + MaNCC + "' ";
        return DAO.DBconnection.Getdata(cautruyvan);
    }

    public static int SuaNCC(DTO.DTO_NCC NCC) {
        String cautruyvan = "UPDATE [dbo].[NhaCungCap]  "
                + "   SET   "
                + "      [TenNCC] = N'"+NCC.getTenNCC()+"'  "
                + "      ,[SDT] = '"+NCC.getSdt()+"'  "
                + "      ,[Email] = N'"+NCC.getEmail()+"'  "
                + "      ,[DiaChi] = N'"+NCC.getDiachi()+"'  "
                + "      ,[MoTa] = N'"+NCC.getGhichu()+"'  "
                + " WHERE [MaNCC] = '"+NCC.getMaNCC()+"'";
        return DBconnection.ExecuteTruyVan(cautruyvan);
    }
        public static int XoaNCC(String MaNCC) {
        String cautruyvan = "Delete NhaCungCap where MaNCC = N'" + MaNCC + "' ";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }
            public static ResultSet Search(String tukhoa) {
        String cautruyvan = "SELECT * from NhaCungCap "
                + " where [MaNCC] like N'%" + tukhoa + "%' "
                + "      or[TenNCC] like N'%" + tukhoa + "%' "
                + "      or[DiaChi] like N'%" + tukhoa + "%' "
                + "      or [SDT] like N'%" + tukhoa + "%' "
                + "      or [Email] like N'%" + tukhoa + "%' "
                + "      or [MoTa] like N'%" + tukhoa + "%'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
}
