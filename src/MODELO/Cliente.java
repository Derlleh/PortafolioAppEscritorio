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
public class Cliente {
    
    private String rutClien; 
    private String nombreClien; 
    private String apellClien; 
    private String correoClien; 
    private String direcClien; 
    private int telefonoClien; 
    private String userNameCli; 
    private String passClien; 

    public Cliente() {
    }

    public Cliente(String rutClien, String nombreClien, String apellClien, String correoClien, String direcClien, int telefonoClien, String userNameCli, String passClien) {
        this.rutClien = rutClien;
        this.nombreClien = nombreClien;
        this.apellClien = apellClien;
        this.correoClien = correoClien;
        this.direcClien = direcClien;
        this.telefonoClien = telefonoClien;
        this.userNameCli = userNameCli;
        this.passClien = passClien;
    }

    public String getRutClien() {
        return rutClien;
    }

    public void setRutClien(String rutClien) {
        this.rutClien = rutClien;
    }

    public String getNombreClien() {
        return nombreClien;
    }

    public void setNombreClien(String nombreClien) {
        this.nombreClien = nombreClien;
    }

    public String getApellClien() {
        return apellClien;
    }

    public void setApellClien(String apellClien) {
        this.apellClien = apellClien;
    }

    public String getCorreoClien() {
        return correoClien;
    }

    public void setCorreoClien(String correoClien) {
        this.correoClien = correoClien;
    }

    public String getDirecClien() {
        return direcClien;
    }

    public void setDirecClien(String direcClien) {
        this.direcClien = direcClien;
    }

    public int getTelefonoClien() {
        return telefonoClien;
    }

    public void setTelefonoClien(int telefonoClien) {
        this.telefonoClien = telefonoClien;
    }

    public String getUserNameCli() {
        return userNameCli;
    }

    public void setUserNameCli(String userNameCli) {
        this.userNameCli = userNameCli;
    }

    public String getPassClien() {
        return passClien;
    }

    public void setPassClien(String passClien) {
        this.passClien = passClien;
    }
    
    
    
}
