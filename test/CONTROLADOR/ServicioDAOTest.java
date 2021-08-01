/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Servicio;
import java.sql.Connection;
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
public class ServicioDAOTest {
    
    public ServicioDAOTest() {
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
     * Test of registroServicio method, of class ServicioDAO.
     */
    @Test
    public void testRegistroServicio() {
        System.out.println("registroServicio");
        Servicio ser = null;
        ServicioDAO instance = new ServicioDAO();
        boolean expResult = false;
        boolean result = instance.registroServicio(ser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of listarServicios method, of class ServicioDAO.
     */
    @Test
    public void testListarServicios() {
        System.out.println("listarServicios");
        ServicioDAO instance = new ServicioDAO();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.listarServicios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of buscarServicioPorID method, of class ServicioDAO.
     */
    @Test
    public void testBuscarServicioPorID() {
        System.out.println("buscarServicioPorID");
        String nombre = "";
        ServicioDAO instance = new ServicioDAO();
        int expResult = 0;
        int result = instance.buscarServicioPorID(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarServicio method, of class ServicioDAO.
     */
    @Test
    public void testModificarServicio() {
        System.out.println("ModificarServicio");
        Servicio ser = null;
        ServicioDAO instance = new ServicioDAO();
        boolean expResult = false;
        boolean result = instance.ModificarServicio(ser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarServicio method, of class ServicioDAO.
     */
    @Test
    public void testEliminarServicio() {
        System.out.println("EliminarServicio");
        Servicio serr = null;
        ServicioDAO instance = new ServicioDAO();
        boolean expResult = false;
        boolean result = instance.EliminarServicio(serr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxID method, of class ServicioDAO.
     */
    @Test
    public void testGetMaxID() {
        System.out.println("getMaxID");
        Connection con = null;
        ServicioDAO instance = new ServicioDAO();
        int expResult = 0;
        int result = instance.getMaxID(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
}
