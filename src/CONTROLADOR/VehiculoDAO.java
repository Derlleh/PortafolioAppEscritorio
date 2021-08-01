/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DB.Conexion;
import MODELO.Vehiculo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author pablo
 */
public class VehiculoDAO {
    
     ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;
    
     
     public VehiculoDAO(){
         
         if(conexion == null){
             
             conexion = new Conexion().obtenerConexion(); 
         }
         
     }
     
     public DefaultTableModel listarVehiculos()
     {
         try {
             
                DefaultTableModel tabla = new DefaultTableModel(); 
                tabla.addColumn("Patente");
                tabla.addColumn("Año");
                tabla.addColumn("Marca");
                tabla.addColumn("Modelo");
                tabla.addColumn("Color");
                tabla.addColumn("Kilometraje");
                tabla.addColumn("Rut Dueño Actual");
                tabla.addColumn("Estado");
                
              CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTARVEHICULOS }");
                
              cstmt.registerOutParameter(1, OracleTypes.CURSOR);
              
              cstmt.execute(); 
              
              ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
              
                 
              String datos[] = new String[8]; 
              
              while(rs.next())
              {
                  
                  datos[0] = rs.getString("patente"); 
                  datos[1] = rs.getString("anno");
                  datos[2] = rs.getString("marca");
                  datos[3] = rs.getString("modelo");
                  datos[4] = rs.getString("color");                  
                  datos[5] = String.valueOf(rs.getInt("kilometraje"));
                  datos[6] = rs.getString("cliente_rut_cli");
                  datos[7] = String.valueOf(rs.getInt("estado"));
                  
                  tabla.addRow(datos);
                  
              }
             
              return tabla; 
         } catch (Exception e) {
             
             
             return null; 
         }
     }
    
             
    public boolean registroVehiculo(Vehiculo veh){
        
        try {
            
             CallableStatement cstmt = conexion.prepareCall("{ call sp_crearVehiculo (?,?,?,?,?,?,?,?) }");
             
             cstmt.setString(1, veh.getPatenteVehi());
             cstmt.setInt(2, veh.getAnnoVehi());
             cstmt.setString(3, veh.getMarcaVehi());
             cstmt.setString(4, veh.getModeloVehi());
             cstmt.setString(5, veh.getColorVehi());
             cstmt.setInt(6, veh.getKilometra());
             cstmt.setString(7, veh.getRutClien());
             cstmt.setInt(8, veh.getEstado());
             
             rs = cstmt.executeQuery(); 
  
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        
            
        }
        
        return true; 
        
        
        
    }  
    
    
    public boolean ModificarVehiculo(Vehiculo veh){
        
           try {
            
             CallableStatement cstmt = conexion.prepareCall("{ call EditarVehiculo (?,?,?,?,?,?,?,?) }");
             
             cstmt.setString(1, veh.getPatenteVehi());
             cstmt.setInt(2, veh.getAnnoVehi());
             cstmt.setString(3, veh.getMarcaVehi());
             cstmt.setString(4, veh.getModeloVehi());
             cstmt.setString(5, veh.getColorVehi());
             cstmt.setInt(6, veh.getKilometra());
             cstmt.setString(7, veh.getRutClien());
             cstmt.setInt(8, veh.getEstado());
             
             rs = cstmt.executeQuery(); 
  
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        
            
        }
        
        return true; 
                
    }
    
    public boolean eliminarVehiculo(Vehiculo veh){
        
        
          try {
              
              CallableStatement cstmt = conexion.prepareCall("{ call ELIMINAR_VEHICULO  (?) }");
              
              cstmt.setString(1, veh.getPatenteVehi());
              
              rs = cstmt.executeQuery(); 
              
              
          } catch (Exception e) {
              
                 JOptionPane.showMessageDialog(null, e);
          }
          
          return true; 
          
      }
    
    public void consultar_cliente(JComboBox cbox_cliente){
             
             
        java.sql.Connection conectar = null; 
        String sql = "SELECT rut_cli FROM cliente ORDER BY rut_cli ASC";
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            PreparedStatement pst = conectar.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            
      
           
            
            
            
          //  cbox_cliente.addItem("Seleccione un Rut");
            
            while(rs.next()){
                
                cbox_cliente.addItem(rs.getString("rut_cli"));      
            }          
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e);
        
        }finally{
            
            if(conectar!=null){
                
                
                try {
                    conectar.close();
                } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex);
                }
                
            }
            
            
            
        }
        
        }
       
       
    public int buscarVehiculoPorPatente(String patente)
        {
            try {
                  CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_BUSCARPORPATENTE(?)}");
                    
                   cstmt.setString(2, patente);
                   
                   
             cstmt.registerOutParameter(1, oracle.jdbc.internal.OracleTypes.NUMBER);
            
            
            cstmt.execute();
            
            int anno = ((OracleCallableStatement)cstmt).getInt(1); 
            
            return anno; 
            
                
                
            } catch (Exception e) {
                
                return 0; 
            }
            
            
        }
       
       
 /*  public void consultar_EstadoVehiculo(JComboBox cbox_estadoVeh){
        
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT estado FROM Vehiculo ORDER BY estado ASC");
            value = new DefaultComboBoxModel();
            cbox_estadoVeh.setModel(value);
            
      
           
            
            
            
            
            
            while(rs.next()){
                
                
                value.addElement(new ComboEstadoVehiculo(rs.getString("estado")));
                
                
            }          
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e);
        
        }finally{
            
            if(conectar!=null){
                
                
                try {
                    conectar.close();
                } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex);
                }
                
            }
            
            
            
         }   
        
         } */
    
        
    }
          
    
    

    
    
    
        
    
    

