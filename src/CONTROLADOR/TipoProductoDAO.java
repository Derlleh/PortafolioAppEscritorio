/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DB.Conexion;
import MODELO.TipoProducto;
import NEGOCIO.ComboTipoFamilia;
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
public class TipoProductoDAO {
    
     ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;
    

    public TipoProductoDAO() {
        
            
        if(conexion == null){
            
            conexion = new Conexion().obtenerConexion(); 
          }
        
        
        
    }
    
    
      public void consultar_Familia(JComboBox cbox_familia){
             
             
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
         
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT cod_familia,nombre_familia FROM familia ORDER BY cod_familia ASC");
            value = new DefaultComboBoxModel();
            cbox_familia.setModel(value);
            

            
            while(rs.next()){
                
            // cbox_familia.addItem("Seleccione una familia"); 
             value.addElement(new ComboTipoFamilia(rs.getString("cod_familia"),rs.getString("nombre_familia")));
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
    
        public DefaultTableModel listarTipoProductos()
        {
            try {
                
                     DefaultTableModel tabla = new DefaultTableModel(); 
                     tabla.addColumn("Codigo Tipo de Producto");
                     tabla.addColumn("Descripcion");
                     tabla.addColumn("Familia");
                    
                      CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTAR_TIPOPRODUCTO }");
                
                      cstmt.registerOutParameter(1, OracleTypes.CURSOR);
              
                      cstmt.execute(); 
              
                      ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
              
                 
                      String datos[] = new String[3]; 
                     
                      while(rs.next())
                      {
                           datos[0] = String.valueOf(rs.getInt("IDTIPO")); 
                           datos[1] = rs.getString("Descripcion"); 
                           datos[2] = String.valueOf(rs.getInt("familia_cod_familia"));
                           
                           tabla.addRow(datos);
                      }
                     
                      return tabla; 
                
            } catch (Exception e) {
                
                return null; 
                
                
            }
            
            
            
        }
        
        public boolean registroTipoProducto(TipoProducto tp)
        {
            try {
                
                      CallableStatement cstmt = conexion.prepareCall("{ call sp_CrearTipoProducto (?,?,?) }");
                      
                      cstmt.setInt(1, tp.getIdTipoProducto());
                      cstmt.setString(2, tp.getDescripcionTipo());
                      cstmt.setInt(3, tp.getCodFamilia());
                      
                       rs = cstmt.executeQuery();  
                
                
                
            } catch (Exception e) {
                
                 JOptionPane.showMessageDialog(null, e);
        
            }
            
            return true; 
        }
        
        
        public boolean ModificarTipoProducto(TipoProducto tp)
        {
            
            try {
                
                CallableStatement cstmt = conexion.prepareCall("{ call EditarTipoProducto (?,?,?) }");
                
                 
                 cstmt.setInt(1, tp.getIdTipoProducto());
                 cstmt.setString(2, tp.getDescripcionTipo());
                 cstmt.setInt(3, tp.getCodFamilia());
                      
                 rs = cstmt.executeQuery();  
                
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e);
                
                
            }
            
            return true; 
            
            
        }
        
        public boolean EliminarTipoProducto(TipoProducto tp)
        {
            
            try {
                
                
                  CallableStatement cstmt = conexion.prepareCall("{ call  ELIMINAR_TIPOPRODUCTO  (?) }");
                  
                  cstmt.setInt(1, tp.getIdTipoProducto());
                    
                   rs = cstmt.executeQuery(); 
                
            } catch (Exception e) {
                
                    JOptionPane.showMessageDialog(null, e);
                
            }
            
            return true; 
            
            
        }
    
    
           public int getMaxTipoID(Connection con){
         int id = 0; 
         PreparedStatement pst = null; 
         ResultSet rs = null; 
        
         try {
             pst = con.prepareStatement("SELECT MAX(IDTIPO)+1 as id FROM TIPOPRODUCTO"); 
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
