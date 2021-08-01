/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Proveedor;
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
public class ProveedorDAOTest {
    
    public ProveedorDAOTest() {
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
     * Test of listarProveedores method, of class ProveedorDAO.
     */
    @Test
    public void testListarProveedores() {
        System.out.println("listarProveedores");
        ProveedorDAO instance = new ProveedorDAO();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.listarProveedores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of registroProveedor method, of class ProveedorDAO.
     */
    @Test
    public void testRegistroProveedor() {
        System.out.println("registroProveedor");
        Proveedor prov = null;
        ProveedorDAO instance = new ProveedorDAO();
        boolean expResult = false;
        boolean result = instance.registroProveedor(prov);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarProveedor method, of class ProveedorDAO.
     */
    @Test
    public void testModificarProveedor() {
        System.out.println("ModificarProveedor");
        Proveedor prov = null;
        ProveedorDAO instance = new ProveedorDAO();
        boolean expResult = false;
        boolean result = instance.ModificarProveedor(prov);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarProveedor method, of class ProveedorDAO.
     */
    @Test
    public void testEliminarProveedor() {
        System.out.println("eliminarProveedor");
        Proveedor prov = null;
        ProveedorDAO instance = new ProveedorDAO();
        boolean expResult = false;
        boolean result = instance.eliminarProveedor(prov);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of buscarClientePorRut method, of class ProveedorDAO.
     */
    @Test
    public void testBuscarClientePorRut() {
        System.out.println("buscarClientePorRut");
        String rut = "";
        ProveedorDAO instance = new ProveedorDAO();
        int expResult = 0;
        int result = instance.buscarClientePorRut(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
