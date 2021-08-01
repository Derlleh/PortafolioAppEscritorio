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
public class Boleta {
    
    private int IddocCompra; 
    private int neto; 
    private int iva; 
    private int total; 

    public Boleta() {
    }

    public Boleta(int IddocCompra, int neto, int iva, int total) {
        this.IddocCompra = IddocCompra;
        this.neto = neto;
        this.iva = iva;
        this.total = total;
    }

    public int getIddocCompra() {
        return IddocCompra;
    }

    public void setIddocCompra(int IddocCompra) {
        this.IddocCompra = IddocCompra;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
}
