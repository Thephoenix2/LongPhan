/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTO_HoaDon;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author AD
 */
public class DAO_HoaDonTest {
    
    public DAO_HoaDonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetAllHoaDon() {
        System.out.println("GetAllHoaDon");
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.GetAllHoaDon();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchHD() {
        System.out.println("SearchHD");
        String tukhoa = "";
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.SearchHD(tukhoa);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCountSoHoaDon() {
        System.out.println("CountSoHoaDon");
        String SoHoaDon = "";
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.CountSoHoaDon(SoHoaDon);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetBySoHoaDon() {
        System.out.println("GetBySoHoaDon");
        String SoHoaDon = "";
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.GetBySoHoaDon(SoHoaDon);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAllSP() {
        System.out.println("GetAllSP");
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.GetAllSP();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAllLoaiSP() {
        System.out.println("GetAllLoaiSP");
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.GetAllLoaiSP();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchSP() {
        System.out.println("SearchSP");
        String tukhoa = "";
        String maloai = "";
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.SearchSP(tukhoa, maloai);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchTuKhoa() {
        System.out.println("SearchTuKhoa");
        String tukhoa = "";
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.SearchTuKhoa(tukhoa);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchTheoMaLoaiSP() {
        System.out.println("SearchTheoMaLoaiSP");
        String MaLoaiSP = "";
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.SearchTheoMaLoaiSP(MaLoaiSP);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAllKH() {
        System.out.println("GetAllKH");
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.GetAllKH();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchKH() {
        System.out.println("SearchKH");
        String tukhoa = "";
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.SearchKH(tukhoa);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetKHTheoMa() {
        System.out.println("GetKHTheoMa");
        String MaKH = "";
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.GetKHTheoMa(MaKH);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaHDMax() {
        System.out.println("GetMaHDMax");
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.GetMaHDMax();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThemHD() {
        System.out.println("ThemHD");
        DTO_HoaDon HD = null;
        int expResult = 0;
        int result = DAO_HoaDon.ThemHD(HD);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateSLSP() {
        System.out.println("UpdateSLSP");
        int SLkho = 0;
        int SLban = 0;
        String MaSP = "";
        int expResult = 0;
        int result = DAO_HoaDon.UpdateSLSP(SLkho, SLban, MaSP);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSLSP() {
        System.out.println("getSLSP");
        String MaSP = "";
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.getSLSP(MaSP);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTongTientheoMaKH() {
        System.out.println("getTongTientheoMaKH");
        String MaKH = "";
        ResultSet expResult = null;
        ResultSet result = DAO_HoaDon.getTongTientheoMaKH(MaKH);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateLoaiKH() {
        System.out.println("UpdateLoaiKH");
        String MaKH = "";
        String LoaiKH = "";
        int expResult = 0;
        int result = DAO_HoaDon.UpdateLoaiKH(MaKH, LoaiKH);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
