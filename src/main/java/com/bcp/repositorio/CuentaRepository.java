package com.bcp.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bcp.entidad.Cuenta;

public interface CuentaRepository  extends JpaRepository<Cuenta, Integer>{
	
	@Query("select p from Cuenta p where p.cliente.idCliente = :param")
	public abstract List<Cuenta>  listaCuentaPorCliente(@Param("param") int idCliente);
	
	
	@Query("select p from Cuenta p where p.numero = :param")
	public abstract Cuenta listaCuentaPorNumero(@Param("param")String numero);
}
