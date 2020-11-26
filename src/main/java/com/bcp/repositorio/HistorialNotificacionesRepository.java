package com.bcp.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bcp.entidad.HistorialNotificaciones;

public interface HistorialNotificacionesRepository  extends JpaRepository<HistorialNotificaciones, Integer>{

	
	@Query("Select x from HistorialNotificaciones x where x.cliente.idCliente = :var_cli")
	public abstract List<HistorialNotificaciones> listaPorCliente(@Param(value = "var_cli") int idCliente);
	
}
