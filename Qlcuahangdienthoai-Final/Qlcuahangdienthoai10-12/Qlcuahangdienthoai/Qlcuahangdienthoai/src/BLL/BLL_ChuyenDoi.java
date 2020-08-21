/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.ThongBao;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class BLL_ChuyenDoi {
 static DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    
    public static Date getDate(String Ngay){
        try {
            return df.parse(Ngay);
        } catch (Exception e) {
            ThongBao.ThongBao("Lỗi ngày", "Thông báo");
        }
        return null;
    }
        //chuyển đổi từ date sang string
    public static String GetDate(Date date){
        return  df.format(date);
    }
 

    
    //Chuyển đổi định dạng số double-->String
    public static String DinhDangSo(double so){
        return NumberFormat.getNumberInstance().format(so);
}
    
    //Chuyển đổi định dạng số String-->double
    public static double ChuyenSangSo(String chuSo){
        try {
            return NumberFormat.getNumberInstance().parse(chuSo).doubleValue();
        } catch (ParseException ex) {
            System.out.println("Lỗi chuyển số");
            return 0;
        }
}
}
