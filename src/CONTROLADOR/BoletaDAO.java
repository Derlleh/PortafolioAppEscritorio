/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import static CONTROLADOR.VehiculoDAO.conexion;
import DB.Conexion;
import MODELO.Boleta;
import NEGOCIO.TipoPagoNegocio;
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
public class BoletaDAO {
    
     ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;

    public BoletaDAO() {
        
           if(conexion == null){
             
             conexion = new Conexion().obtenerConexion(); 
         }
        
    }
    
      public boolean eliminarBoleta(Boleta bol)
    {
        
          try {
              
              CallableStatement cstmt = conexion.prepareCall("{ call ELIMINAR_BOLETA (?) }");
              
              cstmt.setInt(1, bol.getIddocCompra()); 
              
              rs = cstmt.executeQuery(); 
              
              
          } catch (Exception e) {
              
                 JOptionPane.showMessageDialog(null, e);
          }
          
          return true; 
          
      }
    
    
    public boolean ModificarBoleta(Boleta bol) 
    {
        try {
              
              CallableStatement cstmt = conexion.prepareCall("{ call EditarBoleta(?,?,?,?) }");
              
              
              cstmt.setInt(1, bol.getIddocCompra());
              cstmt.setInt(2, bol.getNeto());
              cstmt.setInt(3, bol.getIva());
              cstmt.setInt(4, bol.getTotal());
              
              rs = cstmt.executeQuery(); 
              
              
          } catch (Exception e) {
              
              JOptionPane.showMessageDialog(null, e);
              
          }
          
          return true; 
      }
    
    
     public DefaultTableModel listarBoleta()
     {
         try {
                 DefaultTableModel tabla = new DefaultTableModel(); 
                 tabla.addColumn("Codigo Boleta");
                 tabla.addColumn("Neto Boleta");
                 tabla.addColumn("Iva Boleta");
                 tabla.addColumn("Total");
             
                  CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTAR_BOLETA }");
                
              cstmt.registerOutParameter(1, OracleTypes.CURSOR);
              
              cstmt.execute(); 
              
              ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
              
              String datos[] = new String[4];
                 
               while(rs.next())  
               {
                   datos[0] = String.valueOf(rs.getInt("ID_DOC_COMPRA"));
                   datos[1] = String.valueOf(rs.getInt("NETO")); 
                   datos[2] = String.valueOf(rs.getInt("IVA")); 
                   datos[3] = String.valueOf(rs.getInt("TOTAL")); 
                   
                    tabla.addRow(datos);
                           
               }
               
               return tabla; 
             
             
         } catch (Exception e) {
             
             return null; 
         }
     }
     
     
     public boolean registroBoleta(Boleta bol)
     {
         try {
             
              CallableStatement cstmt = conexion.prepareCall("{ call sp_crearBoleta (?,?,?,?) }");
              
              cstmt.setInt(1, bol.getIddocCompra());
              cstmt.setInt(2, bol.getNeto());
              cstmt.setInt(3, bol.getIva());
              cstmt.setInt(4, bol.getTotal());
              
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
             pst = con.prepareStatement("SELECT MAX(ID_DOC_COMPRA)+1 as id FROM BOLETA"); 
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
         
          public void consultar_TipoPagoBoleta(JComboBox cbox_tipoPagoBoleta){
             
             
        java.sql.Connection conectar = null; 
        DefaultComboBoxModel value;
         
        
        
        try {
            
            conectar = DB.Conexion.getConnection();
            Statement stmt = conectar.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT codtp,descrip FROM TP_PAGO ORDER BY codtp ASC");
            value = new DefaultComboBoxModel();
            cbox_tipoPagoBoleta.setModel(value);
            

            
            while(rs.next()){
                
            // cbox_familia.addItem("Seleccione una familia"); 
             value.addElement(new TipoPagoNegocio(rs.getString("codtp"),rs.getString("descrip")));
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
