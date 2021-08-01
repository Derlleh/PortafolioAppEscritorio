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
public class Familia {
    
    private int codFamilia; 
    private String nombreFamilia; 

    public Familia() {
    }

    public Familia(int codFamilia, String nombreFamilia) {
        this.codFamilia = codFamilia;
        this.nombreFamilia = nombreFamilia;
    }

    public int getCodFamilia() {
        return codFamilia;
    }

    public void setCodFamilia(int codFamilia) {
        this.codFamilia = codFamilia;
    }

    public String getNombreFamilia() {
        return nombreFamilia;
    }

    public void setNombreFamilia(String nombreFamilia) {
        this.nombreFamilia = nombreFamilia;
    }
    
    
    
}
