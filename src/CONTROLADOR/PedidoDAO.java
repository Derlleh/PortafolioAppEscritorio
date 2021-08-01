/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import static CONTROLADOR.VehiculoDAO.conexion;
import DB.Conexion;
import MODELO.Pedido;
import NEGOCIO.ComboProveedorRutNom;
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
public class PedidoDAO {
    
     ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;

    public PedidoDAO() {
        
             if(conexion == null){
             
             conexion = new Conexion().obtenerConexion(); 
         }
        
        
    
             
    }
    
   
    
    public boolean registroPedido(Pedido ped)
    {
         try {
            
             CallableStatement cstmt = conexion.prepareCall("{ call sp_crearPedido (?,?,?,?,?) }");
             
             cstmt.setInt(1, ped.getIdPedido());
             cstmt.setString(2, ped.getFechaPedido());
             cstmt.setString(3, ped.getDescripPed());
             cstmt.setString(4, ped.getRutEmplea());
             cstmt.setString(5, ped.getRutProvee());
             
             rs = cstmt.executeQuery(); 
             
             
        } catch (Exception e) {
            
              JOptionPane.showMessageDialog(null, e);
            
        }
         
        return true;
 
         
    }
    
    
     public void consultar_empleado(JComboBox cbox_empleado){
             
             
        java.sql.Connection conectar = null; 
        String sql = "SELECT rut_empl FROM empleado ORDER BY rut_empl ASC";
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            PreparedStatement pst = conectar.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            
      
           
            
            
            
            cbox_empleado.addItem("Seleccione un empleado");
            
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
     
      public void consultar_ProveedorNombre(JComboBox cbox_proveedor){
             
             
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
         
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT rut_prov, nombre_pro FROM proveedor ORDER BY rut_prov ASC");
            value = new DefaultComboBoxModel();
            cbox_proveedor.setModel(value);
            

            
            while(rs.next()){
                
            // cbox_familia.addItem("Seleccione una familia"); 
             value.addElement(new ComboProveedorRutNom(rs.getString("rut_prov"),rs.getString("nombre_pro")));
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
             pst = con.prepareStatement("SELECT MAX(ID_PEDIDO)+1 as id FROM PEDIDO"); 
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
}
