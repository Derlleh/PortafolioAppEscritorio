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
public class ComboEstado {
    
    private String numeroEstado; 
    private String texto; 

    public ComboEstado(String numeroEstado, String texto) {
        this.numeroEstado = numeroEstado;
        this.texto = texto; 
    }

    public String getNumeroEstado() {
        return numeroEstado;
    }

    @Override
    public String toString() {
        return texto;
    }
    
    
    
    
    
}
