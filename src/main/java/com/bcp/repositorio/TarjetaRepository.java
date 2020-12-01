package com.bcp.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bcp.entidad.Cliente;
import com.bcp.entidad.Cuenta;
import com.bcp.entidad.Rol;
import com.bcp.entidad.Tarjeta;


public interface TarjetaRepository extends JpaRepository<Tarjeta, Integer>{
	@Query("Select p from Tarjeta p where p.cliente.idCliente = :id_cliente")
	public abstract Tarjeta traerTarjeta(@Param("id_cliente") int filtro);
	


	@Query("Select r from Tarjeta r, ClienteHasTarjeta u where "
			+ " r.idTarjeta = u.tarjeta.idTarjeta and "
			+ " u.cliente.idCliente = :var_idCliente")
		public abstract List<Tarjeta> traerTarjetasDeCliente(@Param("var_idCliente")int idCliente);
	
	@Transactional
		@Modifying
		@Query("update Tarjeta x set  x.idestado =  1 where x.cliente.idCliente =:var_idCliente")
		public abstract void actualizaestadoActivo(@Param("var_idCliente")int idCliente);
	@Transactional
		@Modifying
		@Query("update Tarjeta x set  x.idestado =  2 where x.cliente.idCliente =:var_idCliente")
		public abstract void actualizaestadoInactivo(@Param("var_idCliente")int idCliente);
}
