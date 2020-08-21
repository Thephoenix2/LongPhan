/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class DAO_DangNhapTest {
    
    public DAO_DangNhapTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of GetUser method, of class DAO_DangNhap.
     */
    @Test
    public void testGetUser() {
        System.out.println("GetUser");
        String TenTK="admin2";
        String MatkhauTK="admin2";
        ResultSet exResult = null;        
        ResultSet Result = Dao_Dangnhap.GetUser(TenTK);        
    }

    /**
     * Test of DoiMK method, of class DAO_DangNhap.
     */
    @Test
    public void testDoiMK() {
    }
    
}
