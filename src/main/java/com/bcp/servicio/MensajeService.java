package com.bcp.servicio;

import com.bcp.entidad.Mensaje;

public interface MensajeService {

	public abstract Mensaje listaMensajePorTipo(int idTipo);
}
