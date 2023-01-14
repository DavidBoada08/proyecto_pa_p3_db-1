package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Cuenta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaRepoImpl implements ICuentaRepo {
	
	@PersistenceContext 
	private EntityManager entityManager ;


	@Override
	public void insertar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuenta);
		
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuenta);
	}

	@Override
	public Cuenta buscar(String numero) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cuenta.class, numero);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		
		Cuenta cuenta = this.buscar(numero);
		
		this.entityManager.remove(cuenta);
		
	}

}
