package com.bcp.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.entidad.Mensaje;
import com.bcp.repositorio.MensajeRepository;

@Service
public class MensajeServiceImpl implements MensajeService {

	@Autowired
	private MensajeRepository repository;

	@Override
	public Mensaje listaMensajePorTipo(int idTipo) {
		return repository.listaMensajePorTipo(idTipo);
	}

}
