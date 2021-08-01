/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NEGOCIO;

import CONTROLADOR.FamiliaDAO;
import CONTROLADOR.ProductoDAO;
import CONTROLADOR.TipoProductoDAO;
import DB.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pablo
 */
public class productoNegocio {
    
    private String mensaje = ""; 
    private ProductoDAO sdao = new ProductoDAO();
    private FamiliaDAO fDAO = new FamiliaDAO(); 
    private TipoProductoDAO tpDAO = new TipoProductoDAO();
    
    
         public int getMaxID(){
           
         Connection conn = Conexion.getConnection(); 
         int id = sdao.getMaxID(conn);
         
         try {
             conn.close();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
         
         return id; 
           
       }
         
         public int getMaxFamiliaID(){
           
         Connection conn = Conexion.getConnection(); 
         int id = fDAO.getMaxFamiliaID(conn);
         
         try {
             conn.close();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
         
         return id; 
           
       }
         
        public int getMaxTipoID(){
           
         Connection conn = Conexion.getConnection(); 
         int id = tpDAO.getMaxTipoID(conn);
         
         try {
             conn.close();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
         
         return id; 
           
       }
    
}
