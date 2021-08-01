/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Reserva;
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
public class ReservaDAOTest {
    
    public ReservaDAOTest() {
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
     * Test of regitsrarReserva method, of class ReservaDAO.
     */
    @Test
    public void testRegitsrarReserva() {
        System.out.println("regitsrarReserva");
        Reserva res = null;
        ReservaDAO instance = new ReservaDAO();
        boolean expResult = false;
        boolean result = instance.regitsrarReserva(res);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of consultar_vehiculo method, of class ReservaDAO.
     */
    @Test
    public void testConsultar_vehiculo() {
        System.out.println("consultar_vehiculo");
        JComboBox cbox_vehiculos = null;
        ReservaDAO instance = new ReservaDAO();
        instance.consultar_vehiculo(cbox_vehiculos);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of consultar_cliente method, of class ReservaDAO.
     */
    @Test
    public void testConsultar_cliente() {
        System.out.println("consultar_cliente");
        JComboBox cbox_cliente = null;
        ReservaDAO instance = new ReservaDAO();
        instance.consultar_cliente(cbox_cliente);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of listarReservas method, of class ReservaDAO.
     */
    @Test
    public void testListarReservas() {
        System.out.println("listarReservas");
        ReservaDAO instance = new ReservaDAO();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.listarReservas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxID method, of class ReservaDAO.
     */
    @Test
    public void testGetMaxID() {
        System.out.println("getMaxID");
        Connection con = null;
        ReservaDAO instance = new ReservaDAO();
        int expResult = 0;
        int result = instance.getMaxID(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarVehiculo method, of class ReservaDAO.
     */
    @Test
    public void testEliminarVehiculo() {
        System.out.println("eliminarVehiculo");
        Reserva res = null;
        ReservaDAO instance = new ReservaDAO();
        boolean expResult = false;
        boolean result = instance.eliminarVehiculo(res);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarReserva method, of class ReservaDAO.
     */
    @Test
    public void testModificarReserva() {
        System.out.println("ModificarReserva");
        Reserva res = null;
        ReservaDAO instance = new ReservaDAO();
        boolean expResult = false;
        boolean result = instance.ModificarReserva(res);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
