package com.bcp.entidad;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class RolHasOpcionPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idRol;
	private int idOpcion;
	
	public int getIdRol() {
		return idRol;
	}
	public int getIdOpcion() {
		return idOpcion;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public void setIdOpcion(int idOpcion) {
		this.idOpcion = idOpcion;
	}
	
	
}
