/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Producto;
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
public class ProductoDAOTest {
    
    public ProductoDAOTest() {
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
     * Test of listarProductos method, of class ProductoDAO.
     */
    @Test
    public void testListarProductos() {
        System.out.println("listarProductos");
        ProductoDAO instance = new ProductoDAO();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.listarProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of registroProductoNuevo method, of class ProductoDAO.
     */
    @Test
    public void testRegistroProductoNuevo() {
        System.out.println("registroProductoNuevo");
        Producto pro = null;
        ProductoDAO instance = new ProductoDAO();
        boolean expResult = false;
        boolean result = instance.registroProductoNuevo(pro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of modificarProducto method, of class ProductoDAO.
     */
    @Test
    public void testModificarProducto() {
        System.out.println("modificarProducto");
        Producto pro = null;
        ProductoDAO instance = new ProductoDAO();
        boolean expResult = false;
        boolean result = instance.modificarProducto(pro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of consultar_TipoProducto method, of class ProductoDAO.
     */
    @Test
    public void testConsultar_TipoProducto() {
        System.out.println("consultar_TipoProducto");
        JComboBox cbox_tipoPro = null;
        ProductoDAO instance = new ProductoDAO();
        instance.consultar_TipoProducto(cbox_tipoPro);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of consultar_Proveedor method, of class ProductoDAO.
     */
    @Test
    public void testConsultar_Proveedor() {
        System.out.println("consultar_Proveedor");
        JComboBox cbox_Proveedor = null;
        ProductoDAO instance = new ProductoDAO();
        instance.consultar_Proveedor(cbox_Proveedor);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxID method, of class ProductoDAO.
     */
    @Test
    public void testGetMaxID() {
        System.out.println("getMaxID");
        Connection con = null;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.getMaxID(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPrecioPorMarca method, of class ProductoDAO.
     */
    @Test
    public void testBuscarPrecioPorMarca() {
        System.out.println("buscarPrecioPorMarca");
        String rut = "";
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.buscarPrecioPorMarca(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
}
