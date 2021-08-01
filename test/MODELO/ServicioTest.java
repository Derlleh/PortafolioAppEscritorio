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
public class ServicioTest {
    
    public ServicioTest() {
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
     * Test of getCodServicio method, of class Servicio.
     */
    @Test
    public void testGetCodServicio() {
        System.out.println("getCodServicio");
        Servicio instance = new Servicio();
        int expResult = 0;
        int result = instance.getCodServicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setCodServicio method, of class Servicio.
     */
    @Test
    public void testSetCodServicio() {
        System.out.println("setCodServicio");
        int codServicio = 0;
        Servicio instance = new Servicio();
        instance.setCodServicio(codServicio);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreServicio method, of class Servicio.
     */
    @Test
    public void testGetNombreServicio() {
        System.out.println("getNombreServicio");
        Servicio instance = new Servicio();
        String expResult = "";
        String result = instance.getNombreServicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreServicio method, of class Servicio.
     */
    @Test
    public void testSetNombreServicio() {
        System.out.println("setNombreServicio");
        String nombreServicio = "";
        Servicio instance = new Servicio();
        instance.setNombreServicio(nombreServicio);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioServicio method, of class Servicio.
     */
    @Test
    public void testGetPrecioServicio() {
        System.out.println("getPrecioServicio");
        Servicio instance = new Servicio();
        int expResult = 0;
        int result = instance.getPrecioServicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioServicio method, of class Servicio.
     */
    @Test
    public void testSetPrecioServicio() {
        System.out.println("setPrecioServicio");
        int PrecioServicio = 0;
        Servicio instance = new Servicio();
        instance.setPrecioServicio(PrecioServicio);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
