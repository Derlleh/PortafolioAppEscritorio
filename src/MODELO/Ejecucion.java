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
public class Ejecucion {
    
    
    private int codEjecucion; 
    private String fechaActividad; 
    private String hora; 
    private String comentario; 
    private int idReserva; 
    private int costoTotal; 
    private String rutEmpleado; 
    private String foto; 

    public Ejecucion() {
    }

    public Ejecucion(int codEjecucion, String fechaActividad, String hora, String comentario, int idReserva, int costoTotal, String rutEmpleado, String foto) {
        this.codEjecucion = codEjecucion;
        this.fechaActividad = fechaActividad;
        this.hora = hora;
        this.comentario = comentario;
        this.idReserva = idReserva;
        this.costoTotal = costoTotal;
        this.rutEmpleado = rutEmpleado;
        this.foto = foto;
    }

    public int getCodEjecucion() {
        return codEjecucion;
    }

    public void setCodEjecucion(int codEjecucion) {
        this.codEjecucion = codEjecucion;
    }

    public String getFechaActividad() {
        return fechaActividad;
    }

    public void setFechaActividad(String fechaActividad) {
        this.fechaActividad = fechaActividad;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getRutEmpleado() {
        return rutEmpleado;
    }

    public void setRutEmpleado(String rutEmpleado) {
        this.rutEmpleado = rutEmpleado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    
    
}
