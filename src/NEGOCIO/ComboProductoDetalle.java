/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NEGOCIO;

/**
 *
 * @author pablo
 */
public class ComboProductoDetalle {
    
    private String idProducto; 
    private String marca; 
   // private String precioPro;

    public ComboProductoDetalle(String idProducto,  String marca) {
        this.idProducto = idProducto;
        this.marca = marca; 
        
    }

    public String getIdProducto() {
        return idProducto;
    }

    
    public String toString() {
        return  marca;
    }
    
    
  
    
    
    
}
