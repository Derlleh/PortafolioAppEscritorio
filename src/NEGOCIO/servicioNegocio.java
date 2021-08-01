/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NEGOCIO;

import CONTROLADOR.ServicioDAO;
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

/**
 *
 * @author pablo
 */
public class servicioNegocio {
    
        
    
    private String mensaje = ""; 
    private ServicioDAO sdao = new ServicioDAO();
     
 
    
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
