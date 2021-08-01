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
public class TipoProducto {
    
    private int idTipoProducto; 
    private String descripcionTipo; 
    private int codFamilia; 

    public TipoProducto() {
    }

    public TipoProducto(int idTipoProducto, String descripcionTipo, int codFamilia) {
        this.idTipoProducto = idTipoProducto;
        this.descripcionTipo = descripcionTipo;
        this.codFamilia = codFamilia;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getDescripcionTipo() {
        return descripcionTipo;
    }

    public void setDescripcionTipo(String descripcionTipo) {
        this.descripcionTipo = descripcionTipo;
    }

    public int getCodFamilia() {
        return codFamilia;
    }

    public void setCodFamilia(int codFamilia) {
        this.codFamilia = codFamilia;
    }
    
    
    
    
}
