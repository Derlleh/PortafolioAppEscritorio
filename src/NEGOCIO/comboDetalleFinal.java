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
public class comboDetalleFinal {
    
    private int idDetalleReserva;
    private int idreserva; 
    private String nombreServicio; 

    public comboDetalleFinal(int idDetalleReserva, int idreserva, String nombreServicio) {
        this.idDetalleReserva = idDetalleReserva;
        this.idreserva = idreserva;
        this.nombreServicio = nombreServicio;
    }

    public int getIdDetalleReserva() {
        return idDetalleReserva;
    }

    @Override
    public String toString() {
        return "Codigo de Reserva: " + idDetalleReserva + " - Servicio a realizar: " + nombreServicio;
    }

 
    

   
    
      
    
}
