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
public class DetallePedido {
    
    private int cantidad; 
    private int estado; 
    private String comentario; 
    private int precioUni; 
    private int total; 
    private int idpedido; 
    private int idproducto; 
    private String rutProveedor; 
    private String fechaVencimiento; 

    public DetallePedido() {
    }

    public DetallePedido(int cantidad, int estado, String comentario, int precioUni, int total, int idpedido, int idproducto, String rutProveedor, String fechaVencimiento) {
        this.cantidad = cantidad;
        this.estado = estado;
        this.comentario = comentario;
        this.precioUni = precioUni;
        this.total = total;
        this.idpedido = idpedido;
        this.idproducto = idproducto;
        this.rutProveedor = rutProveedor;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getPrecioUni() {
        return precioUni;
    }

    public void setPrecioUni(int precioUni) {
        this.precioUni = precioUni;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getRutProveedor() {
        return rutProveedor;
    }

    public void setRutProveedor(String rutProveedor) {
        this.rutProveedor = rutProveedor;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

  
    
    
    
    
}
