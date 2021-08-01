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
public class modeloComboPrecio {
    
    private int id; 
    private String precio; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String toString() {
        return  this.precio;
    }

    
   
    
    public Vector<modeloComboPrecio>mostrarPrecios(Integer idServicio)
    {
             {
        
          if(conexion == null){
        
            conexion = new Conexion().obtenerConexion();
    
       }
        
        
    }
            Vector<modeloComboPrecio> datos = new Vector<modeloComboPrecio>(); 
            modeloComboPrecio dat = null; 
             
           try {
            java.sql.Connection conectar = null; 
            String sql = "SELECT * FROM servicio WHERE cod_servicio=" + idServicio;
            conectar = DB.Conexion.getConnection();
            PreparedStatement pst = conectar.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery();
            
           dat = new modeloComboPrecio(); 
           dat.setId(0);
           dat.setPrecio("Ver Precio");
           datos.add(dat);
            
            while(rs.next())
            {
                    dat = new modeloComboPrecio(); 
                    dat.setId(rs.getInt("cod_servicio"));
                    dat.setPrecio(rs.getString("precio_serv"));
                    datos.add(dat);
            }
            
            rs.close();
            
        } catch (SQLException ex) {
            
               System.err.println(ex.toString());
        }
           
         return datos; 
           
    }
    
    
    
    
}
