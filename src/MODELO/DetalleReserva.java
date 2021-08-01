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
public class DetalleReserva {
    
    private int codigoDetalleReserva; 
    private int codigoReservaD; 
    private int codigoServicioD; 

    public DetalleReserva() {
    }

    public DetalleReserva(int codigoDetalleReserva, int codigoReservaD, int codigoServicioD) {
        this.codigoDetalleReserva = codigoDetalleReserva;
        this.codigoReservaD = codigoReservaD;
        this.codigoServicioD = codigoServicioD;
    }

    public int getCodigoDetalleReserva() {
        return codigoDetalleReserva;
    }

    public void setCodigoDetalleReserva(int codigoDetalleReserva) {
        this.codigoDetalleReserva = codigoDetalleReserva;
    }

    public int getCodigoReservaD() {
        return codigoReservaD;
    }

    public void setCodigoReservaD(int codigoReservaD) {
        this.codigoReservaD = codigoReservaD;
    }

    public int getCodigoServicioD() {
        return codigoServicioD;
    }

    public void setCodigoServicioD(int codigoServicioD) {
        this.codigoServicioD = codigoServicioD;
    }
    
    
    
}
