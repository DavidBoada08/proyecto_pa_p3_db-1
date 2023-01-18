package com.example.demo.correccion.repository;

import com.example.demo.correccion.modelo.Cuenta;

public interface ICuentaRepo {
	
	public void insertar(Cuenta cuenta);
	
	public void actualizar(Cuenta cuenta);
	public Cuenta buscar(String origen);
	public void eliminar(String numero);
	

}
