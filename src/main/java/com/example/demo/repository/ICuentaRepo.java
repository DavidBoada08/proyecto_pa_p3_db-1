package com.example.demo.repository;

import com.example.demo.modelo.Cuenta;

public interface ICuentaRepo {
	
	public void insertar(Cuenta cuenta);
	
	public void actualizar(Cuenta cuenta);
	public Cuenta buscar(String numero);
	public void eliminar(String numero);
	

}
