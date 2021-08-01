/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import static CONTROLADOR.ServicioDAO.conexion;
import DB.Conexion;
import MODELO.Empleado;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author pablo
 */
public class EmpleadoDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
      
      public static Connection conexion = null;

 public EmpleadoDAO() {
     
        if(conexion == null){
        
            conexion = new Conexion().obtenerConexion();
    
       }
   }
 
 //Metodo Login// 
 
    public String Loguear(String user, String passw){
        
         String rolusuario="";
        //String sql = "Select rolusuario FROM USUARIO WHERE nombre_usuario = LOWER('"+user+"') AND password = lower('"+pass+"')";
        String sql = "Select rolusuario FROM Empleado WHERE username = ('"+user+"') AND adm_util.decryptor(pass) = '"+passw+"'";
        try{
            con = c.obtenerConexion();
            ps = con.prepareStatement(sql); 
            rs = ps.executeQuery();

            while(rs.next()){                    
                rolusuario = rs.getString(1);
            }
            con.close();
        } catch(Exception e){

        System.out.println("error");
        
        
       }
         return rolusuario; 
 
    }
    
    
   public DefaultTableModel listarEmpleados(){
       
       try {
           
            DefaultTableModel tabla = new DefaultTableModel(); 
            
            tabla.addColumn("Rut");
            tabla.addColumn("Nombre");
            tabla.addColumn("Apellido");
            tabla.addColumn("Direccion");
            tabla.addColumn("Telefono");
            tabla.addColumn("Correo");
            tabla.addColumn("Cargo");
            tabla.addColumn("Rol");
            tabla.addColumn("Contraseña");
            tabla.addColumn("Nombre Usuario");
            
            CallableStatement cstmt = conexion.prepareCall("{ ?  = call FN_LISTAREMPLEADOS  }");
            
             cstmt.registerOutParameter(1, OracleTypes.CURSOR);
              
              cstmt.execute(); 
              
              ResultSet rs = ((OracleCallableStatement)cstmt).getCursor(1); 
              
               String datos[] = new String[10]; 
               
               while(rs.next()){
                   
                    datos[0] = rs.getString("rut_empl");
                    datos[1] = rs.getString("nombre_empl"); 
                    datos[2] = rs.getString("apellidos_empl"); 
                    datos[3] = rs.getString("direccion_empl"); 
                    datos[4] = String.valueOf(rs.getInt("telefono_empl"));
                    datos[5] = rs.getString("correo_empl"); 
                    datos[6] = rs.getString("cargo_empl"); 
                    datos[7] = rs.getString("rol"); 
                    datos[8] = rs.getString("pass"); 
                    datos[9] = rs.getString("username");
                    
                    tabla.addRow(datos);
                   
               }
               
               return tabla; 
           
       } catch (Exception e) {
           
           return null; 
       }
       
       
   }
   
   public boolean registroEmpleado(Empleado em)
   {
       try {
           
           CallableStatement cstmt = conexion.prepareCall("{ call sp_crearEmpleado (?,?,?,?,?,?,?,?,?,?) }");
           
           cstmt.setString(1, em.getRutEm());
           cstmt.setString(2, em.getNomEm());
           cstmt.setString(3, em.getApellEm());
           cstmt.setString(4, em.getDirEm());
           cstmt.setInt(5, em.getTelefoEm());
           cstmt.setString(6, em.getCorreoEm());
           cstmt.setString(7, em.getCargoEm());
           cstmt.setString(8, em.getRolEm());
           cstmt.setString(9, em.getPassEm());
           cstmt.setString(10, em.getUsernameEm());
           
           rs = cstmt.executeQuery(); 
           
           
           
       } catch (Exception e) {
           
           
           JOptionPane.showMessageDialog(null, e);
           
       }
       
       return true;   
       
   }
   
   
   public boolean ModificarEmpleado(Empleado em){
       
        try {
           
           CallableStatement cstmt = conexion.prepareCall("{ call EditarEmpleado (?,?,?,?,?,?,?,?,?,?) }");
           
           cstmt.setString(1, em.getRutEm());
           cstmt.setString(2, em.getNomEm());
           cstmt.setString(3, em.getApellEm());
           cstmt.setString(4, em.getDirEm());
           cstmt.setInt(5, em.getTelefoEm());
           cstmt.setString(6, em.getCorreoEm());
           cstmt.setString(7, em.getCargoEm());
           cstmt.setString(8, em.getRolEm());
           cstmt.setString(9, em.getPassEm());
           cstmt.setString(10, em.getUsernameEm());
           
           rs = cstmt.executeQuery(); 
           
           
           
       } catch (Exception e) {
           
           
           JOptionPane.showMessageDialog(null, e);
           
       }
       
       return true;   
   
   }
   
   
   public boolean EliminarEmpleado(Empleado em)
   {
       
       try {
           
              CallableStatement cstmt = conexion.prepareCall("{ call ELIMINAR_EMPLEADO  (?) }");
              
              cstmt.setString(1, em.getRutEm()); 
              
              rs = cstmt.executeQuery(); 
           
           
       } catch (Exception e) {
           
                JOptionPane.showMessageDialog(null, e);
           
           
       }
           
           return true; 
           
           
       }
       
   }
    
 
    
    

