/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class BLL_DangNhap {

    public static boolean KiemTra(String TenTK, String MatKhau) {
        ResultSet rs = DAO.DAO_DangNhap.GetUser(TenTK);
        try {
            if (!rs.next()) {
                GUI.ThongBao.ThongBao("Tên đăng nhập không tồn tại", "lỗi");
                return false;
            } else {

                if (rs.getString("MatKhau").equals(MatKhau)) {
                    GUI.Frm_Dangnhap.quyen = rs.getString("MaQuyen");
                } else {
                    GUI.ThongBao.ThongBao("Mật khẩu không đúng", "lỗi");
                    return false;
                }
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy dữ liệu", "Thông báo");
        }
        return true;
    }

}
