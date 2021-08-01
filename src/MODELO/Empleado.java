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
public class Empleado {
    
    private String rutEm;
    private String nomEm; 
    private String apellEm; 
    private String dirEm; 
    private int telefoEm;
    private String correoEm; 
    private String cargoEm; 
    private String rolEm; 
    private String passEm; 
    private String UsernameEm; 

    public Empleado() {
    }

    public Empleado(String rutEm, String nomEm, String apellEm, String dirEm, int telefoEm, String correoEm, String cargoEm, String rolEm, String passEm, String UsernameEm) {
        this.rutEm = rutEm;
        this.nomEm = nomEm;
        this.apellEm = apellEm;
        this.dirEm = dirEm;
        this.telefoEm = telefoEm;
        this.correoEm = correoEm;
        this.cargoEm = cargoEm;
        this.rolEm = rolEm;
        this.passEm = passEm;
        this.UsernameEm = UsernameEm;
    }

    public String getRutEm() {
        return rutEm;
    }

    public void setRutEm(String rutEm) {
        this.rutEm = rutEm;
    }

    public String getNomEm() {
        return nomEm;
    }

    public void setNomEm(String nomEm) {
        this.nomEm = nomEm;
    }

    public String getApellEm() {
        return apellEm;
    }

    public void setApellEm(String apellEm) {
        this.apellEm = apellEm;
    }

    public String getDirEm() {
        return dirEm;
    }

    public void setDirEm(String dirEm) {
        this.dirEm = dirEm;
    }

    public int getTelefoEm() {
        return telefoEm;
    }

    public void setTelefoEm(int telefoEm) {
        this.telefoEm = telefoEm;
    }

    public String getCorreoEm() {
        return correoEm;
    }

    public void setCorreoEm(String correoEm) {
        this.correoEm = correoEm;
    }

    public String getCargoEm() {
        return cargoEm;
    }

    public void setCargoEm(String cargoEm) {
        this.cargoEm = cargoEm;
    }

    public String getRolEm() {
        return rolEm;
    }

    public void setRolEm(String rolEm) {
        this.rolEm = rolEm;
    }

    public String getPassEm() {
        return passEm;
    }

    public void setPassEm(String passEm) {
        this.passEm = passEm;
    }

    public String getUsernameEm() {
        return UsernameEm;
    }

    public void setUsernameEm(String UsernameEm) {
        this.UsernameEm = UsernameEm;
    }
    
    
    
}
