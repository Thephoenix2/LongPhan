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
public class DAO_Quyen {
    public static ResultSet GetAll(){
        String cautruyvan = "select * from Quyen";
        return DAO.DBconnection.Getdata(cautruyvan);
    }
    public static ResultSet GetTheoMa(String MaQuyen){
        String cutruyvan = "Select * from Quyen where MaQuyen = "+MaQuyen+" ";
        return DAO.DBconnection.Getdata(cutruyvan);
    }
}
