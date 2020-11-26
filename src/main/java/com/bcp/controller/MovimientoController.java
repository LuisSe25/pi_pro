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
import com.bcp.entidad.TipoMovimiento;
import com.bcp.entidad.Tranferencia;
import com.bcp.servicio.CuentaService;
import com.bcp.servicio.HistorialCuentaService;
import com.bcp.servicio.HistorialNotificacionesService;
import com.bcp.servicio.MensajeService;
import com.bcp.util.Constantes;

@Controller
public class MovimientoController {
	@Autowired
	private HistorialCuentaService historialCuentaService;

	@Autowired
	private CuentaService cuentaService;
	
	@Autowired
	private MensajeService mensajeService;
	
	@Autowired
	private HistorialNotificacionesService historialNotificacionesService;
	
	
	
	
	@RequestMapping("/verMovimiento")
	public String ver() {
		return "movimiento";
	}
	@RequestMapping("/verAdminKat")
	public String ver2() {
		return "intranetHomeAdmin";
	}
	
	@RequestMapping("/cargaCuenta")
	@ResponseBody
	public List<Cuenta> listaCuenta(HttpSession session) {
		Cliente objCliente = (Cliente)	session.getAttribute("objCliente");
		return cuentaService.listaCuentaPorCliente(objCliente.getIdCliente());
	}
	
	@RequestMapping("/cargaNotificaciones")
	@ResponseBody
	public List<HistorialNotificaciones> listaNoficaciones(HttpSession session) {
		Cliente objCliente = (Cliente)	session.getAttribute("objCliente");
		return historialNotificacionesService.listaPorCliente(objCliente.getIdCliente());
	}
	
	
	@RequestMapping("/tranferencia")
	public String regTranferencia(Tranferencia x,HttpSession session) {
	
		//------------------------------
		//Cuenta de Origen
		//------------------------------
		Cuenta objCuentaOrigen = cuentaService.listaCuentaPorNumero(x.getCuentaOrigen());
		
		TipoMovimiento objTipoMov01 = new TipoMovimiento();
		objTipoMov01.setIdTipoMovimiento(Constantes.RETIRO);	
		
		HistorialCuenta obj1 = new HistorialCuenta();
		obj1.setTipoMovimiento(objTipoMov01);
		
		obj1.setMonto(x.getMonto());
		obj1.setFechaRegistro(new Date());
		obj1.setCuenta(objCuentaOrigen);
		historialCuentaService.registraHistorial(obj1);
		
		Mensaje objMensaje = mensajeService.listaMensajePorTipo(Constantes.RETIRO);
		String texto1 = objMensaje.getTexto();
		texto1 = texto1.replaceFirst("p1", objCuentaOrigen.getNumero());
		texto1 = texto1.replaceFirst("p2", String.valueOf(x.getMonto()));
		texto1 = texto1.replaceFirst("p3", objCuentaOrigen.getTipoMoneda());
		
		HistorialNotificaciones obj3 = new HistorialNotificaciones();
		obj3.setMensaje(texto1);
		obj3.setEstado("NO VISTO");
		obj3.setCliente(objCuentaOrigen.getCliente());
		
		historialNotificacionesService.registraHistorial(obj3);
		
		//------------------------------
		//Cuenta de Destino
		//------------------------------
		Cuenta objCuentaDestino = cuentaService.listaCuentaPorNumero(x.getCuentaDestino());
		
		TipoMovimiento objTipoMov02 = new TipoMovimiento();
		objTipoMov02.setIdTipoMovimiento(Constantes.DEPOSITO);	
		
		HistorialCuenta obj2 = new HistorialCuenta();
		obj2.setTipoMovimiento(objTipoMov02);
		obj2.setFechaRegistro(new Date());
		obj2.setMonto(x.getMonto());
		obj2.setCuenta(objCuentaDestino);
		historialCuentaService.registraHistorial(obj2);
		
		Mensaje objMensaje2 = mensajeService.listaMensajePorTipo(Constantes.DEPOSITO);
		String texto2 = objMensaje2.getTexto();
		texto2 = texto2.replaceFirst("p1", objCuentaDestino.getNumero());
		texto2 = texto2.replaceFirst("p2", String.valueOf(x.getMonto()));
		texto2 = texto2.replaceFirst("p3", objCuentaDestino.getTipoMoneda());
		
		HistorialNotificaciones obj4 = new HistorialNotificaciones();
		obj4.setMensaje(texto2);
		obj4.setEstado("NO VISTO");
		obj4.setCliente(objCuentaDestino.getCliente());
		
		historialNotificacionesService.registraHistorial(obj4);
		
		
		return "redirect:salidaTransferecia";
	}
	@RequestMapping("/salidaTransferecia")
	public String regTranferencia() {
		return "movimiento";
	}
	

}
