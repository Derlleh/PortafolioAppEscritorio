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
public class ComboProducto {
    
    private String idPro; 
    private String marca; 

    public ComboProducto(String idPro, String marca) {
        this.idPro = idPro;
        this.marca = marca;
    }

    public String getIdPro() {
        return idPro;
    }

    public String toString() {
        return marca;
    }
    
    
    
}
