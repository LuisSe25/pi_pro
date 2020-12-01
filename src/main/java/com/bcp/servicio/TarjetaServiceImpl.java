package com.bcp.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.entidad.Tarjeta;
import com.bcp.repositorio.TarjetaRepository;
@Service
public class TarjetaServiceImpl implements TarjetaService{
	@Autowired
	private TarjetaRepository repository;

	@Override
	public Tarjeta traerTarjeta(int filtro) {
		return repository.traerTarjeta(filtro);
	}

	@Override
	public List<Tarjeta> traerTarjetasDeCliente(int idCliente) {
		return repository.traerTarjetasDeCliente(idCliente);
	}

	@Override
	public void actualizaestadoActivo(int idCliente) {
		repository.actualizaestadoActivo(idCliente);
		
	}

	@Override
	public void actualizaestadoInactivo(int idCliente) {
		repository.actualizaestadoInactivo(idCliente);
		
	}



	









}
