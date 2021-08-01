/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import DB.Conexion;
import java.sql.Connection;

/**
 *
 * @author pablo
 */
public class Test {
    
    
    public static Connection conexion = null; 
    
    public static void main(String[] args){
        
        try {
            Conexion conn = new Conexion(); 
            conexion = conn.obtenerConexion();
        } catch (Exception e) {
            
            System.out.println("Error en la Conexion");
            
        }
        
        
    }
}
