package com.bcp.repositorio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bcp.entidad.Cliente;
import com.bcp.entidad.Cuenta;
import com.bcp.entidad.Rol;

@Transactional
public interface CuentaRepository  extends JpaRepository<Cuenta, Integer>{
	
	@Query("select p from Cuenta p where p.cliente.idCliente = :param")
	public abstract List<Cuenta>  listaCuentaPorCliente(@Param("param") int idCliente);
	
	
	@Query("select p from Cuenta p where p.numero = :param")
	public abstract Cuenta listaCuentaPorNumero(@Param("param")String numero);
	

  
	@Modifying
	@Query("update Cuenta x set  x.saldo = x.saldo - :mon where x.numero = :cue")
	public abstract void actualizaSaldoClie(@Param("mon")double saldo, @Param("cue")String numero);
	
	@Modifying
	@Query("update Cuenta x set  x.saldo = x.saldo + :sal where x.numero = :cue")
	public abstract  void actualizaSaldoClieMas(@Param("sal")double saldo, @Param("cue")String numero);
	
	@Query("select c from Cliente c ,Cuenta e where e.numero like :v_param")
	public abstract List<Cliente> listaPorNombre(@Param("v_param") String cuentaDes);
	
	
	
	
	
	
	

	@Query("Select r from Cliente r, Cuenta u where "
		+ " r.idCliente = u.cliente.idCliente and "
		+ " u.idTarjeta = :var_idTarjeta")
	public abstract List<Cliente> listarClienteporTarjeta(@Param("var_idTarjeta")String var_idTarjeta);
	
	
	
	
}
