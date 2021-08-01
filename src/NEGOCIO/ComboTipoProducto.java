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
public class ComboTipoProducto {
    
    
    private String idTipo; 
    private String descripcion; 

    public ComboTipoProducto(String idTipo, String descripcion) {
        this.idTipo = idTipo;
        this.descripcion = descripcion;
    }

    public String getIdTipo() {
        return idTipo;
    }

    
    public String toString() {
        return descripcion;
    }
    
    
    
    
    
    
    
}
