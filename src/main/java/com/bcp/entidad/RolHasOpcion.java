package com.bcp.entidad;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rol_has_opcion")
public class RolHasOpcion {

	
	@EmbeddedId
	private RolHasOpcionPK rolHasOpcionPK;

	@ManyToOne
	@JoinColumn(name = "idrol", nullable = false)
	private Rol rol;
	
	@ManyToOne
	@JoinColumn(name = "idopcion", nullable = false)
	private Opcion opcion;
	
	public RolHasOpcionPK getRolHasOpcionPK() {
		return rolHasOpcionPK;
	}

	public void setRolHasOpcionPK(RolHasOpcionPK rolHasOpcionPK) {
		this.rolHasOpcionPK = rolHasOpcionPK;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Opcion getOpcion() {
		return opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}
	
	
}
