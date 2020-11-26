package com.bcp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bcp.entidad.Cliente;
import com.bcp.entidad.Opcion;
import com.bcp.entidad.Rol;
import com.bcp.servicio.ClienteService;

@Controller
public class LoginController {

	@Autowired
	private ClienteService servicio;

	@RequestMapping("/")
	public String ver() {
		return "login";
	}

	@RequestMapping("/login")
	public String login(Cliente cliente, HttpSession session, HttpServletRequest request) {
		Cliente clientes = servicio.login(cliente);
		if (clientes == null) {
			    request.setAttribute("mensaje", "El usuario no existe");
			return "login";
		} 
		else if(clientes.getIdrol()==3) {
			List<Opcion> menus = servicio.traerEnlacesDeCliente(clientes.getIdCliente());
			List<Rol> roles = servicio.traerRolesDeCliente(clientes.getIdCliente());

			session.setAttribute("objCliente", clientes);
			session.setAttribute("objMenus", menus);
			session.setAttribute("objRoles", roles);
			return "intranetHomeCliente";
		}
		else {
			List<Opcion> menus = servicio.traerEnlacesDeCliente(clientes.getIdCliente());
			List<Rol> roles = servicio.traerRolesDeCliente(clientes.getIdCliente());

			session.setAttribute("objCliente", clientes);
			session.setAttribute("objMenus", menus);
			session.setAttribute("objRoles", roles);

			return "intranetHomeAdmin";
	
		}
	}
	
	@RequestMapping("/consultaCrudUsuario")
	public String lista(String filtro, HttpSession session) {
		List<Cliente> lista = servicio.listarPorNombre(filtro + "%");
		session.setAttribute("usuarios", lista);
		return "intranetHomeAdmin";
	}

	@RequestMapping("/salidaUsuario")
	public String listTodos(HttpSession session) {
		List<Cliente> data = servicio.listarTodos();
		session.setAttribute("usuarios", data);
		return "intranetHomeAdmin";
	}

	
	@RequestMapping("/logout")
	public String logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		
		//Destruir todos los objetos de la sesion mediante programación
		session.invalidate();

		response.setHeader("Cache-control", "no-cache");
		response.setHeader("Expires", "0");
		response.setHeader("Pragma", "no-cache");

		request.setAttribute("mensaje", "El usuario sali� de Sesi�n");
		return "login";

	}

}
