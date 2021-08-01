/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DB.Conexion;
import MODELO.Cliente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author pablo
 */
public class ClienteDAO {
    
    
     ResultSet rs; 
    
     public static Connection conexion = null; 
     PreparedStatement ps; 
     private String mensaje= ""; 
     Conexion c = new Conexion();
     Connection con;
    
     
     public ClienteDAO(){
         
         if(conexion == null){
             
             conexion =  new Conexion().obtenerConexion(); 
         }
         
     }
     
     
    public DefaultTableModel listarClientes()
    {
        
        try {
            
             DefaultTableModel tabla = new DefaultTableModel(); 
             tabla.addColumn("Rut");
             tabla.addColumn("Nombre");
             tabla.addColumn("Apellido");
             tabla.addColumn("Correo");
             tabla.addColumn("Direccion");
             tabla.addColumn("Telefono");
             tabla.addColumn("Nombre de Usuario");
             tabla.addColumn("Contraseña");
             
             CallableStatement cstmt = conexion.prepareCall("{ ?  = call  FN_LISTARCLIENTES }");
             
             cstmt.registerOutParameter(1, OracleTypes.CURSOR);
             
              cstmt.execute(); 
              
              ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
              
              String datos[] = new String[8]; 
                
              while(rs.next())
              {
                  
                   datos[0] = rs.getString("rut_cli"); 
                   datos[1] = rs.getString("nombre_cli");
                   datos[2] = rs.getString("apellidos_cli");
                   datos[3] = rs.getString("correo_cli");
                   datos[4] = rs.getString("direccion_cli");
                   datos[5] = String.valueOf(rs.getInt("telefono_cli"));
                   datos[6] = rs.getString("username");
                   datos[7] = rs.getString("pass");
                   
                   tabla.addRow(datos);
                  
              }
              
              return tabla; 
 
        } catch (Exception e) {
            
            return null; 
            
        }
        
        
    }
    
    
    public boolean registroCliente(Cliente cli)
    {
        try {
            
            CallableStatement cstmt = conexion.prepareCall("{ call sp_crearCliente (?,?,?,?,?,?,?,?) }");
            
            
            cstmt.setString(1, cli.getRutClien());
            cstmt.setString(2, cli.getNombreClien());
            cstmt.setString(3, cli.getApellClien());
            cstmt.setString(4, cli.getCorreoClien());
            cstmt.setString(5, cli.getDirecClien());
            cstmt.setInt(6, cli.getTelefonoClien());
            cstmt.setString(7, cli.getUserNameCli());
            cstmt.setString(8, cli.getPassClien());
            
            rs = cstmt.executeQuery(); 
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
        
        return true;
        
    }
    
    public boolean ModificarCliente(Cliente cli)
    {
        
           try {
              
              CallableStatement cstmt = conexion.prepareCall("{ call EditarCliente (?,?,?,?,?,?,?,?) }");
              
              
            cstmt.setString(1, cli.getRutClien());
            cstmt.setString(2, cli.getNombreClien());
            cstmt.setString(3, cli.getApellClien());
            cstmt.setString(4, cli.getCorreoClien());
            cstmt.setString(5, cli.getDirecClien());
            cstmt.setInt(6, cli.getTelefonoClien());
            cstmt.setString(7, cli.getUserNameCli());
            cstmt.setString(8, cli.getPassClien());
              
              rs = cstmt.executeQuery(); 
              
              
          } catch (Exception e) {
              
              JOptionPane.showMessageDialog(null, e);
              
          }
          
          return true; 
      }
    
    public boolean eliminarCLiente(Cliente cli)
    {
        
          try {
              
              CallableStatement cstmt = conexion.prepareCall("{ call ELIMINAR_CLIENTE (?) }");
              
              cstmt.setString(1, cli.getRutClien());
              
              rs = cstmt.executeQuery(); 
              
              
          } catch (Exception e) {
              
                 JOptionPane.showMessageDialog(null, e);
          }
          
          return true; 
          
      }
    
    
    public int buscarClientePorRut(String rut)
    {
        try {
              CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_BUSCARPORRUTCLIENTE(?)}");
              
              //DEFINIR VARIBALE DE ENTRADA(IN)
            cstmt.setString(2, rut);
            
            //DEFINIR VARIABLE DE SALIDA (OUT) 
            
            cstmt.registerOutParameter(1, oracle.jdbc.internal.OracleTypes.NUMBER);
            
            
            cstmt.execute();
            
            int telefono = ((OracleCallableStatement)cstmt).getInt(1); 
            
            return telefono; 
            
            
            
            
        } catch (Exception e) {
            
            return 0; 
        }
        
        
        
    }
        
  }
        
        
    
    

