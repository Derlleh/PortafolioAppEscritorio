/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Boleta;
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
public class BoletaDAOTest {
    
    public BoletaDAOTest() {
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
     * Test of listarBoleta method, of class BoletaDAO.
     */
    @Test
    public void testListarBoleta() {
        System.out.println("listarBoleta");
        BoletaDAO instance = new BoletaDAO();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.listarBoleta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of registroBoleta method, of class BoletaDAO.
     */
    @Test
    public void testRegistroBoleta() {
        System.out.println("registroBoleta");
        Boleta bol = null;
        BoletaDAO instance = new BoletaDAO();
        boolean expResult = false;
        boolean result = instance.registroBoleta(bol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxID method, of class BoletaDAO.
     */
    @Test
    public void testGetMaxID() {
        System.out.println("getMaxID");
        Connection con = null;
        BoletaDAO instance = new BoletaDAO();
        int expResult = 0;
        int result = instance.getMaxID(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of consultar_TipoPagoBoleta method, of class BoletaDAO.
     */
    @Test
    public void testConsultar_TipoPagoBoleta() {
        System.out.println("consultar_TipoPagoBoleta");
        JComboBox cbox_tipoPagoBoleta = null;
        BoletaDAO instance = new BoletaDAO();
        instance.consultar_TipoPagoBoleta(cbox_tipoPagoBoleta);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
}
