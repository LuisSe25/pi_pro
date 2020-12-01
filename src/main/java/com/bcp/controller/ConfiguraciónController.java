package com.bcp.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bcp.entidad.Cliente;
import com.bcp.entidad.Cuenta;
import com.bcp.entidad.HistorialCuenta;
import com.bcp.entidad.HistorialNotificaciones;
import com.bcp.entidad.Mensaje;
import com.bcp.entidad.Tarjeta;
import com.bcp.entidad.TipoMovimiento;
import com.bcp.entidad.Tranferencia;
import com.bcp.servicio.CuentaService;
import com.bcp.servicio.HistorialCuentaService;
import com.bcp.servicio.HistorialNotificacionesService;
import com.bcp.servicio.MensajeService;
import com.bcp.servicio.TarjetaService;
import com.bcp.util.Constantes;

@Controller
public class Configuraci�nController {
	@Autowired
	private HistorialCuentaService historialCuentaService;
	@Autowired
	private TarjetaService tarjetaService;

	
	
	@RequestMapping("/verConfiguracion")
	public String verConf() {
		return "configuración";
	}


	@RequestMapping("/salidaConfiguracion")
	public String regConfiguracion() {
		return "configuración";
	}
	
	@RequestMapping("/configuracionTarjeta")
	public String configuracionTarjeta(Tarjeta x,HttpSession session) {
		Tarjeta objTarjeta = (Tarjeta)	session.getAttribute("objTarjeta");
		Cliente objCLiente= 	(Cliente)	session.getAttribute("objCliente");
		if(objTarjeta.getIdestado()==1) {
			tarjetaService.actualizaestadoInactivo(objCLiente.getIdCliente());
			session.setAttribute("MENSAJES", "tarjeta lista ");
		}
		else {
			tarjetaService.actualizaestadoActivo(objCLiente.getIdCliente());
			session.setAttribute("MENSAJES", "tarjeta lista gaaa");
		}
		return "configuracionTarjeta";
	}
	

}
