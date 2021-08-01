/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NEGOCIO;

/**
 *
 * @author pablo
 */
public class ComboTipoFamilia {
    
    private String codFamilia; 
    private String nombreFamilia; 

    public ComboTipoFamilia(String codFamilia, String nombreFamilia) {
        this.codFamilia = codFamilia;
        this.nombreFamilia = nombreFamilia;
    }

    public String getCodFamilia() {
        return codFamilia;
    }

    
    public String toString() {
        return nombreFamilia;
    }
    
    
    
}
