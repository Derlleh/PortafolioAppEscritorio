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
public class ComboDetalleProductoBoleta {
    
    private String precioPro; 
    private String nombrePro;

    public ComboDetalleProductoBoleta(String precioPro, String nombrePro) {
        this.precioPro = precioPro;
        this.nombrePro = nombrePro;
    }

    public String getPrecioPro() {
        return precioPro;
    }

    public String toString() {
        return nombrePro +" Valor: $ " + precioPro ;
    }


    
    
    
    
}
