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
public class Factura {
    
    private int idFactura; 
    private int neto;
    private int iva; 
    private int totalFactura; 

    public Factura() {
    }

    public Factura(int idFactura, int neto, int iva, int totalFactura) {
        this.idFactura = idFactura;
        this.neto = neto;
        this.iva = iva;
        this.totalFactura = totalFactura;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(int totalFactura) {
        this.totalFactura = totalFactura;
    }

   
    
}
