package com.bcp.entidad;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EstadoHasTarjetaPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int idestado; 
	private String idtarjeta;
	
	public int getIdestado() {
		return idestado;
	}
	public void setIdestado(int idestado) {
		this.idestado = idestado;
	}

	public String getIdtarjeta() {
		return idtarjeta;
	}
	public void setIdtarjeta(String idtarjeta) {
		this.idtarjeta = idtarjeta;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	


	
	
}
