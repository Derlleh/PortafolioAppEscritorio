/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DB.Conexion;
import MODELO.Familia;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author pablo
 */
public class FamiliaDAO {
    
     ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;

    public FamiliaDAO() {
        
           if(conexion == null){
             
             conexion = new Conexion().obtenerConexion(); 
         }
        
    }
    
     public DefaultTableModel listarFamilia()
     {
         try {
             
               DefaultTableModel tabla = new DefaultTableModel(); 
               
               tabla.addColumn("Codigo Familia");
               tabla.addColumn("Nombre Familia");
             
             
              CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTAR_FAMILIA }");
              
               cstmt.registerOutParameter(1, OracleTypes.CURSOR);
              
              cstmt.execute(); 
              
              ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
              
                 
              String datos[] = new String[2]; 
              
              while(rs.next())
              {
                  
                  datos[0] = String.valueOf(rs.getInt("cod_familia")); 
                  datos[1] = rs.getString("nombre_familia"); 
                  
                  tabla.addRow(datos);
                  
                  
              }
              
              return tabla; 
              
             
         } catch (Exception e) {
             
             return null; 
             
         }
         
     }
     
     
      public int getMaxFamiliaID(Connection con){
         int id = 0; 
         PreparedStatement pst = null; 
         ResultSet rs = null; 
        
         try {
             pst = con.prepareStatement("SELECT MAX(COD_FAMILIA)+1 as id FROM FAMILIA"); 
             rs = pst.executeQuery(); 
             if(rs.next()){
                 id = rs.getInt(1);
             
             }           
             rs.close();
             pst.close();
         } catch (SQLException e) {
             System.out.println("Error al mostrar ID" + e.getMessage());
         }
         return id; 
    }
      
      
      public boolean registroFamilia(Familia fam)
      {
          
          try {
              
               CallableStatement cstmt = conexion.prepareCall("{ call sp_CrearFamilia (?,?) }");
               
               cstmt.setInt(1, fam.getCodFamilia());
               cstmt.setString(2,fam.getNombreFamilia());
               
               rs = cstmt.executeQuery(); 
                  
          } catch (Exception e) {
              
              
              JOptionPane.showMessageDialog(null, e);
              
          }
          
          return true; 
          
          
      }
      
      
      public boolean ModificarFamilia(Familia fam)
      {
          
          try {
              
              CallableStatement cstmt = conexion.prepareCall("{ call EditarFamilia (?,?) }");
              
               cstmt.setInt(1, fam.getCodFamilia());
               cstmt.setString(2,fam.getNombreFamilia());
               
               rs = cstmt.executeQuery(); 
              
              
              
          } catch (Exception e) {
              
              
              JOptionPane.showMessageDialog(null, e);
              
          }
          
          return true;
          
      }
      
      
      public boolean eliminarFamilia(Familia fem)
      {
          
          try {
              
               CallableStatement cstmt = conexion.prepareCall("{ call ELIMINAR_FAMILIA (?) }");
              
                cstmt.setInt(1, fem.getCodFamilia());
                
                rs = cstmt.executeQuery(); 
              
              
          } catch (Exception e) {
              
              JOptionPane.showMessageDialog(null, e);
              
              
          }
          
          return true;    
          
      }
    
    
}
