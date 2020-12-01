package com.bcp.servicio;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.bcp.entidad.Cliente;
import com.bcp.entidad.Cuenta;
import com.bcp.entidad.Tranferencia;
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

	@Override
	public List<Cliente> listarPorNombre(String cuentaDes) {
		return repository.listaPorNombre(cuentaDes);
	}

	@Override
	public Cuenta acCuenta(Cuenta obj) {
			Tranferencia ra=new Tranferencia();
			Cuenta ce=new Cuenta();
			Double mon;
			 mon=ce.getSaldo()-ra.getMonto();
			 obj.setSaldo(mon);
			 obj.setNumero(ra.getCuentaOrigen());
			  repository.actualizaSaldoClie(ra.getMonto(),ra.getCuentaOrigen());
		     return repository.save(obj);
	}
	@Override
	public Cuenta acCuenta1(Cuenta obj) {
		Tranferencia ra=new Tranferencia();
		Double mon;String nm;
		mon=obj.getSaldo();
		nm=obj.getNumero();
		repository.actualizaSaldoClieMas(mon,nm);
			return  repository.save(obj);
		
	}

	@Override
	public Cuenta actualizaSaldo(Cuenta obj) {
		Tranferencia ra=new Tranferencia();
		Double mon;String nm;
		mon=obj.getSaldo();
		nm=obj.getNumero();
	    repository.actualizaSaldoClie(mon,nm);
	    return repository.save(obj);
	}

	@Override
	public List<Cliente> listarClienteporTarjeta(String var_idTarjeta) {
	return repository.listarClienteporTarjeta(var_idTarjeta);
	}
}
