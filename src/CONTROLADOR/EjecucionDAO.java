/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import static CONTROLADOR.FamiliaDAO.conexion;
import DB.Conexion;
import MODELO.Ejecucion;
import NEGOCIO.ComboMecanicoNombre;
import NEGOCIO.ComboServicioPrecio;
import NEGOCIO.ComboServiciosEjecutar;
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
public class EjecucionDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
      
      public static Connection conexion = null;

    public EjecucionDAO() {
        
          if(conexion == null){
        
            conexion = new Conexion().obtenerConexion();
    
       }
        
        
    }
    
    public DefaultTableModel listarEjecucion()
    {
        try {
            
                DefaultTableModel tabla = new DefaultTableModel(); 
                
                tabla.addColumn("Codigo de Actividad");
                tabla.addColumn("Comentario y producto usado");
                tabla.addColumn("Codigo de la Reserva");
                tabla.addColumn("Costo Total del Servicio");
                tabla.addColumn("Empleado responsable");
                tabla.addColumn("foto prueba");
                
                 
              CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTAREJECUCION }");
              
              cstmt.registerOutParameter(1, OracleTypes.CURSOR);
              
              cstmt.execute(); 
              
              ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
              
              String datos[] = new String[6];
              
                while(rs.next())
              {
                  
                  datos[0] = String.valueOf(rs.getInt("cod_ejecucion")); 
                  datos[1] = rs.getString("comentario");
                  datos[2] = String.valueOf(rs.getInt("reserva_idreserva")); 
                  datos[3] = String.valueOf(rs.getInt("costo_total")); 
                  datos[4] = rs.getString("empleado_rut_empl"); 
                  datos[5] = rs.getString("foto");
                  tabla.addRow(datos);
                  
                  
              }
                
                return tabla; 
            
            
            
        } catch (Exception e) {
            return null; 
        }
    }

      
    public boolean registrarEjecucion(Ejecucion ejc)
    {
        
        try {
               CallableStatement cstmt = conexion.prepareCall("{ call sp_crearEjecucion (?,?,?,?,?,?,?,?) }");
               
               cstmt.setInt(1, ejc.getCodEjecucion()); 
               cstmt.setString(2, ejc.getFechaActividad()); 
               cstmt.setString(3, ejc.getHora()); 
               cstmt.setString(4, ejc.getComentario());
               cstmt.setInt(5, ejc.getIdReserva());
               cstmt.setInt(6, ejc.getCostoTotal());
               cstmt.setString(7, ejc.getRutEmpleado());
               cstmt.setString(8, ejc.getFoto());
               
                  rs = cstmt.executeQuery(); 
                 
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        return true; 
        
    }
    
    
    
    //Trae el codigo de orden a ejecutar en un combobox// 
    public void consultar_codigoOrden(JComboBox cbox_codigo)
    {
         java.sql.Connection conectar = null; 
        String sql = "SELECT idreserva FROM reserva ORDER BY idreserva ASC";
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            PreparedStatement pst = conectar.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            
      
           
            
            
            
            cbox_codigo.addItem("Codigo");
            
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
    
    
     public void consultar_rutEmpleado(JComboBox cbox_empleado)
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
    
     public void consultar_Servicio(JComboBox cbox_servicio){
             
             
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
         
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT cod_servicio, nombre_serv  FROM servicio ORDER BY nombre_serv ASC");
            value = new DefaultComboBoxModel();
            cbox_servicio.setModel(value);
            

            
            while(rs.next()){
                
            // cbox_familia.addItem("Seleccione una familia"); 
             value.addElement(new ComboServiciosEjecutar(rs.getString("cod_servicio"), rs.getString("nombre_serv")));
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
     
     
      public void consultar_ServicioPrecio(JComboBox cbox_servicioPrecio){
             
             
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
         
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT precio_serv, nombre_serv  FROM servicio ORDER BY nombre_serv ASC");
            value = new DefaultComboBoxModel();
            cbox_servicioPrecio.setModel(value);
            

            
            while(rs.next()){
                
            // cbox_familia.addItem("Seleccione una familia"); 
             value.addElement(new ComboServicioPrecio(rs.getString("precio_serv"), rs.getString("nombre_serv")));
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
     
     
         public int getMaxID(Connection con){
         int id = 0; 
         PreparedStatement pst = null; 
         ResultSet rs = null; 
        
         try {
             pst = con.prepareStatement("SELECT MAX(COD_EJECUCION)+1 as id FROM EJECUCION"); 
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
         
      
            public boolean EliminarEjecucion(Ejecucion ej)
   {
       
       try {
           
              CallableStatement cstmt = conexion.prepareCall("{ call ELIMINAR_EJECUCION  (?) }");
              
              cstmt.setInt(1, ej.getCodEjecucion());
              
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
    

