package com.bcp.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.entidad.HistorialNotificaciones;
import com.bcp.repositorio.HistorialNotificacionesRepository;
@Service
public class HistorialNotificacionesServiceImpl implements HistorialNotificacionesService{

	@Autowired
	private HistorialNotificacionesRepository repository;
	
	@Override
	public HistorialNotificaciones registraHistorial(HistorialNotificaciones obj) {
		return repository.save(obj);
	}

	@Override
	public List<HistorialNotificaciones> listaPorCliente(int idCliente) {
		return repository.listaPorCliente(idCliente);
	}

}
