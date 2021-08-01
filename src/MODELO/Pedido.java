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
public class Pedido {
    
    private int idPedido; 
    private String fechaPedido; 
    private String descripPed; 
    private String rutEmplea; 
    private String rutProvee; 

    public Pedido() {
    }

    public Pedido(int idPedido, String fechaPedido, String descripPed, String rutEmplea, String rutProvee) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.descripPed = descripPed;
        this.rutEmplea = rutEmplea;
        this.rutProvee = rutProvee;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getDescripPed() {
        return descripPed;
    }

    public void setDescripPed(String descripPed) {
        this.descripPed = descripPed;
    }

    public String getRutEmplea() {
        return rutEmplea;
    }

    public void setRutEmplea(String rutEmplea) {
        this.rutEmplea = rutEmplea;
    }

    public String getRutProvee() {
        return rutProvee;
    }

    public void setRutProvee(String rutProvee) {
        this.rutProvee = rutProvee;
    }
    
    
    
    
}
