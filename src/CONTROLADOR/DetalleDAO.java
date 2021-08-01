/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import static CONTROLADOR.VehiculoDAO.conexion;
import DB.Conexion;
import MODELO.Detalle;
import NEGOCIO.ComboDetalleProductoBoleta;
import NEGOCIO.ComboProductoDetalle;
import NEGOCIO.ComboProveedor;
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
public class DetalleDAO {
    
    ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;

    public DetalleDAO() {
        
         if(conexion == null){
             
             conexion = new Conexion().obtenerConexion(); 
         }
        
    }
    
    public DefaultTableModel listarDetalle(){
        
        
        try {
            
               DefaultTableModel tabla = new DefaultTableModel(); 
               tabla.addColumn("Cantidad de Productos");
               tabla.addColumn("Valor Total Productos");
               tabla.addColumn("Codigo del Producto");
               
              CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTARDETALLE }");
                
              cstmt.registerOutParameter(1, OracleTypes.CURSOR);
              
              cstmt.execute(); 
              
              ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
              
                 
              String datos[] = new String[6];
              
              while(rs.next())
              {
                datos[0] = String.valueOf(rs.getInt("cant_produc")); 
                datos[1] = String.valueOf(rs.getInt("valor")); 
                datos[2] = String.valueOf(rs.getInt("producto_id_prod")); 

                  
                tabla.addRow(datos);  
                  
                  
              }
              
              return tabla;     
            
        } catch (Exception e) {
            
            return null; 
        }
        
    }
    
    public boolean registroDetalle(Detalle det)
    {
        try {
            
                CallableStatement cstmt = conexion.prepareCall("{ call sp_crearDetalle (?,?,?,?,?,?,?,?,?,?) }");
                
                cstmt.setInt(1, det.getCantProduc()); 
                cstmt.setInt(2, det.getValor()); 
                cstmt.setInt(3, det.getProducto());
                cstmt.setString(4, det.getProducProveedor());
                cstmt.setInt(5, det.getBoleta()); 
                cstmt.setInt(6, det.getCodServicio());
                cstmt.setInt(7, det.getFactura());
                cstmt.setInt(8, det.getPrecioServicio());
                cstmt.setInt(9, det.getPrecioproducto());
                cstmt.setString(10, det.getFecha());
            
                  rs = cstmt.executeQuery(); 
            
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, e);
            
        }
        
        return true; 
    }
    
    public boolean EliminarDetalle(Detalle de)
   {
       
       try {
           
              CallableStatement cstmt = conexion.prepareCall("{ call ELIMINAR_DETALLE  (?) }");
              
              cstmt.setInt(1, de.getCodServicio());
              
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
            ResultSet rs = stmt.executeQuery("SELECT id_prod, descripcionproduc FROM producto ORDER BY descripcionproduc ASC");
            value = new DefaultComboBoxModel();
            cbox_producto.setModel(value);
            

            
            while(rs.next()){
                
            // cbox_familia.addItem("Seleccione una familia"); 
             value.addElement(new ComboProductoDetalle(rs.getString("id_prod"), rs.getString("descripcionproduc")));
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
     
       public void consultar_Proveedor(JComboBox cbox_Proveedor){
        
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT rut_prov, nombre_pro FROM proveedor ORDER BY rut_prov ASC");
            value = new DefaultComboBoxModel();
            cbox_Proveedor.setModel(value);
      
           
            
            
            
           
            
            while(rs.next()){
                
                //cbox_tipoPro.addItem("Seleccione un tipo");
                value.addElement(new ComboProveedor(rs.getString("rut_prov"),rs.getString("nombre_pro")));
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
            ResultSet rs = stmt.executeQuery("SELECT cod_servicio, nombre_serv FROM servicio ORDER BY cod_servicio ASC");
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
        
          public void consultar_productoValor(JComboBox cbox_productoValor){
         
           java.sql.Connection conectar = null; 
           DefaultComboBoxModel value;
         
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT precioventaproduc, descripcionproduc FROM producto ORDER BY descripcionproduc ASC");
            value = new DefaultComboBoxModel();
            cbox_productoValor.setModel(value);
            

            
            while(rs.next()){
                
            // cbox_familia.addItem("Seleccione una familia"); 
             value.addElement(new ComboDetalleProductoBoleta(rs.getString("precioventaproduc"), rs.getString("descripcicionproduc")));
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
          
           public void consultar_productoEjecucion(JComboBox cbox_productoEjecucion){
         
           java.sql.Connection conectar = null; 
           DefaultComboBoxModel value;
         
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT precioventaproduc, descripcionproduc FROM producto ORDER BY descripcionproduc ASC");
            value = new DefaultComboBoxModel();
            cbox_productoEjecucion.setModel(value);
            

            
            while(rs.next()){
                
            // cbox_familia.addItem("Seleccione una familia"); 
             value.addElement(new ComboDetalleProductoBoleta(rs.getString("precioventaproduc"), rs.getString("descripcionproduc"))); 
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
           
             public void consultar_boleta(JComboBox cbox_boleta){
             
             
        java.sql.Connection conectar = null; 
        String sql = "SELECT id_doc_compra FROM boleta ORDER BY id_doc_compra ASC";
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            PreparedStatement pst = conectar.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            
      
           
            
            
            
          //  cbox_cliente.addItem("Seleccione un Rut");
            
            while(rs.next()){
                
                cbox_boleta.addItem(rs.getString("id_doc_compra"));      
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
