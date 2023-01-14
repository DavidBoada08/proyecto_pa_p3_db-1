package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cuenta;
import com.example.demo.repository.ICuentaRepo;
@Service
public class CuentaServiceImpl implements ICuentaService {
	
	@Autowired
	private ICuentaRepo cuentaRepo;

	@Override
	public void crear(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepo.insertar(cuenta);
		
	}

	@Override
	public void modificar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepo.actualizar(cuenta);
		
	}

	@Override
	public Cuenta buscar(String numero) {
		
		// TODO Auto-generated method stub
		
		return this.cuentaRepo.buscar(numero);
	}

	@Override
	public void borrar(String numero) {
		this.cuentaRepo.eliminar(numero);
		
	}

}
