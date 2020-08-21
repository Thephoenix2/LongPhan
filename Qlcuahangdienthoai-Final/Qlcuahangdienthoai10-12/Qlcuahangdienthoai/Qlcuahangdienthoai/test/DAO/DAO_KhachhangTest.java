/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.DAO_Khachhang.XoaKH;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AD
 */
public class DAO_KhachhangTest {

    private boolean xoaKH;
    private boolean themKH;
    
    public DAO_KhachhangTest() {
    }

    /**
     * Test of GetMoTa method, of class DAO_Khachhang.
     */
    @Test
    public void testGetMoTa() {
    }

    /**
     * Test of GetALL method, of class DAO_Khachhang.
     */
    @Test
    public void testGetALL() {
    }

    /**
     * Test of GetMaKH method, of class DAO_Khachhang.
     */
    @Test
    public void testGetMaKH() {
    }

    /**
     * Test of ThemKH method, of class DAO_Khachhang.
     */
    @Test
    public void testThemKH() {
        System.out.println("themKH");
        String makh="";
        String tenkh="";
        String diachi="";
        String dienthoai="";
        String pass="";
        KhachHangDao instance = new KhachHangDao();
        boolean exResult=false;
        String result=instance.insertKhach(makh,tenkh,diachi,dienthoai,pass);
        assertEquals(exResult, result);
    }

    /**
     * Test of SuaKH method, of class DAO_Khachhang.
     */
    @Test
    public void testSuaKH() {
    }

    /**
     * Test of XoaKH method, of class DAO_Khachhang.
     */
    @Test
    public void testXoaKH() {
        System.out.println("xoaKH");
        String makh="2";
        boolean exResult=false;
        String result="KhachHangDao.xoaKH(makh)";
        assertEquals(exResult, result);
    }

    /**
     * Test of Search method, of class DAO_Khachhang.
     */
    @Test
    public void testSearch() {
    }

    /**
     * Test of getTheoMa method, of class DAO_Khachhang.
     */
    @Test
    public void testGetTheoMa() {
    }
    
}
