package com.bcp.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.entidad.Cliente;
import com.bcp.entidad.Opcion;
import com.bcp.entidad.Rol;
import com.bcp.repositorio.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;

	@Override
	public Cliente login(Cliente bean) {
		return repository.login(bean);
	}

	@Override
	public List<Opcion> traerEnlacesDeCliente(int idCliente) {
	return repository.traerEnlacesDeCliente(idCliente);
	}

	@Override
	public List<Rol> traerRolesDeCliente(int idCliente) {
		return repository.traerRolesDeCliente(idCliente);
	}


	@Override
	public List<Cliente> listarTodos() {
		return repository.findAll();
	}

	@Override
	public List<Cliente> listarPorNombre(String filtro) {
	return repository.listaPorNombre(filtro);
	}

}
