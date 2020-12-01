package com.bcp.entidad;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente_has_tarjeta")
public class ClienteHasTarjeta {

	@EmbeddedId
	private ClienteHasTarjetaPK clienteHasTarjetaPk;

	@ManyToOne
	@JoinColumn(name = "idcliente", nullable = false)
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "idtarjeta", nullable = false)
	private Tarjeta tarjeta;


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ClienteHasTarjetaPK getClienteHasTarjetaPk() {
		return clienteHasTarjetaPk;
	}

	public void setClienteHasTarjetaPk(ClienteHasTarjetaPK clienteHasTarjetaPk) {
		this.clienteHasTarjetaPk = clienteHasTarjetaPk;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	

	
	
}
