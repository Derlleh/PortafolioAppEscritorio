/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DB.Conexion;
import MODELO.Servicio;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;

/**
 *
 * @author pablo
 */
public class ServicioDAO {
    
     ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;
    
    
    public ServicioDAO(){
    
    if(conexion == null){
        
            conexion = new Conexion().obtenerConexion();
    
        }
     }
    
    //Registro de un servicio// 
    
    public boolean registroServicio(Servicio ser)
    {
        
        try {
                          
                CallableStatement cstmt = conexion.prepareCall("{ call sp_crearServicio (?,?,?) }");
                
                cstmt.setInt(1, ser.getCodServicio()); 
                cstmt.setString(2, ser.getNombreServicio());
                cstmt.setInt(3, ser.getPrecioServicio());
              
                
              
                
                rs = cstmt.executeQuery(); 
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
        
       return true;
    }
    
    
    public DefaultTableModel listarServicios(){
        
            try {
                
                DefaultTableModel tabla = new DefaultTableModel(); 
                
                tabla.addColumn("Codigo de servicio");
                tabla.addColumn("Nombre de Servicio");
                tabla.addColumn("Precio");
         
                
                CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTAR_SERVICIO }");
                
                cstmt.registerOutParameter(1, OracleTypes.CURSOR);
                
                cstmt.execute(); 
                
                ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
                
                String datos[] = new String[3]; 
                
                while(rs.next())
                {
                    
                   datos[0] = String.valueOf(rs.getInt("cod_servicio"));
                   datos[1] = rs.getString("nombre_serv");
                   datos[2] = String.valueOf(rs.getInt("precio_serv"));
                 
                           
              
                   tabla.addRow(datos);
                    
                 }
                
               return tabla; 
                
            
        } catch (Exception e) {
            
            return null; 
            
        }
      }
    
    public int buscarServicioPorID(String nombre)
            {
        try {
            CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_BUSCARPORNOMBRESERVICIO(?)}");
            
            //DEFINIR VARIBALE DE ENTRADA(IN)
            cstmt.setString(2, nombre);
            
            //DEFINIR VARIABLE DE SALIDA (OUT) 
            
            cstmt.registerOutParameter(1, OracleTypes.NUMBER);
            
            
            cstmt.execute();
            
            int precio = ((OracleCallableStatement)cstmt).getInt(1); 
            
            return precio; 
            
            
            
        } catch (Exception e) {
            return 0; 
        }
            }
    
    public boolean ModificarServicio(Servicio ser)
                    
    {
        try {
            CallableStatement cstmt = conexion.prepareCall("{ call EditarServ (?,?,?) }");
            
                cstmt.setInt(1, ser.getCodServicio()); 
                cstmt.setString(2, ser.getNombreServicio());
                cstmt.setInt(3, ser.getPrecioServicio());
                
            
            rs = cstmt.executeQuery(); 
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, e);
        }
        
        return true; 
        
    }
    
            
     public boolean EliminarServicio(Servicio serr){
         
         try {
             
              CallableStatement cstmt = conexion.prepareCall("{ call ELIMINAR_SERVICIO (?) }");
              
              cstmt.setInt(1, serr.getCodServicio());
              
              rs = cstmt.executeQuery(); 
             
             
             
             
         } catch (Exception e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
         
         return true; 
         
     }
         
     
            
         public int getMaxID(Connection con){
         int id = 0; 
         PreparedStatement pst = null; 
         ResultSet rs = null; 
        
         try {
             pst = con.prepareStatement("SELECT MAX(COD_SERVICIO)+1 as id FROM SERVICIO"); 
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
         
     /*   public void consultar_rutEmpleado(JComboBox cbox_empleado)
    {
         java.sql.Connection conectar = null; 
        String sql = "SELECT rut_empl FROM empleado ORDER BY rut_empl ASC";
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            PreparedStatement pst = conectar.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            
      
           
            
            
            
            cbox_empleado.addItem("seleccionar empleado");
            
            while(rs.next()){
                
                cbox_empleado.addItem(rs.getString("rut_empl"));      
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
             
                
    public void consultar_codigoOrden(JComboBox cbox_codigo)
    {
         java.sql.Connection conectar = null; 
        String sql = "SELECT idreserva FROM reserva ORDER BY idreserva ASC";
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            PreparedStatement pst = conectar.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            
      
           
            
            
            
            cbox_codigo.addItem("seleccionar codigo reserva");
            
            while(rs.next()){
                
                cbox_codigo.addItem(rs.getString("idreserva"));      
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
             
    
    
         
    public DefaultTableModel listarServiciosRealizados(){
        
            try {
                
                DefaultTableModel tabla = new DefaultTableModel(); 
                
                tabla.addColumn("Codigo de reserva Personal");                
                tabla.addColumn("Fecha Actividad");
                tabla.addColumn("valor del servicio realizado");
                tabla.addColumn("Comentario del servicio realizado");
                tabla.addColumn("Codigo de trabajo");
             
                
                CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTAR_SERVICIOREALIZADO }");
                
                cstmt.registerOutParameter(1, OracleTypes.CURSOR);
                
                cstmt.execute(); 
                
                ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
                
                String datos[] = new String[5]; 
                
                while(rs.next())
                {
                    
                   datos[0] = String.valueOf(rs.getInt("reserva_idreserva"));
                   datos[1] = rs.getString("fecha_actividad");
                   datos[2] = String.valueOf(rs.getInt("costo_total")); 
                   datos[3] = rs.getString("comentario"); 
                   datos[4] = String.valueOf(rs.getInt("id_serv"));
                           
              
                   tabla.addRow(datos);
                    
                 }
                
               return tabla; 
                
            
        } catch (Exception e) {
            
            return null; 
            
        }
      }
    
    
     public void consultar_ReservaServicioRealizado(JComboBox cbox_reservaS)
    {
         java.sql.Connection conectar = null; 
        String sql = "SELECT idreserva FROM reserva ORDER BY idreserva ASC";
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            PreparedStatement pst = conectar.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            
      
           
            
            
            
            cbox_reservaS.addItem("seleccionar codigo reserva");
            
            while(rs.next()){
                
                cbox_reservaS.addItem(rs.getString("idreserva"));      
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
    
   */          
 }
             
   
    

