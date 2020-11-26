package com.bcp.entidad;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ClienteHasRolPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int idCliente; 
	private int idRol;
	

	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	
	
}
