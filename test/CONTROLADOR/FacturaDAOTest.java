/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Factura;
import java.sql.Connection;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo
 */
public class FacturaDAOTest {
    
    public FacturaDAOTest() {
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

    /**
     * Test of listarFactura method, of class FacturaDAO.
     */
    @Test
    public void testListarFactura() {
        System.out.println("listarFactura");
        FacturaDAO instance = new FacturaDAO();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.listarFactura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of registroFactura method, of class FacturaDAO.
     */
    @Test
    public void testRegistroFactura() {
        System.out.println("registroFactura");
        Factura fac = null;
        FacturaDAO instance = new FacturaDAO();
        boolean expResult = false;
        boolean result = instance.registroFactura(fac);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxIDFactura method, of class FacturaDAO.
     */
    @Test
    public void testGetMaxIDFactura() {
        System.out.println("getMaxIDFactura");
        Connection con = null;
        FacturaDAO instance = new FacturaDAO();
        int expResult = 0;
        int result = instance.getMaxIDFactura(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of consultar_TipoPago method, of class FacturaDAO.
     */
    @Test
    public void testConsultar_TipoPago() {
        System.out.println("consultar_TipoPago");
        JComboBox cbox_tipoPago = null;
        FacturaDAO instance = new FacturaDAO();
        instance.consultar_TipoPago(cbox_tipoPago);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
