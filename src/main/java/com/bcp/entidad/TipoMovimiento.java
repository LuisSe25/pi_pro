package com.bcp.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipomovimiento")
public class TipoMovimiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoMovimiento;
	private String nombre;
}
