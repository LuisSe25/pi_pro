package com.bcp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bcp.entidad.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Integer> {

	@Query("select p from Mensaje p where p.tipoMovimiento.idTipoMovimiento = :param")
	public abstract Mensaje listaMensajePorTipo(@Param("param") int idTipo);

}
