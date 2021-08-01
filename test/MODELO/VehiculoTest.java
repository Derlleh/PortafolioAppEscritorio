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
public class VehiculoTest {
    
    public VehiculoTest() {
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
     * Test of getPatenteVehi method, of class Vehiculo.
     */
    @Test
    public void testGetPatenteVehi() {
        System.out.println("getPatenteVehi");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getPatenteVehi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setPatenteVehi method, of class Vehiculo.
     */
    @Test
    public void testSetPatenteVehi() {
        System.out.println("setPatenteVehi");
        String patenteVehi = "";
        Vehiculo instance = new Vehiculo();
        instance.setPatenteVehi(patenteVehi);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnoVehi method, of class Vehiculo.
     */
    @Test
    public void testGetAnnoVehi() {
        System.out.println("getAnnoVehi");
        Vehiculo instance = new Vehiculo();
        int expResult = 0;
        int result = instance.getAnnoVehi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setAnnoVehi method, of class Vehiculo.
     */
    @Test
    public void testSetAnnoVehi() {
        System.out.println("setAnnoVehi");
        int annoVehi = 0;
        Vehiculo instance = new Vehiculo();
        instance.setAnnoVehi(annoVehi);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getMarcaVehi method, of class Vehiculo.
     */
    @Test
    public void testGetMarcaVehi() {
        System.out.println("getMarcaVehi");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getMarcaVehi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setMarcaVehi method, of class Vehiculo.
     */
    @Test
    public void testSetMarcaVehi() {
        System.out.println("setMarcaVehi");
        String marcaVehi = "";
        Vehiculo instance = new Vehiculo();
        instance.setMarcaVehi(marcaVehi);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloVehi method, of class Vehiculo.
     */
    @Test
    public void testGetModeloVehi() {
        System.out.println("getModeloVehi");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getModeloVehi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloVehi method, of class Vehiculo.
     */
    @Test
    public void testSetModeloVehi() {
        System.out.println("setModeloVehi");
        String modeloVehi = "";
        Vehiculo instance = new Vehiculo();
        instance.setModeloVehi(modeloVehi);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getColorVehi method, of class Vehiculo.
     */
    @Test
    public void testGetColorVehi() {
        System.out.println("getColorVehi");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getColorVehi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       /// fail("The test case is a prototype.");
    }

    /**
     * Test of setColorVehi method, of class Vehiculo.
     */
    @Test
    public void testSetColorVehi() {
        System.out.println("setColorVehi");
        String colorVehi = "";
        Vehiculo instance = new Vehiculo();
        instance.setColorVehi(colorVehi);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getKilometra method, of class Vehiculo.
     */
    @Test
    public void testGetKilometra() {
        System.out.println("getKilometra");
        Vehiculo instance = new Vehiculo();
        int expResult = 0;
        int result = instance.getKilometra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setKilometra method, of class Vehiculo.
     */
    @Test
    public void testSetKilometra() {
        System.out.println("setKilometra");
        int kilometra = 0;
        Vehiculo instance = new Vehiculo();
        instance.setKilometra(kilometra);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getRutClien method, of class Vehiculo.
     */
    @Test
    public void testGetRutClien() {
        System.out.println("getRutClien");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getRutClien();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setRutClien method, of class Vehiculo.
     */
    @Test
    public void testSetRutClien() {
        System.out.println("setRutClien");
        String RutClien = "";
        Vehiculo instance = new Vehiculo();
        instance.setRutClien(RutClien);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Vehiculo.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Vehiculo instance = new Vehiculo();
        int expResult = 0;
        int result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Vehiculo.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 0;
        Vehiculo instance = new Vehiculo();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
}
