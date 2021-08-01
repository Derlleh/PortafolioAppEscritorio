/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

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
public class PedidoTest {
    
    public PedidoTest() {
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
     * Test of getIdPedido method, of class Pedido.
     */
    @Test
    public void testGetIdPedido() {
        System.out.println("getIdPedido");
        Pedido instance = new Pedido();
        int expResult = 0;
        int result = instance.getIdPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPedido method, of class Pedido.
     */
    @Test
    public void testSetIdPedido() {
        System.out.println("setIdPedido");
        int idPedido = 0;
        Pedido instance = new Pedido();
        instance.setIdPedido(idPedido);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaPedido method, of class Pedido.
     */
    @Test
    public void testGetFechaPedido() {
        System.out.println("getFechaPedido");
        Pedido instance = new Pedido();
        String expResult = "";
        String result = instance.getFechaPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaPedido method, of class Pedido.
     */
    @Test
    public void testSetFechaPedido() {
        System.out.println("setFechaPedido");
        String fechaPedido = "";
        Pedido instance = new Pedido();
        instance.setFechaPedido(fechaPedido);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripPed method, of class Pedido.
     */
    @Test
    public void testGetDescripPed() {
        System.out.println("getDescripPed");
        Pedido instance = new Pedido();
        String expResult = "";
        String result = instance.getDescripPed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripPed method, of class Pedido.
     */
    @Test
    public void testSetDescripPed() {
        System.out.println("setDescripPed");
        String descripPed = "";
        Pedido instance = new Pedido();
        instance.setDescripPed(descripPed);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getRutEmplea method, of class Pedido.
     */
    @Test
    public void testGetRutEmplea() {
        System.out.println("getRutEmplea");
        Pedido instance = new Pedido();
        String expResult = "";
        String result = instance.getRutEmplea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setRutEmplea method, of class Pedido.
     */
    @Test
    public void testSetRutEmplea() {
        System.out.println("setRutEmplea");
        String rutEmplea = "";
        Pedido instance = new Pedido();
        instance.setRutEmplea(rutEmplea);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of getRutProvee method, of class Pedido.
     */
    @Test
    public void testGetRutProvee() {
        System.out.println("getRutProvee");
        Pedido instance = new Pedido();
        String expResult = "";
        String result = instance.getRutProvee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setRutProvee method, of class Pedido.
     */
    @Test
    public void testSetRutProvee() {
        System.out.println("setRutProvee");
        String rutProvee = "";
        Pedido instance = new Pedido();
        instance.setRutProvee(rutProvee);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }
    
}
