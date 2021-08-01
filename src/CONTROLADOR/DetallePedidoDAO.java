/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import static CONTROLADOR.PedidoDAO.conexion;
import static CONTROLADOR.VehiculoDAO.conexion;
import DB.Conexion;
import MODELO.DetallePedido;
import NEGOCIO.ComboEstado;
import NEGOCIO.ComboProducto;
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
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;

/**
 *
 * @author pablo
 */
public class DetallePedidoDAO {
    
     ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;

    public DetallePedidoDAO() {
        
          if(conexion == null){
             
             conexion = new Conexion().obtenerConexion(); 
         }
        
        
    }
        
    
     public boolean registroDetallePedido(DetallePedido deta)
    {
         try {
            
             CallableStatement cstmt = conexion.prepareCall("{ call sp_crearDetallePedido (?,?,?,?,?,?,?,?,?) }");
             
             cstmt.setInt(1, deta.getCantidad());
             cstmt.setInt(2, deta.getEstado());
             cstmt.setString(3, deta.getComentario());
             cstmt.setInt(4, deta.getPrecioUni());
             cstmt.setInt(5, deta.getTotal());
             cstmt.setInt(6, deta.getIdpedido());
             cstmt.setInt(7, deta.getIdproducto());
             cstmt.setString(8, deta.getRutProveedor());
             cstmt.setString(9, deta.getFechaVencimiento());
             
             
             
             rs = cstmt.executeQuery(); 
             
             
        } catch (Exception e) {
            
              JOptionPane.showMessageDialog(null, e);
            
        }
         
        return true;
 
         
    }
    
     
     public void consultar_producto(JComboBox cbox_producto){
             
             
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
        
        
        try {
            
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT ID_PROD, descripcionproduc  FROM PRODUCTO ORDER BY ID_PROD ASC");
            value = new DefaultComboBoxModel();
            cbox_producto.setModel(value);
            
            
            while(rs.next()){ 
                
                    value.addElement(new ComboProducto(rs.getString("ID_PROD"),rs.getString("DESCRIPCIONPRODUC")));
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
     
      public DefaultTableModel listarDetallePedido()
      {
          
          try {
                  DefaultTableModel tabla = new DefaultTableModel(); 
                
                  tabla.addColumn("Cantidad");
                  tabla.addColumn("Estado Actual");
                  tabla.addColumn("Tipo de Producto");
                  tabla.addColumn("precio por unidad");
                  tabla.addColumn("Total de Compra");
                  tabla.addColumn("Codigo Pedido");
                  tabla.addColumn("Codigo del Producto");
                  tabla.addColumn("Proveedor");
                  tabla.addColumn("fecha Vencimiento Producto");
                 // tabla.addColumn("Fecha de vencimiento");
                  
                  CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTAR_DETALLEPEDIDO }");
                  
                   cstmt.registerOutParameter(1, OracleTypes.CURSOR);
                
                    cstmt.execute(); 
                
                   ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
                
                   String datos[] = new String[9]; 
                   
                   
                   while(rs.next())
                   {
                       datos[0] = String.valueOf(rs.getInt("cantidad"));
                       datos[1] = String.valueOf(rs.getInt("estado"));
                       datos[2] = rs.getString("comentario"); 
                       datos[3] = String.valueOf(rs.getInt("precio_uni")); 
                       datos[4] = String.valueOf(rs.getInt("total")); 
                       datos[5] = String.valueOf(rs.getInt("pedido_id_pedido")); 
                       datos[6] = String.valueOf(rs.getInt("producto_id_prod")); 
                       datos[7] = rs.getString("producto_proveedor_rut_prov"); 
                       datos[8] = rs.getString("fecha_venc"); 
                       
                       tabla.addRow(datos);
                       
                   }
                   
                   return tabla;
               
              
          } catch (Exception e) {
              
              return null;
          }
              
          
          
      }
     
     public boolean ModificarDetallePedido(DetallePedido deta){
       
        try {
           
           CallableStatement cstmt = conexion.prepareCall("{ call EditarDetallePedido (?,?,?,?,?,?,?,?,?) }");
           

             cstmt.setInt(1, deta.getCantidad());
             cstmt.setInt(2, deta.getEstado());
             cstmt.setString(3, deta.getComentario());
             cstmt.setInt(4, deta.getPrecioUni());
             cstmt.setInt(5, deta.getTotal());
             cstmt.setInt(6, deta.getIdpedido());
             cstmt.setInt(7, deta.getIdproducto());
             cstmt.setString(8, deta.getRutProveedor());
             cstmt.setString(9, deta.getFechaVencimiento());
             
             
             
             rs = cstmt.executeQuery(); 
           
           
           
       } catch (Exception e) {
           
           
           JOptionPane.showMessageDialog(null, e);
           
       }
       
       return true;   
   
   }
     
      public void consultar_IDPEDIDO(JComboBox cbox_IDpedido){
             
             
        java.sql.Connection conectar = null; 
        String sql = "SELECT id_pedido FROM pedido ORDER BY id_pedido ASC";
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            PreparedStatement pst = conectar.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            
      
           
            
            
            
          //  cbox_IDpedido.addItem("Seleccione un codigo del pedido");
            
            while(rs.next()){
                
                cbox_IDpedido.addItem(rs.getInt("id_pedido"));      
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
      
       public void consultar_ProveedorNombreDETALLE(JComboBox cbox_proveedorDetalle){
             
             
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
         
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT rut_prov, nombre_pro FROM proveedor ORDER BY rut_prov ASC");
            value = new DefaultComboBoxModel();
            cbox_proveedorDetalle.setModel(value);
            

            
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
       
      /*  public void consultar_estado(JComboBox cbox_estado){
             
             
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
        
        
        try {
            
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT  estado FROM detalle_pedido ORDER BY estado ASC");
            value = new DefaultComboBoxModel();
            cbox_estado.setModel(value);
            
            
            while(rs.next()){ 
                
                    value.addElement(new ComboEstado(rs.getString("estado"), rs.getString("texto")));
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
