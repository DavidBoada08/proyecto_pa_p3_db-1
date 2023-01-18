package com.example.demo.correccion.service;

import com.example.demo.correccion.modelo.Cuenta;

public interface ICuentaService {
	

	public void crear(Cuenta cuenta);
	
	public void modificar(Cuenta cuenta);
	public Cuenta buscar(String numero);
	public void borrar(String numero);

}
