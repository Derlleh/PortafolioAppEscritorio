/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Ejecucion;
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
public class EjecucionDAOTest {
    
    public EjecucionDAOTest() {
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
     * Test of listarEjecucion method, of class EjecucionDAO.
     */
    @Test
    public void testListarEjecucion() {
        System.out.println("listarEjecucion");
        EjecucionDAO instance = new EjecucionDAO();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.listarEjecucion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of registrarEjecucion method, of class EjecucionDAO.
     */
    @Test
    public void testRegistrarEjecucion() {
        System.out.println("registrarEjecucion");
        Ejecucion ejc = null;
        EjecucionDAO instance = new EjecucionDAO();
        boolean expResult = false;
        boolean result = instance.registrarEjecucion(ejc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of consultar_codigoOrden method, of class EjecucionDAO.
     */
    @Test
    public void testConsultar_codigoOrden() {
        System.out.println("consultar_codigoOrden");
        JComboBox cbox_codigo = null;
        EjecucionDAO instance = new EjecucionDAO();
        instance.consultar_codigoOrden(cbox_codigo);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of consultar_rutEmpleado method, of class EjecucionDAO.
     */
    @Test
    public void testConsultar_rutEmpleado() {
        System.out.println("consultar_rutEmpleado");
        JComboBox cbox_empleado = null;
        EjecucionDAO instance = new EjecucionDAO();
        instance.consultar_rutEmpleado(cbox_empleado);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of consultar_Servicio method, of class EjecucionDAO.
     */
    @Test
    public void testConsultar_Servicio() {
        System.out.println("consultar_Servicio");
        JComboBox cbox_servicio = null;
        EjecucionDAO instance = new EjecucionDAO();
        instance.consultar_Servicio(cbox_servicio);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxID method, of class EjecucionDAO.
     */
    @Test
    public void testGetMaxID() {
        System.out.println("getMaxID");
        Connection con = null;
        EjecucionDAO instance = new EjecucionDAO();
        int expResult = 0;
        int result = instance.getMaxID(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
