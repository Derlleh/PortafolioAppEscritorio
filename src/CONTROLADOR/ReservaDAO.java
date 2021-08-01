/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DB.Conexion;
import MODELO.Reserva;
import NEGOCIO.ComboMecanicoNombre;
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
public class ReservaDAO {
    
     ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;
     
         public ReservaDAO() {
        
        if(conexion == null){
            
            conexion = new Conexion().obtenerConexion(); 
             }
        
       }
         
        public boolean regitsrarReserva(Reserva res){
           
           try {
               
                 CallableStatement cstmt = conexion.prepareCall("{ call sp_crearReserva (?,?,?,?,?,?,?) }");
                 
                 cstmt.setInt(1, res.getIdReserva());
                 cstmt.setString(2, res.getFechaReserva());
                 cstmt.setString(3, res.getVehiculoPatente());
                 cstmt.setString(4, res.getClienteVehRut());
                 cstmt.setInt(5, res.getEstadoReserv());
                 cstmt.setString(6, res.getHoraReserv());
                 cstmt.setString(7, res.getMecanico());
                 
                 rs = cstmt.executeQuery();
               
               
           } catch (Exception e) {
               
               JOptionPane.showMessageDialog(null, e);
               
           }
           return true;
           
         }
       
         public void consultar_vehiculo(JComboBox cbox_vehiculos){
        
        java.sql.Connection conectar = null; 
        String sql = "SELECT patente FROM vehiculo ORDER BY patente ASC";
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            PreparedStatement pst = conectar.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            
      
           
            
            
            
            cbox_vehiculos.addItem("Seleccione una patente");
            
            while(rs.next()){
                
                cbox_vehiculos.addItem(rs.getString("patente"));      
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
    
         public void consultar_cliente(JComboBox cbox_cliente){
             
             
        java.sql.Connection conectar = null; 
        String sql = "SELECT rut_cli FROM cliente ORDER BY rut_cli ASC";
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            PreparedStatement pst = conectar.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            
      
           
            
            
            
            cbox_cliente.addItem("Seleccione un nombre");
            
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
         
         
      public DefaultTableModel listarReservas(){    
          
          try {
              
            DefaultTableModel tabla = new DefaultTableModel(); 
              
            tabla.addColumn("Codigo de Reserva");
            tabla.addColumn("Fecha de Reserva");
            tabla.addColumn("Patente");
            tabla.addColumn("Rut Cliente");
            tabla.addColumn("estado");
            tabla.addColumn("hora");
            tabla.addColumn("mecanico");
            
            
             CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTARRESERVA  }");
            
             cstmt.registerOutParameter(1, OracleTypes.CURSOR);
              
              cstmt.execute(); 
              
              ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
              
              String datos[] = new String[7]; 
              
              while(rs.next())
              {
                   datos[0] = String.valueOf(rs.getInt("idreserva")); 
                    datos[1] = rs.getString("fechareserva"); 
                        datos[2] = rs.getString("vehiculo_patente"); 
                          datos[3] = rs.getString("vehiculo_cliente_rut_cli"); 
                             datos[4] = String.valueOf(rs.getInt("estado")); 
                                datos[5] = rs.getString("horareserva"); 
                                 datos[6] = rs.getString("mecanico"); 
                                     
                          tabla.addRow(datos); 
              }
              
              return tabla; 
              
              
          } catch (Exception e) {
              
              return null; 
              
          }
          
          
          
      } 
      
      
      
       public int getMaxID(Connection con){
         int id = 0; 
         PreparedStatement pst = null; 
         ResultSet rs = null; 
        
         try {
             pst = con.prepareStatement("SELECT MAX(IDRESERVA)+1 as id FROM RESERVA"); 
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
    
       public boolean eliminarVehiculo(Reserva res){
        
        
          try {
              
              CallableStatement cstmt = conexion.prepareCall("{ call ELIMINAR_RESERVA  (?) }");
              
              cstmt.setInt(1, res.getIdReserva());
              
              rs = cstmt.executeQuery(); 
              
              
          } catch (Exception e) {
              
                 JOptionPane.showMessageDialog(null, e);
          }
          
          return true; 
          
      }
       
       public boolean ModificarReserva(Reserva res)
               
               
               
       {
            try {
               
                 CallableStatement cstmt = conexion.prepareCall("{ call EditarReserva (?,?,?,?,?,?,?) }");
                 
                 cstmt.setInt(1, res.getIdReserva());
                 cstmt.setString(2, res.getFechaReserva());
                 cstmt.setString(3, res.getVehiculoPatente());
                 cstmt.setString(4, res.getClienteVehRut());
                 cstmt.setInt(5, res.getEstadoReserv());
                 cstmt.setString(6, res.getHoraReserv());
                 cstmt.setString(7, res.getMecanico());
                 
                 rs = cstmt.executeQuery();
               
               
           } catch (Exception e) {
               
               JOptionPane.showMessageDialog(null, e);
               
           }
           return true;
           
           
           
           
       }
       
       
        public void consultar_NombreMecanico(JComboBox cbox_NombreMecanico){
             
             
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
         
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT nombre_empl, apellidos_empl FROM empleado ORDER BY nombre_empl ASC");
            value = new DefaultComboBoxModel();
            cbox_NombreMecanico.setModel(value);
            

            
            while(rs.next()){
                
            // cbox_familia.addItem("Seleccione una familia"); 
             value.addElement(new ComboMecanicoNombre(rs.getString("nombre_empl"), rs.getString("apellidos_empl")));
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
    
}
