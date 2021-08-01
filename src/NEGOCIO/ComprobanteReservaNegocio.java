/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NEGOCIO;

import static CONTROLADOR.ProveedorDAO.conexion;
import DB.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author pablo
 */
public class ComprobanteReservaNegocio {
    
     ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;

    public ComprobanteReservaNegocio() {
        
            if(conexion == null){
            
            conexion = new Conexion().obtenerConexion(); 
             }    
    }
    
    
  public DefaultTableModel listarComprobanteReserva()
  {
      
      try {
            DefaultTableModel tabla = new DefaultTableModel();
            tabla.addColumn("Rut Cliente");
            tabla.addColumn("Nombre");
            tabla.addColumn("Apellido");
            tabla.addColumn("Telefono de Contacto");
            tabla.addColumn("Patente Vehiculo");
            tabla.addColumn("Fecha Para Reserva");
            tabla.addColumn("Motivo de Servicio");
            
           CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTARCOMPROBANTE }");
              
              cstmt.registerOutParameter(1, OracleTypes.CURSOR);
              
              cstmt.execute(); 
              
              ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
              
              String datos[] = new String[7]; 
              
              while(rs.next())
              {
                  
                  datos[0] = rs.getString("rut_cli"); 
                  datos[1] = rs.getString("nombre_cli"); 
                  datos[2] = rs.getString("apellidos_cli");
                  datos[3] = String.valueOf(rs.getInt("telefono_cli")); 
                  datos[4] = rs.getString("patente"); 
                  datos[5] = rs.getString("fechareserva"); 
                  datos[6] = rs.getString("motivo_servicio"); 
                  
                  tabla.addRow(datos);
              }
              
              return tabla; 
          
          
      } catch (Exception e) {
          
          return null; 
          
      }
  }
     
    
    
    
}
