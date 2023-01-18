package com.example.demo.correccion.repository;

import com.example.demo.correccion.modelo.Tranferencia;

public interface ITransferenciaRepo {
	
	public void insertar(Tranferencia Tranferencia);
	public Tranferencia buscar(Integer id);
	

}
