/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NEGOCIO;

import CONTROLADOR.ReservaDAO;
import DB.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author pablo
 */
public class reservaNegocio {
    
      private ReservaDAO sdao = new ReservaDAO();
    
    
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
    
}
