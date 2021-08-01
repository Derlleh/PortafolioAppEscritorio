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
public class ComboServicioPrecio {
    
    private String precioServi; 
    private String nombreServi; 

    public ComboServicioPrecio(String precioServi, String nombreServi) {
        this.precioServi = precioServi;
        this.nombreServi = nombreServi;
    }

    public String getNombreServi() {
        return nombreServi;
    }

   
    public String toString() {
        return precioServi;
    }

 
    
    
    
}
