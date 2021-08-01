/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Conexion {
    
    private static Connection conn = null;
    private static String login = "oracle";
    private static String pass = "duoc";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    
    public Conexion()
   {
        openConnection();
   }                  
       
    
     private void openConnection()
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,login,pass);
            conn.setAutoCommit(false);
            if (conn != null)
            {
                System.out.println("Conexion Exitosa a ServiExpress");
            }
            else
            {
                System.out.println("No se pudo conectar a la base de datos");
            }
        } catch (ClassNotFoundException  | SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Conexion Erronea" + e.getMessage());
        }
        
        
           
    }
     
        public static Connection getConnection()
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,login,pass);
            conn.setAutoCommit(false);
            if (conn != null)
            {
                System.out.println("Conexion Exitosa");
            }
            else
            {
                System.out.println("No se pudo conectar a la base de datos");
            }
        } catch (ClassNotFoundException  | SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Conexion Erronea" + e.getMessage());
        }
        return conn;
           
    }
     
   public Connection obtenerConexion()
    {
        return conn; 
    }
   
   public void desconexion()
    {
    try 
    {
        
    conn.close(); 
    } 
    catch (SQLException e) 
    {
        System.out.println("Error al desconectar" + e.getMessage());
    }
}

public void CerrarConexion()   {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
