package com.example.demo.repository;

import com.example.demo.modelo.Tranferencia;

public interface ITransferenciaRepo {
	
	public void insertar(Tranferencia Tranferencia);
	public Tranferencia buscar(Integer id);
	

}
