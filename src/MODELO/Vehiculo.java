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
public class Vehiculo {
    
    private String patenteVehi; 
    private int annoVehi; 
    private String marcaVehi;
    private String modeloVehi; 
    private String colorVehi; 
    private int kilometra; 
    private String RutClien; 
    private int estado; 

    public Vehiculo() {
    }

    public Vehiculo(String patenteVehi, int annoVehi, String marcaVehi, String modeloVehi, String colorVehi, int kilometra, String RutClien, int estado) {
        this.patenteVehi = patenteVehi;
        this.annoVehi = annoVehi;
        this.marcaVehi = marcaVehi;
        this.modeloVehi = modeloVehi;
        this.colorVehi = colorVehi;
        this.kilometra = kilometra;
        this.RutClien = RutClien;
        this.estado = estado;
    }

    public String getPatenteVehi() {
        return patenteVehi;
    }

    public void setPatenteVehi(String patenteVehi) {
        this.patenteVehi = patenteVehi;
    }

    public int getAnnoVehi() {
        return annoVehi;
    }

    public void setAnnoVehi(int annoVehi) {
        this.annoVehi = annoVehi;
    }

    public String getMarcaVehi() {
        return marcaVehi;
    }

    public void setMarcaVehi(String marcaVehi) {
        this.marcaVehi = marcaVehi;
    }

    public String getModeloVehi() {
        return modeloVehi;
    }

    public void setModeloVehi(String modeloVehi) {
        this.modeloVehi = modeloVehi;
    }

    public String getColorVehi() {
        return colorVehi;
    }

    public void setColorVehi(String colorVehi) {
        this.colorVehi = colorVehi;
    }

    public int getKilometra() {
        return kilometra;
    }

    public void setKilometra(int kilometra) {
        this.kilometra = kilometra;
    }

    public String getRutClien() {
        return RutClien;
    }

    public void setRutClien(String RutClien) {
        this.RutClien = RutClien;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

   
    
    
}
