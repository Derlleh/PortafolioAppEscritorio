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
public class Reserva {
    
    private int idReserva; 
    private String fechaReserva; 
    private String vehiculoPatente; 
    private String ClienteVehRut; 
    private int estadoReserv; 
    private String horaReserv; 
    private String mecanico; 

    public Reserva() {
    }

    public Reserva(int idReserva, String fechaReserva, String vehiculoPatente, String ClienteVehRut, int estadoReserv, String horaReserv, String mecanico) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.vehiculoPatente = vehiculoPatente;
        this.ClienteVehRut = ClienteVehRut;
        this.estadoReserv = estadoReserv;
        this.horaReserv = horaReserv;
        this.mecanico = mecanico;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getVehiculoPatente() {
        return vehiculoPatente;
    }

    public void setVehiculoPatente(String vehiculoPatente) {
        this.vehiculoPatente = vehiculoPatente;
    }

    public String getClienteVehRut() {
        return ClienteVehRut;
    }

    public void setClienteVehRut(String ClienteVehRut) {
        this.ClienteVehRut = ClienteVehRut;
    }

    public int getEstadoReserv() {
        return estadoReserv;
    }

    public void setEstadoReserv(int estadoReserv) {
        this.estadoReserv = estadoReserv;
    }

    public String getHoraReserv() {
        return horaReserv;
    }

    public void setHoraReserv(String horaReserv) {
        this.horaReserv = horaReserv;
    }

    public String getMecanico() {
        return mecanico;
    }

    public void setMecanico(String mecanico) {
        this.mecanico = mecanico;
    }

    
   

  
    
    
    
}
