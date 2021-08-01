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
public class ComboServiciosEjecutar {
    
    
    private String codServicio; 
 //   private String precioServicio; 
    private String nombreSer; 

    public ComboServiciosEjecutar(String codServicio, String nombreSer) {
        this.codServicio = codServicio;
      //  this.precioServicio = precioServicio;
        this.nombreSer = nombreSer;
     
    }

    public String getCodServicio() {
        return codServicio;
    }

    
    public String toString() {
        return nombreSer ;
    }
    
    
    
}
