/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DB.Conexion;
import MODELO.Producto;
import NEGOCIO.ComboProveedor;
import NEGOCIO.ComboTipoProducto;
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
public class ProductoDAO {
    
     ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;
    
     
     public ProductoDAO(){
         
         if(conexion == null){
             
             conexion =  new Conexion().obtenerConexion(); 
         }
         
     }
    
    
    public DefaultTableModel listarProductos(){
        
       try {
            
                DefaultTableModel tabla = new DefaultTableModel(); 
                
                tabla.addColumn("Codigo");
                tabla.addColumn("Marca");
                tabla.addColumn("Descripcion");
                tabla.addColumn("Precio Compra");
                tabla.addColumn("Stock Producto");
                tabla.addColumn("Stock Critico");
                tabla.addColumn("Precio Venta");
                tabla.addColumn("Fecha Vencimiento");
                tabla.addColumn("Tipo Producto");
                tabla.addColumn("Proveedor");
                tabla.addColumn("Codificacion");
                
            
              CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTAR_PRODUCTO }");
            
               cstmt.registerOutParameter(1, OracleTypes.CURSOR);
              
              cstmt.execute(); 
              
              ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
              
              String datos[] = new String[11]; 
                
              while(rs.next()){
                  
                  datos[0] = String.valueOf(rs.getInt("id_prod")); 
                  datos[1] = rs.getString("marca");
                  datos[2] = rs.getString("descripcionproduc"); 
                  datos[3] = String.valueOf(rs.getInt("preciocompra"));
                  datos[4] = String.valueOf(rs.getInt("stockproduc")); 
                  datos[5] = String.valueOf(rs.getInt("stockcriticoproduc")); 
                  datos[6] = String.valueOf(rs.getInt("precioventaproduc")); 
                  datos[7] = rs.getString("fechavenciproduc");
                  datos[8] = String.valueOf(rs.getInt("tipoproducto_idtipo"));
                  datos[9] = rs.getString("proveedor_rut_prov");
                  datos[10] = rs.getString("codificacion");
                  
                  
                  tabla.addRow(datos);
                  
                  
              }
              
              return tabla; 
            
            
        } catch (Exception e) {
            
            return null; 
            
        }
        
        
   }
    
    public boolean registroProductoNuevo(Producto pro)          
    {
        try {
                CallableStatement cstmt = conexion.prepareCall("{ call sp_crearProducto (?,?,?,?,?,?,?,?,?,?,?) }");
                
                cstmt.setInt(1, pro.getIdPro());
                cstmt.setString(2, pro.getMarcaPro());
                cstmt.setString(3, pro.getDescriPro());
                cstmt.setInt(4, pro.getPrecioCompPro());
                cstmt.setInt(5, pro.getStockPro());
                cstmt.setInt(6, pro.getStockCriPro());
                cstmt.setInt(7, pro.getPrecioVentaPro());
                cstmt.setString(8, pro.getFechaVenciPro());
                cstmt.setInt(9, pro.getTipoPro());
                cstmt.setString(10, pro.getRutProveedor());
                cstmt.setString(11, pro.getCodificacion());
                
                rs = cstmt.executeQuery(); 
  
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
       return true; 
        
    }
    
    public boolean modificarProducto(Producto pro)
    {
        
        try {
            
             CallableStatement cstmt = conexion.prepareCall("{ call EditarProducto (?,?,?,?,?,?,?,?,?,?,?) }");   
             
              
                cstmt.setInt(1, pro.getIdPro());
                cstmt.setString(2, pro.getMarcaPro());
                cstmt.setString(3, pro.getDescriPro());
                cstmt.setInt(4, pro.getPrecioCompPro());
                cstmt.setInt(5, pro.getStockPro());
                cstmt.setInt(6, pro.getStockCriPro());
                cstmt.setInt(7, pro.getPrecioVentaPro());
                cstmt.setString(8, pro.getFechaVenciPro());
                cstmt.setInt(9, pro.getTipoPro());
                cstmt.setString(10, pro.getRutProveedor());
                cstmt.setString(11, pro.getCodificacion());
                
                rs = cstmt.executeQuery(); 
            
            
            
        } catch (Exception e) {
            
                    JOptionPane.showMessageDialog(null, e);
        }
        
        return true; 
        
        
    }
    
    
        public void consultar_TipoProducto(JComboBox cbox_tipoPro){
        
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT idtipo,descripcion FROM tipoproducto ORDER BY idtipo ASC");
            value = new DefaultComboBoxModel();
            cbox_tipoPro.setModel(value);
      
           
            
            
            
           
            
            while(rs.next()){
                
                //cbox_tipoPro.addItem("Seleccione un tipo");
                value.addElement(new ComboTipoProducto(rs.getString("idtipo"),rs.getString("descripcion")));
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
            ResultSet rs = stmt.executeQuery("SELECT rut_prov, rubro_pro FROM proveedor ORDER BY rut_prov ASC");
            value = new DefaultComboBoxModel();
            cbox_Proveedor.setModel(value);
      
           
            
            
            
           
            
            while(rs.next()){
                
                //cbox_tipoPro.addItem("Seleccione un tipo");
                value.addElement(new ComboProveedor(rs.getString("rut_prov"),rs.getString("rubro_pro")));
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
             pst = con.prepareStatement("SELECT MAX(ID_PROD)+1 as id FROM PRODUCTO"); 
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
         
         
 
    
    
    public int buscarPrecioPorMarca(String rut)
    {
        try {
              CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_BUSCARPOOMARCA(?)}");
              
              //DEFINIR VARIBALE DE ENTRADA(IN)
            cstmt.setString(2, rut);
            
            //DEFINIR VARIABLE DE SALIDA (OUT) 
            
            cstmt.registerOutParameter(1, oracle.jdbc.internal.OracleTypes.NUMBER);
            
            
            cstmt.execute();
            
            int precio = ((OracleCallableStatement)cstmt).getInt(1); 
            
            return precio; 
            
            
            
            
        } catch (Exception e) {
            
            return 0; 
        }
        
        
        
    }
 
        
}
