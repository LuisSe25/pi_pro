package com.bcp.servicio;

import java.util.List;

import com.bcp.entidad.Cuenta;


public interface CuentaService {

	public abstract List<Cuenta>  listaCuentaPorCliente(int idCliente);
	public abstract Cuenta listaCuentaPorNumero(String numero);
	
}
