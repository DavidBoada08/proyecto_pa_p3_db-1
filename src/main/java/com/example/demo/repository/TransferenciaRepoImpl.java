package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Tranferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TransferenciaRepoImpl implements ITransferenciaRepo {
	
	@PersistenceContext 
	private EntityManager entityManager ;

	@Override
	public void insertar(Tranferencia Tranferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(Tranferencia);
		
	}

	@Override
	public Tranferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Tranferencia.class, id);
	}

}
