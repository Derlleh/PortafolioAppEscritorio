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
public class ProductosUITest {
    
    public ProductosUITest() {
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
     * Test of sumaPrecioCompra method, of class ProductosUI.
     */
    @Test
    public void testSumaPrecioCompra() {
        System.out.println("sumaPrecioCompra");
        ProductosUI instance = new ProductosUI();
        int expResult = 0;
        int result = instance.sumaPrecioCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of sumaStockCritico method, of class ProductosUI.
     */
    @Test
    public void testSumaStockCritico() {
        System.out.println("sumaStockCritico");
        ProductosUI instance = new ProductosUI();
        int expResult = 0;
        int result = instance.sumaStockCritico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of sumaStockTotal method, of class ProductosUI.
     */
    @Test
    public void testSumaStockTotal() {
        System.out.println("sumaStockTotal");
        ProductosUI instance = new ProductosUI();
        int expResult = 0;
        int result = instance.sumaStockTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of cerrar method, of class ProductosUI.
     */
    @Test
    public void testCerrar() {
        System.out.println("cerrar");
        ProductosUI instance = new ProductosUI();
        instance.cerrar();
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of btnGraficar method, of class ProductosUI.
     */
    @Test
    public void testBtnGraficar() {
        System.out.println("btnGraficar");
        ProductosUI instance = new ProductosUI();
        instance.btnGraficar();
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarSalida method, of class ProductosUI.
     */
    @Test
    public void testConfirmarSalida() {
        System.out.println("confirmarSalida");
        ProductosUI instance = new ProductosUI();
        instance.confirmarSalida();
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of idMax method, of class ProductosUI.
     */
    @Test
    public void testIdMax() {
        System.out.println("idMax");
        ProductosUI instance = new ProductosUI();
        instance.idMax();
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of ListarProd method, of class ProductosUI.
     */
    @Test
    public void testListarProd() {
        System.out.println("ListarProd");
        ProductosUI instance = new ProductosUI();
        instance.ListarProd();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of HabilitarBotonGuardarPro method, of class ProductosUI.
     */
    @Test
    public void testHabilitarBotonGuardarPro() {
        System.out.println("HabilitarBotonGuardarPro");
        ProductosUI instance = new ProductosUI();
        instance.HabilitarBotonGuardarPro();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of LimpiarProducto method, of class ProductosUI.
     */
    @Test
    public void testLimpiarProducto() {
        System.out.println("LimpiarProducto");
        ProductosUI instance = new ProductosUI();
        instance.LimpiarProducto();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ProductosUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ProductosUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
