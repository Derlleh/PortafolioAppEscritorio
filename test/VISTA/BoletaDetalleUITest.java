/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

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
public class BoletaDetalleUITest {
    
    public BoletaDetalleUITest() {
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
     * Test of cerrar method, of class BoletaDetalleUI.
     */
    @Test
    public void testCerrar() {
        System.out.println("cerrar");
        BoletaDetalleUI instance = new BoletaDetalleUI();
        instance.cerrar();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarSalida method, of class BoletaDetalleUI.
     */
    @Test
    public void testConfirmarSalida() {
        System.out.println("confirmarSalida");
        BoletaDetalleUI instance = new BoletaDetalleUI();
        instance.confirmarSalida();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class BoletaDetalleUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BoletaDetalleUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
}
