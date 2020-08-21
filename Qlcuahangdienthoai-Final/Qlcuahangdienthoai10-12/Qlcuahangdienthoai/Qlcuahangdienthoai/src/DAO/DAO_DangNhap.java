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
public class DAO_DangNhap {
    public static ResultSet GetUser(String TenTK){
        String cautruyvan = "select * from TaiKhoan where TenTK = N'"+TenTK+"'";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static int DoiMK(DTO.DTO_DoiMK doiMK){
        String cautruyvan = "UPDATE [dbo].[TaiKhoan]  " +
"   SET [MatKhau] = N'"+doiMK.getMKMoi()+"'  " +
" WHERE TenTK = N'"+doiMK.getTenTK()+"'";
        return DAO.DBconnection.ExecuteTruyVan(cautruyvan);
    }
}
