/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NEGOCIO;

import CONTROLADOR.EjecucionDAO;
import DB.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class ejecucionNegocio {
    
    
    private EjecucionDAO sdao = new EjecucionDAO();
    
     public int getMaxID(){
           
         Connection conn = Conexion.getConnection(); 
         int id = sdao.getMaxID(conn);
         
         try {
             conn.close();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
         
         return id; 
           
       }
     
     
     
        
        }
    
