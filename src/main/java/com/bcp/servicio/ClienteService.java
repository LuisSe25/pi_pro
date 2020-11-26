package com.bcp.servicio;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.bcp.entidad.Cliente;
import com.bcp.entidad.Opcion;
import com.bcp.entidad.Rol;

public interface ClienteService {

	public abstract Cliente login(Cliente bean);
	public abstract List<Opcion> traerEnlacesDeCliente(@Param("var_idCliente") int idCliente);
	public abstract List<Rol> traerRolesDeCliente(@Param("var_idCliente")int idCliente);
	//Ramos Admin
	public abstract List<Cliente> listarTodos();

	public abstract List<Cliente> listarPorNombre(String filtro);
}
