package com.bcp.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.entidad.Cuenta;
import com.bcp.repositorio.CuentaRepository;

@Service
public class CuentaServiceImpl implements CuentaService{

	@Autowired
	private CuentaRepository repository;
	
	@Override
	public List<Cuenta> listaCuentaPorCliente(int idCliente) {
		return repository.listaCuentaPorCliente(idCliente);
	}

	@Override
	public Cuenta listaCuentaPorNumero(String numero) {
		return repository.listaCuentaPorNumero(numero);
	}

}
