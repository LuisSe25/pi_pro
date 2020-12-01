package com.bcp.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bcp.entidad.Cliente;
import com.bcp.entidad.Opcion;
import com.bcp.entidad.Rol;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	@Query("Select x from Cliente x where x.login = :#{#cli.login} and x.password = :#{#cli.password}")
	public abstract Cliente login(@Param(value = "cli") Cliente bean);

	@Query("Select p from Opcion p, RolHasOpcion pr, Rol r, ClienteHasRol u where "
		+ " p.idOpcion = pr.opcion.idOpcion and "
		+ " pr.rol.idRol = r.idRol and "
		+ " r.idRol = u.rol.idRol and "
		+ " u.cliente.idCliente = :var_idCliente")
	public abstract List<Opcion> traerEnlacesDeCliente(@Param("var_idCliente") int idCliente);

	@Query("Select r from Rol r, ClienteHasRol u where "
		+ " r.idRol = u.rol.idRol and "
		+ " u.cliente.idCliente = :var_idCliente")
	public abstract List<Rol> traerRolesDeCliente(@Param("var_idCliente")int idCliente);



	//Ramos=Lista clientes EN la pestaña de admin para que envie los mensajes 
	@Query("Select p from Cliente p where p.nombre like :ar_param")
	public abstract List<Cliente> listaPorNombre(@Param("ar_param") String filtro);

	



}
