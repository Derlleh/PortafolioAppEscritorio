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
public class ComboProveedor {
    
    private String rutPro; 
    private String rubroPro; 

    public ComboProveedor(String rutPro, String rubroPro) {
        this.rutPro = rutPro;
        this.rubroPro = rubroPro;
    }

    public String getRutPro() {
        return rutPro;
    }

    
    public String toString() {
        return rubroPro;
    }
    
    
    
}
