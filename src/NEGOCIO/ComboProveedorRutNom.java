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
public class ComboProveedorRutNom {
    
    private String RutProv; 
    private String NombreProv; 

    public ComboProveedorRutNom(String RutProv, String NombreProv) {
        this.RutProv = RutProv;
        this.NombreProv = NombreProv;
    }

    public String getRutProv() {
        return RutProv;
    }

    public String toString() {
        return NombreProv;
    }
    
    
    
}
