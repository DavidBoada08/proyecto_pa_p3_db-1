package com.example.demo.service;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cuenta;
import com.example.demo.modelo.Tranferencia;
import com.example.demo.repository.ITransferenciaRepo;

@Service
public class TransferenciaServiceImpl implements ITranferenciaService  {
	
	@Autowired
	private ITransferenciaRepo TransferenciaRepo;

	@Override
	public void agregar(Tranferencia Tranferencia) {
		// TODO Auto-generated method stub
		
		this.TransferenciaRepo.insertar(Tranferencia);
		
	}

	@Override
	public Tranferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.TransferenciaRepo.buscar(id);
	}

	@Override
	public Tranferencia generar(Cuenta cuenta, BigDecimal monto, BigDecimal comision) {
		// TODO Auto-generated method stub
	
		return null;
	}

	

}
