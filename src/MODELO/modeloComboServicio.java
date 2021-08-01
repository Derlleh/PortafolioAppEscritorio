/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import DB.Conexion;
import static VISTA.ComboBoxUno.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author pablo
 */
public class modeloComboServicio {
    
    private int id; 
    private String nombre; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String toString() {
        return this.nombre;
    }
    
    public Vector<modeloComboServicio>mostrarServicios()
    {
             {
        
          if(conexion == null){
        
            conexion = new Conexion().obtenerConexion();
    
       }
        
        
    }
            Vector<modeloComboServicio> datos = new Vector<modeloComboServicio>(); 
            modeloComboServicio dat = null; 
             
           try {
            java.sql.Connection conectar = null; 
            String sql = "SELECT * FROM servicio";
            conectar = DB.Conexion.getConnection();
            PreparedStatement pst = conectar.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            
            dat = new modeloComboServicio(); 
            dat.setId(0);
            dat.setNombre("Selecciona Servicio");
            datos.add(dat);
            
            while(rs.next())
            {
                    dat = new modeloComboServicio(); 
                    dat.setId(rs.getInt("cod_servicio"));
                    dat.setNombre(rs.getString("nombre_serv"));
                    datos.add(dat);
            }
            
            rs.close();
            
        } catch (SQLException ex) {
            
               System.err.println(ex.toString());
        }
           
         return datos; 
           
    }
    
    
    
}
