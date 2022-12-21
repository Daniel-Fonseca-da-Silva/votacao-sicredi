package com.votacao.sicredi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.votacao.sicredi.model.Associado;

@Repository
public class AssociadoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<Associado> buscaTodosAssociados() {
		Query query = entityManager.createQuery("SELECT a FROM Associado a", Associado.class);
		return query.getResultList();
	}

}
