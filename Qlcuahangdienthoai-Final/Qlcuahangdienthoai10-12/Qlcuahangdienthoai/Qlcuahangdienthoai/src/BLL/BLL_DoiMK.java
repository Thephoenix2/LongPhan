/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class BLL_DoiMK {
    public static boolean KiemTra(DTO.DTO_DoiMK doiMK){
        ResultSet rs = DAO.DAO_DangNhap.GetUser(doiMK.getTenTK());
        try {
            while(rs.next()){
                if (!rs.getString("MatKhau").equals(doiMK.getMKCu())) {
                    ThongBao.ThongBao("Mật khẩu cũ không đúng", "Thông báo");
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_DoiMK.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (doiMK.getMKMoi().trim().length() < 5) {
            ThongBao.ThongBao("Mật khẩu mới tối thiểu 5 kí tự", "Thông báo");
            return false;
        }
        if (!doiMK.getNhapLaiMK().equals(doiMK.getMKMoi())) {
            ThongBao.ThongBao("Nhập lại mật khẩu không đúng", "Thông báo");
            return false;
        }
        return true;
    }
}
