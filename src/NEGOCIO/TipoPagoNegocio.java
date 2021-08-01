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
public class TipoPagoNegocio {
    
    private String codTipoPago; 
    private String descripcionPago; 

    public TipoPagoNegocio(String codTipoPago, String descripcionPago) {
        this.codTipoPago = codTipoPago;
        this.descripcionPago = descripcionPago;
    }

    public String getCodTipoPago() {
        return codTipoPago;
    }

    
    public String toString() {
        return descripcionPago;
    }


    
    
}
