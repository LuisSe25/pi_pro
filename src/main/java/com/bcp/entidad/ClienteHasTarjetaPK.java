package com.bcp.entidad;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ClienteHasTarjetaPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int idCliente; 
	private int idTarjeta;
	

	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getIdTarjeta() {
		return idTarjeta;
	}
	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	
	
}
