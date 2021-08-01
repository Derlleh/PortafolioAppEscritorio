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
public class ComboMecanicoNombre {
    
    private String NombreMecanico; 
    private String ApellidoMecanico; 

    public ComboMecanicoNombre(String NombreMecanico, String ApellidoMecanico) {
        this.NombreMecanico = NombreMecanico;
        this.ApellidoMecanico = ApellidoMecanico;
    }

    public String getNombreMecanico() {
        return NombreMecanico;
    }

    public String getApellidoMecanico() {
        return ApellidoMecanico;
    }

    public String toString() {
        return NombreMecanico +" "+ ApellidoMecanico ;
    }

 
    
    
}
