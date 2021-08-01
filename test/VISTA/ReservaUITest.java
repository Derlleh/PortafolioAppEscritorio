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
public class ReservaUITest {
    
    public ReservaUITest() {
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
     * Test of HabilitarGUardarReserva method, of class ReservaUI.
     */
    @Test
    public void testHabilitarGUardarReserva() {
        System.out.println("HabilitarGUardarReserva");
        ReservaUI instance = new ReservaUI();
        instance.HabilitarGUardarReserva();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of cerrar method, of class ReservaUI.
     */
    @Test
    public void testCerrar() {
        System.out.println("cerrar");
        ReservaUI instance = new ReservaUI();
        instance.cerrar();
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarSalida method, of class ReservaUI.
     */
    @Test
    public void testConfirmarSalida() {
        System.out.println("confirmarSalida");
        ReservaUI instance = new ReservaUI();
        instance.confirmarSalida();
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of idMax method, of class ReservaUI.
     */
    @Test
    public void testIdMax() {
        System.out.println("idMax");
        ReservaUI instance = new ReservaUI();
        instance.idMax();
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of LimpiarReserva method, of class ReservaUI.
     */
    @Test
    public void testLimpiarReserva() {
        System.out.println("LimpiarReserva");
        ReservaUI instance = new ReservaUI();
        instance.LimpiarReserva();
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ReservaUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ReservaUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }
    
}
