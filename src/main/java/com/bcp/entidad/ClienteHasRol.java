package com.bcp.entidad;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente_has_rol")
public class ClienteHasRol {

	@EmbeddedId
	private ClienteHasRolPK clienteHasRolPk;

	@ManyToOne
	@JoinColumn(name = "idcliente", nullable = false)
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "idrol", nullable = false)
	private Rol rol;

	public ClienteHasRolPK getClienteHasRolPk() {
		return clienteHasRolPk;
	}

	public void setClienteHasRolPk(ClienteHasRolPK clienteHasRolPk) {
		this.clienteHasRolPk = clienteHasRolPk;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	

	
	
}
