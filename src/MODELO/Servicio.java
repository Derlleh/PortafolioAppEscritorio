/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author pablo
 */
public class Servicio {
    
    private int codServicio; 
    private String nombreServicio; 
    private int PrecioServicio; 

    public Servicio() {
    }

    public Servicio(int codServicio, String nombreServicio, int PrecioServicio) {
        this.codServicio = codServicio;
        this.nombreServicio = nombreServicio;
        this.PrecioServicio = PrecioServicio;
    }

    public int getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(int codServicio) {
        this.codServicio = codServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public int getPrecioServicio() {
        return PrecioServicio;
    }

    public void setPrecioServicio(int PrecioServicio) {
        this.PrecioServicio = PrecioServicio;
    }
    
    
   
    
    
}
