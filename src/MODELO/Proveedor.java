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
public class Proveedor {
    
    private String rutPro;
    private String nombrePro; 
    private String apellidoPro; 
    private String correoPro; 
    private int telefonoPro; 
    private String rubroPro; 
    private String razon; 

    public Proveedor() {
    }

    public Proveedor(String rutPro, String nombrePro, String apellidoPro, String correoPro, int telefonoPro, String rubroPro, String razon) {
        this.rutPro = rutPro;
        this.nombrePro = nombrePro;
        this.apellidoPro = apellidoPro;
        this.correoPro = correoPro;
        this.telefonoPro = telefonoPro;
        this.rubroPro = rubroPro;
        this.razon = razon;
    }

    public String getRutPro() {
        return rutPro;
    }

    public void setRutPro(String rutPro) {
        this.rutPro = rutPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getApellidoPro() {
        return apellidoPro;
    }

    public void setApellidoPro(String apellidoPro) {
        this.apellidoPro = apellidoPro;
    }

    public String getCorreoPro() {
        return correoPro;
    }

    public void setCorreoPro(String correoPro) {
        this.correoPro = correoPro;
    }

    public int getTelefonoPro() {
        return telefonoPro;
    }

    public void setTelefonoPro(int telefonoPro) {
        this.telefonoPro = telefonoPro;
    }

    public String getRubroPro() {
        return rubroPro;
    }

    public void setRubroPro(String rubroPro) {
        this.rubroPro = rubroPro;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

  
    
    
}
