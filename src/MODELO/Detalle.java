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
public class Detalle {
    
    private int cantProduc; 
    private int valor; 
    private int producto; 
    private String producProveedor; 
    private int boleta; 
    private int codServicio; 
    private int factura; 
    private int precioServicio; 
    private int precioproducto; 
    private String fecha; 

    public Detalle() {
        
    }

    public Detalle(int cantProduc, int valor, int producto, String producProveedor, int boleta, int codServicio, int factura, int precioServicio, int precioproducto, String fecha) {
        this.cantProduc = cantProduc;
        this.valor = valor;
        this.producto = producto;
        this.producProveedor = producProveedor;
        this.boleta = boleta;
        this.codServicio = codServicio;
        this.factura = factura;
        this.precioServicio = precioServicio;
        this.precioproducto = precioproducto;
        this.fecha = fecha;
    }

    public int getCantProduc() {
        return cantProduc;
    }

    public void setCantProduc(int cantProduc) {
        this.cantProduc = cantProduc;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public String getProducProveedor() {
        return producProveedor;
    }

    public void setProducProveedor(String producProveedor) {
        this.producProveedor = producProveedor;
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    public int getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(int codServicio) {
        this.codServicio = codServicio;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public int getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(int precioServicio) {
        this.precioServicio = precioServicio;
    }

    public int getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(int precioproducto) {
        this.precioproducto = precioproducto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   
    }

