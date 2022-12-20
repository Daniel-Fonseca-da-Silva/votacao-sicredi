package com.votacao.sicredi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.votacao.sicredi.model.Pauta;

@Repository
public class PautaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Pauta> buscaTodasAsPautas() {
		Query query = entityManager.createQuery("SELECT p FROM Pauta p", Pauta.class);
		return query.getResultList();
	}
}
