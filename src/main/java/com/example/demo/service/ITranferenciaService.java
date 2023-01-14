package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.modelo.Cuenta;
import com.example.demo.modelo.Tranferencia;

public interface ITranferenciaService {
	
	public void agregar(Tranferencia Tranferencia);
	public Tranferencia buscar(Integer id);
	public void generar(String origen,String destino, BigDecimal monto);

	


}
