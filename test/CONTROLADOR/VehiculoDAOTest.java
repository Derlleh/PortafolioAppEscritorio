/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Vehiculo;
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
public class VehiculoDAOTest {
    
    public VehiculoDAOTest() {
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
     * Test of listarVehiculos method, of class VehiculoDAO.
     */
    @Test
    public void testListarVehiculos() {
        System.out.println("listarVehiculos");
        VehiculoDAO instance = new VehiculoDAO();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.listarVehiculos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   //     fail("The test case is a prototype.");
    }

    /**
     * Test of registroVehiculo method, of class VehiculoDAO.
     */
    @Test
    public void testRegistroVehiculo() {
        System.out.println("registroVehiculo");
        Vehiculo veh = null;
        VehiculoDAO instance = new VehiculoDAO();
        boolean expResult = false;
        boolean result = instance.registroVehiculo(veh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarVehiculo method, of class VehiculoDAO.
     */
    @Test
    public void testModificarVehiculo() {
        System.out.println("ModificarVehiculo");
        Vehiculo veh = null;
        VehiculoDAO instance = new VehiculoDAO();
        boolean expResult = false;
        boolean result = instance.ModificarVehiculo(veh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarVehiculo method, of class VehiculoDAO.
     */
    @Test
    public void testEliminarVehiculo() {
        System.out.println("eliminarVehiculo");
        Vehiculo veh = null;
        VehiculoDAO instance = new VehiculoDAO();
        boolean expResult = false;
        boolean result = instance.eliminarVehiculo(veh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of consultar_cliente method, of class VehiculoDAO.
     */
    @Test
    public void testConsultar_cliente() {
        System.out.println("consultar_cliente");
        JComboBox cbox_cliente = null;
        VehiculoDAO instance = new VehiculoDAO();
        instance.consultar_cliente(cbox_cliente);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of buscarVehiculoPorPatente method, of class VehiculoDAO.
     */
    @Test
    public void testBuscarVehiculoPorPatente() {
        System.out.println("buscarVehiculoPorPatente");
        String patente = "";
        VehiculoDAO instance = new VehiculoDAO();
        int expResult = 0;
        int result = instance.buscarVehiculoPorPatente(patente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
}
