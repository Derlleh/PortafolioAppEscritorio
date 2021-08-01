/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import static CONTROLADOR.ServicioDAO.conexion;
import DB.Conexion;
import MODELO.Proveedor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author pablo
 */
public class ProveedorDAO {
    
    
     ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;

    public ProveedorDAO() {
        
        if(conexion == null){
            
            conexion = new Conexion().obtenerConexion(); 
             }
        
       }
    
      public DefaultTableModel listarProveedores()
      {
          
          try {
              
              DefaultTableModel tabla = new DefaultTableModel(); 
              tabla.addColumn("Rut");
              tabla.addColumn("Nombre");
              tabla.addColumn("Apellido");
              tabla.addColumn("Correo");
              tabla.addColumn("Telefono de Contacto");
              tabla.addColumn("Rubro");
              tabla.addColumn("Razon Social");
              
              CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTAR_PROVEEDOR }");
              
              cstmt.registerOutParameter(1, OracleTypes.CURSOR);
              
              cstmt.execute(); 
              
              ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
              
               String datos[] = new String[7]; 
                
               while(rs.next())
                {
                    
                   datos[0] = rs.getString("rut_prov"); 
                   datos[1] = rs.getString("nombre_pro");
                   datos[2] = rs.getString("apellidos_pro");
                   datos[3] = rs.getString("correo_pro");
                   datos[4] = String.valueOf(rs.getInt("telefono_pro"));
                   datos[5] = rs.getString("rubro_pro");
                   datos[6] = rs.getString("razon_social");
                  
                   tabla.addRow(datos);
                    
                 }
               return tabla; 
              
              
              
              
          } catch (Exception e) {
              
              return null; 
          }
      }
      
      
      public boolean registroProveedor(Proveedor prov){
          
          try {
              
              CallableStatement cstmt = conexion.prepareCall("{ call sp_crearProveedor (?,?,?,?,?,?,?) }");
              
              cstmt.setString(1, prov.getRutPro());
              cstmt.setString(2, prov.getNombrePro());
              cstmt.setString(3, prov.getApellidoPro()); 
              cstmt.setString(4, prov.getCorreoPro());
              cstmt.setInt(5, prov.getTelefonoPro());
              cstmt.setString(6, prov.getRubroPro());
              cstmt.setString(7, prov.getRazon());
              
              rs = cstmt.executeQuery(); 
              
              
          } catch (Exception e) {
              
              JOptionPane.showMessageDialog(null, e);
              
          }
          
          return true; 
      }
      
     
      public boolean ModificarProveedor(Proveedor prov)
      {
          
          try {
              
             CallableStatement cstmt = conexion.prepareCall("{ call EditarProveedor  (?,?,?,?,?,?,?) }");
             
              cstmt.setString(1, prov.getRutPro());
              cstmt.setString(2, prov.getNombrePro());
              cstmt.setString(3, prov.getApellidoPro()); 
              cstmt.setString(4, prov.getCorreoPro());
              cstmt.setInt(5, prov.getTelefonoPro());
              cstmt.setString(6, prov.getRubroPro());
              cstmt.setString(7, prov.getRazon());
              
              rs = cstmt.executeQuery(); 
              
             
              
          } catch (Exception e) {
              
              JOptionPane.showMessageDialog(null, e);
          }
          return true; 
          
      }
      
      
      //Eliminar Proveedor// 
      
      public boolean eliminarProveedor(Proveedor prov){
          
       //   ELIMINAR_PROVEDOR 
       
          try {
              
              CallableStatement cstmt = conexion.prepareCall("{ call ELIMINAR_PROVEDOR  (?) }");
              
              cstmt.setString(1, prov.getRutPro());
              
              rs = cstmt.executeQuery(); 
              
              
          } catch (Exception e) {
              
                 JOptionPane.showMessageDialog(null, e);
          }
          
          return true; 
          
      }
      
      
      
        public int buscarClientePorRut(String rut)
    {
        try {
              CallableStatement cstmt = conexion.prepareCall("{ ?  = call  FN_BUSCARPORRUTPROVEE(?)}");
              
              //DEFINIR VARIBALE DE ENTRADA(IN)
            cstmt.setString(2, rut);
            
            //DEFINIR VARIABLE DE SALIDA (OUT) 
            
            cstmt.registerOutParameter(1, oracle.jdbc.internal.OracleTypes.NUMBER);
            
            
            cstmt.execute();
            
            int telefono = ((OracleCallableStatement)cstmt).getInt(1); 
            
            return telefono; 
            
            
            
            
        } catch (Exception e) {
            
            return 0; 
        }
        
        
        
    }
      
        
    }
     
     
    
    

