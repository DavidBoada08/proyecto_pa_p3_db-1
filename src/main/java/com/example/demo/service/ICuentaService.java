package com.example.demo.service;

import com.example.demo.modelo.Cuenta;

public interface ICuentaService {
	

	public void crear(Cuenta cuenta);
	
	public void modificar(Cuenta cuenta);
	public Cuenta buscar(String numero);
	public void borrar(String numero);

}
