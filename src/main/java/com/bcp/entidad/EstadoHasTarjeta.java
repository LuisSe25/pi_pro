package com.bcp.entidad;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estado_has_tarjeta")
public class EstadoHasTarjeta {

	@EmbeddedId
	private EstadoHasTarjetaPK estadoHasTarjetaPk;

	@ManyToOne
	@JoinColumn(name = "idestado", nullable = false, insertable = false, updatable = false)
	private Estado estado;

	@ManyToOne
	@JoinColumn(name = "idtarjeta", nullable = false, insertable = false, updatable = false)
	private Tarjeta tarjeta;

	public EstadoHasTarjetaPK getEstadoHasTarjetaPk() {
		return estadoHasTarjetaPk;
	}

	public void setEstadoHasTarjetaPk(EstadoHasTarjetaPK estadoHasTarjetaPk) {
		this.estadoHasTarjetaPk = estadoHasTarjetaPk;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	
	

	
	
}
