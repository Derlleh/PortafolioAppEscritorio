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
public class Producto {
    
    
    private int idPro; 
    private String marcaPro; 
    private String descriPro; 
    private int precioCompPro; 
    private int stockPro; 
    private int stockCriPro; 
    private int precioVentaPro; 
    private String fechaVenciPro; 
    private int tipoPro; 
    private String rutProveedor; 
    private String codificacion; 

    public Producto() {
    }

    public Producto(int idPro, String marcaPro, String descriPro, int precioCompPro, int stockPro, int stockCriPro, int precioVentaPro, String fechaVenciPro, int tipoPro, String rutProveedor, String codificacion) {
        this.idPro = idPro;
        this.marcaPro = marcaPro;
        this.descriPro = descriPro;
        this.precioCompPro = precioCompPro;
        this.stockPro = stockPro;
        this.stockCriPro = stockCriPro;
        this.precioVentaPro = precioVentaPro;
        this.fechaVenciPro = fechaVenciPro;
        this.tipoPro = tipoPro;
        this.rutProveedor = rutProveedor;
        this.codificacion = codificacion;
    }

    public int getIdPro() {
        return idPro;
    }

    public void setIdPro(int idPro) {
        this.idPro = idPro;
    }

    public String getMarcaPro() {
        return marcaPro;
    }

    public void setMarcaPro(String marcaPro) {
        this.marcaPro = marcaPro;
    }

    public String getDescriPro() {
        return descriPro;
    }

    public void setDescriPro(String descriPro) {
        this.descriPro = descriPro;
    }

    public int getPrecioCompPro() {
        return precioCompPro;
    }

    public void setPrecioCompPro(int precioCompPro) {
        this.precioCompPro = precioCompPro;
    }

    public int getStockPro() {
        return stockPro;
    }

    public void setStockPro(int stockPro) {
        this.stockPro = stockPro;
    }

    public int getStockCriPro() {
        return stockCriPro;
    }

    public void setStockCriPro(int stockCriPro) {
        this.stockCriPro = stockCriPro;
    }

    public int getPrecioVentaPro() {
        return precioVentaPro;
    }

    public void setPrecioVentaPro(int precioVentaPro) {
        this.precioVentaPro = precioVentaPro;
    }

    public String getFechaVenciPro() {
        return fechaVenciPro;
    }

    public void setFechaVenciPro(String fechaVenciPro) {
        this.fechaVenciPro = fechaVenciPro;
    }

    public int getTipoPro() {
        return tipoPro;
    }

    public void setTipoPro(int tipoPro) {
        this.tipoPro = tipoPro;
    }

    public String getRutProveedor() {
        return rutProveedor;
    }

    public void setRutProveedor(String rutProveedor) {
        this.rutProveedor = rutProveedor;
    }

    public String getCodificacion() {
        return codificacion;
    }

    public void setCodificacion(String codificacion) {
        this.codificacion = codificacion;
    }

   
    
    
    
    
}
