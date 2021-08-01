/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import static CONTROLADOR.ClienteDAO.conexion;
import DB.Conexion;
import MODELO.DetalleReserva;
import NEGOCIO.ComboServiciosEjecutar;
import NEGOCIO.comboDetalleFinal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class DetalleReservaDAO {
    
     
     ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;

    public DetalleReservaDAO() {
        
             if(conexion == null){
             
             conexion =  new Conexion().obtenerConexion(); 
         } 
        
        
    }
    
    public boolean registroDetalleReserva(DetalleReserva detare)
    {
        try {
            
            CallableStatement cstmt = conexion.prepareCall("{ call sp_crear_DetalleReserva2 (?,?,?) }");
            
            cstmt.setInt(1, detare.getCodigoDetalleReserva());
            cstmt.setInt(2, detare.getCodigoReservaD());
            cstmt.setInt(3, detare.getCodigoServicioD());
            
            rs = cstmt.executeQuery(); 
            
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
        
        return true; 
    }
     
     public void consultar_ServicioReserva(JComboBox cbox_servicioReser){
             
             
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
         
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT cod_servicio, nombre_serv  FROM servicio ORDER BY nombre_serv ASC");
            value = new DefaultComboBoxModel();
            cbox_servicioReser.setModel(value);
            

            
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
     
     
     public void consultar_ServicioDetalle(JComboBox cbox_servidetalle){
             
       
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
         
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("select * from detalle_reserva INNER JOIN servicio ON detalle_reserva.servicio_id = servicio.cod_servicio");
            value = new DefaultComboBoxModel();
            cbox_servidetalle.setModel(value);
            

            
            while(rs.next()){
                
            // cbox_familia.addItem("Seleccione una familia"); 
             value.addElement(new comboDetalleFinal(rs.getInt("id_detalle_reserva"), rs.getInt("cod_servicio"), rs.getString("nombre_serv")));
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
