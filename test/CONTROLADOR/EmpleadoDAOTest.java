/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Empleado;
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
public class EmpleadoDAOTest {
    
    public EmpleadoDAOTest() {
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
     * Test of Loguear method, of class EmpleadoDAO.
     */
    @Test
    public void testLoguear() {
        System.out.println("Loguear");
        String user = "";
        String passw = "";
        EmpleadoDAO instance = new EmpleadoDAO();
        String expResult = "";
        String result = instance.Loguear(user, passw);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of listarEmpleados method, of class EmpleadoDAO.
     */
    @Test
    public void testListarEmpleados() {
        System.out.println("listarEmpleados");
        EmpleadoDAO instance = new EmpleadoDAO();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.listarEmpleados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of registroEmpleado method, of class EmpleadoDAO.
     */
    @Test
    public void testRegistroEmpleado() {
        System.out.println("registroEmpleado");
        Empleado em = null;
        EmpleadoDAO instance = new EmpleadoDAO();
        boolean expResult = false;
        boolean result = instance.registroEmpleado(em);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarEmpleado method, of class EmpleadoDAO.
     */
    @Test
    public void testModificarEmpleado() {
        System.out.println("ModificarEmpleado");
        Empleado em = null;
        EmpleadoDAO instance = new EmpleadoDAO();
        boolean expResult = false;
        boolean result = instance.ModificarEmpleado(em);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarEmpleado method, of class EmpleadoDAO.
     */
    @Test
    public void testEliminarEmpleado() {
        System.out.println("EliminarEmpleado");
        Empleado em = null;
        EmpleadoDAO instance = new EmpleadoDAO();
        boolean expResult = false;
        boolean result = instance.EliminarEmpleado(em);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
}
