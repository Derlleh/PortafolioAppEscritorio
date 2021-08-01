/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Cliente;
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
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
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
     * Test of listarClientes method, of class ClienteDAO.
     */
    @Test
    public void testListarClientes() {
        System.out.println("listarClientes");
        ClienteDAO instance = new ClienteDAO();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.listarClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of registroCliente method, of class ClienteDAO.
     */
    @Test
    public void testRegistroCliente() {
        System.out.println("registroCliente");
        Cliente cli = null;
        ClienteDAO instance = new ClienteDAO();
        boolean expResult = false;
        boolean result = instance.registroCliente(cli);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarCliente method, of class ClienteDAO.
     */
    @Test
    public void testModificarCliente() {
        System.out.println("ModificarCliente");
        Cliente cli = null;
        ClienteDAO instance = new ClienteDAO();
        boolean expResult = false;
        boolean result = instance.ModificarCliente(cli);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarCLiente method, of class ClienteDAO.
     */
    @Test
    public void testEliminarCLiente() {
        System.out.println("eliminarCLiente");
        Cliente cli = null;
        ClienteDAO instance = new ClienteDAO();
        boolean expResult = false;
        boolean result = instance.eliminarCLiente(cli);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of buscarClientePorRut method, of class ClienteDAO.
     */
    @Test
    public void testBuscarClientePorRut() {
        System.out.println("buscarClientePorRut");
        String rut = "";
        ClienteDAO instance = new ClienteDAO();
        int expResult = 0;
        int result = instance.buscarClientePorRut(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
}
