package com.bcp.servicio;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.bcp.entidad.Tarjeta;

public interface TarjetaService {
	public abstract Tarjeta traerTarjeta(int filtro);
	public abstract List<Tarjeta> traerTarjetasDeCliente(int idCliente);
	public abstract void actualizaestadoActivo(int idCliente );
	public abstract void actualizaestadoInactivo(int idCliente);
}
