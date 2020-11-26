package com.bcp.servicio;

import java.util.List;

import com.bcp.entidad.HistorialNotificaciones;

public interface HistorialNotificacionesService {
	
	public abstract HistorialNotificaciones  registraHistorial(HistorialNotificaciones obj);
	
	public abstract List<HistorialNotificaciones>  listaPorCliente(int idCliente);
}
